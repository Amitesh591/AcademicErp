package org.iiitb.service.impl;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.iiitb.bean.Domain;
import org.iiitb.bean.Student;
import org.iiitb.service.StudentService;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    
    @Override
    public void save(Student student,
                     InputStream photograph,
                     FormDataContentDisposition fileDetail,
                     Integer domainId) {
        
        Domain domain = domainService.find(domainId);
        student.setDomain(domain);
        
        String rollNumber = generateRollNumber(domain);
        student.setRollNumber(rollNumber);
    
        String photographPath = "images/student/" + rollNumber + "_" + fileDetail.getFileName();
        if (!fileService.upload(photograph, photographPath))
            System.out.println("File Upload Error!");
        else {
            student.setPhotograph(photographPath);
            studentDao.save(student);
        }
    }

    @Override
    public void update(Student student, InputStream photograph, FormDataContentDisposition fileDetail, Integer domainId) {
        Domain domain = domainService.find(domainId);
        student.setDomain(domain);

        String rollNumber = generateRollNumber(domain);
        student.setRollNumber(rollNumber);



            studentDao.update(student);

    }

    @Override
    public Student find(Integer id) {
        return studentDao.find(id);
    }

    @Override
    public Integer findId(String emailId) {
        return studentDao.findId(emailId);
    }

    @Override
    public Student findByRollNumber(String rollNumber) {
        return studentDao.findByRollNumber(rollNumber);
    }
    
    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }
    
    private String generateRollNumber(Domain domain) {
        String lastRollNumber = studentDao.getLastRollNumber(domain);
        Integer newSerialNumber;
        if (lastRollNumber == null)
            newSerialNumber = 1;
        else {
            String serialNumber = lastRollNumber.substring(lastRollNumber.length() - 3);
            newSerialNumber = Integer.parseInt(serialNumber) + 1;
        }
        String tempSerialNumber = newSerialNumber.toString();
        switch (tempSerialNumber.length()) {
            case 1:
                tempSerialNumber = "00" + tempSerialNumber;
                break;
            case 2:
                tempSerialNumber = "0" + tempSerialNumber;
                break;
            default:
                break;
        }
        String currentYear = new SimpleDateFormat("yyyy").format(new Date());
        String newRollNumber = domain.getCode() + currentYear + tempSerialNumber;
        return newRollNumber;
    }
}
