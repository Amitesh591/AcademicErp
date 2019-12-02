package org.iiitb.controller;

import org.iiitb.bean.Domain;
import org.iiitb.service.DomainService;
import org.iiitb.service.impl.DomainServiceImpl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;


@Path("/domain")
public class DomainController {
    private DomainService domainService = new DomainServiceImpl();
    
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response listDomains() {
        
        List<Domain> domains = domainService.findAll();
        
        return Response.ok().entity(domains).build();
    }
}
