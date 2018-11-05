package com.liconic;


import com.liconic.ServiceDao;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import javax.ws.rs.GET;
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
@Path("job")
public class JobData {
  
  @GET
  @Path("/{id}/data")
  @Produces(MediaType.TEXT_PLAIN)
  public Response getJobStatus(@PathParam("id") int jobId) throws ClassNotFoundException, FileNotFoundException, SQLException 
  {
      ServiceDao dao = ServiceDao.getInstance();
           return dao.jobData(jobId);
  }
  
  @GET
   @Path("data")
  @Produces(MediaType.TEXT_PLAIN)
  public String getJob()
  {
      return "successful";
  }
}
