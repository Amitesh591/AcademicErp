package org.iiitb.controller;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.iiitb.bean.Student;
import org.iiitb.service.StudentService;
import org.iiitb.service.impl.StudentServiceImpl;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@Path("/student")
public class StudentController {
    private StudentService studentService = new StudentServiceImpl();
    
    @POST
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Produces(MediaType.TEXT_PLAIN)
    public Response addStudent(@FormDataParam("firstName") String firstName,
                               @FormDataParam("middleName") String middleName,
                               @FormDataParam("lastName") String lastName,
                               @FormDataParam("emailId") String emailId,
                               @FormDataParam("domainId") Integer domainId,
                               @FormDataParam("photograph") InputStream photograph,
                               @FormDataParam("photograph") FormDataContentDisposition fileDetail) throws URISyntaxException {
        
        Integer idTemp=studentService.findId(emailId);
        Student student = studentService.find(idTemp);
        System.out.println("post service "+student);
        student.setFirstName(firstName);
        student.setMiddleName(middleName);
        student.setLastName(lastName);
        student.setEmailId(emailId);
        
        studentService.update(student, photograph, fileDetail, domainId);
        return Response.seeOther(new URI("/academic_erp_war/studentlist.html")).build();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response showAllStudent() {
        List<Student> studentList = studentService.findAll();
        if (studentList == null)
            return Response.noContent().build();
        return Response.ok().entity(studentList).build();
    }
}
