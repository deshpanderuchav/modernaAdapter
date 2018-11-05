/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liconic;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
    * @author Rucha Deshpande
    */
 @Path("/listjobs")
public class ContinueTasks {
    @GET
  @Produces(MediaType.TEXT_PLAIN)
  public Response sayPlainTextHello() {
       ServiceDao dao = ServiceDao.getInstance();
           return dao.ContinueTasks();
  }
}
