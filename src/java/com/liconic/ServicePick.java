/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liconic;

import java.io.IOException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBException;

/**
 *
 * @author Rucha Deshpande
 */
@Path("/pick")
public class ServicePick {
    
    ServiceDao dao = ServiceDao.getInstance();
    
   @POST
   @Consumes(MediaType.APPLICATION_JSON)
   public Response pickTubes(RequestBody request) throws JAXBException, IOException{
       
     Response response = dao.pickTubes(request);
     return response;
   }
    
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String sayPlainTextHello() {
    
   return "Connection Successful";
  }
  
    @GET
   @Path("/{id}")
  @Produces(MediaType.TEXT_PLAIN)
   public Response getTubeInfo(@PathParam("id") String user ){
        return Response.status(200).entity(user).build();
   }
}
