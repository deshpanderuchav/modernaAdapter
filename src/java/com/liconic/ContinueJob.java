package com.liconic;
import com.liconic.ServiceDao;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.PUT;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rucha Deshpande
 */
  @Path("/continue")
public class ContinueJob {
   
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String sayPlainTextHello() {
   return "Connection Successful";
  }
     
  @PUT
  @Path("/{id}")
  @Produces(MediaType.TEXT_PLAIN)
  public Response continueJob(@PathParam("id") int jobId) throws ClassNotFoundException, FileNotFoundException, SQLException 
  {
      ServiceDao dao = ServiceDao.getInstance();
           return dao.continueJob(jobId);
  }
}
