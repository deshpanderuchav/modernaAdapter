/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liconic;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
/**
 *
 * @author Rucha Deshpande
 */


  @Path("/jobs")
public class ServiceJobs {
  @GET  
  @Produces(MediaType.TEXT_PLAIN)
  public Response getJobs(@DefaultValue("1420088400") @QueryParam("lastUpdated") long timestamp, 
         @DefaultValue("500") @QueryParam("pageSize") int pageSize,@DefaultValue("1") @QueryParam("pageNumber") int pageNumber) throws ParseException
  {
     ServiceDao dao = ServiceDao.getInstance();
     return dao.getJobs(timestamp, pageSize, pageNumber);
  }
}
