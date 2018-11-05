/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liconic;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Rucha Deshpande
 */

@Path("jobs")
public class ServiceJobStatus {
  @GET
  @Path("/{id}/status")
  @Produces(MediaType.TEXT_PLAIN)
  public Response getJobStatus(@PathParam("id") int jobId) throws ClassNotFoundException, FileNotFoundException, SQLException 
  {
      ServiceDao dao = ServiceDao.getInstance();
           return dao.jobStatus(jobId);
  }
}