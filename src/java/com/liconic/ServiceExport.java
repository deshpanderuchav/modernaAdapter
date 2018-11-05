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
@Path("/export")
public class ServiceExport  {
    ServiceDao dao = ServiceDao.getInstance();
   @POST
   @Consumes(MediaType.APPLICATION_JSON)
   public Response exportPlates(RequestBody request) throws JAXBException, IOException{
       
       Response response = dao.exportPlates(request);
       return response;
   }
   
   
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public RequestBody sayPlainTextHello() {
      RequestBody request = new RequestBody();
      request.setEmpty(false);
      request.setUser("Rucha");
      return request;
  }
    
 @GET
 @Path("/{id}")
 @Produces(MediaType.TEXT_PLAIN)
 public Response getTubeInfo(@PathParam("id") String user ){
        return Response.status(200).entity(user).build();
   }
   
   
}

