package com.liconic;


import java.io.IOException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBException;


@Path("/import")
public class ServiceImport  {
    
   ServiceDao dao = ServiceDao.getInstance();
   
   @POST
   @Consumes(MediaType.APPLICATION_JSON)
   public Response importPlates(RequestBody request) throws JAXBException, IOException{
       
       Response response = dao.importPlates(request);
    
      return response;
   }


  @GET
  @Produces(MediaType.TEXT_PLAIN)
   public String getTubeInfo(){
        return "Connection Successful";
   }
   
   
}