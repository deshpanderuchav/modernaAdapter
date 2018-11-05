/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liconic;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
/**
 *
 * @author Rucha Deshpande
 */
@Path("/doinventory")
public class Service2D {
  
  @Path("/1D/{partition}")
  @GET  
  @Produces(MediaType.TEXT_PLAIN)
  public Response get1DInventory(@PathParam("partition") String partition)
  {
     ServiceDao dao = ServiceDao.getInstance();
     return dao.get1DInventory(partition);
  }
  
  @Path("/2D/{partition}")
  @GET  
  @Produces(MediaType.TEXT_PLAIN)
  public Response get2DInventory(@PathParam("partition") String partition)
  {
     ServiceDao dao = ServiceDao.getInstance();
     return dao.get2DInventory(partition);
  }
  
    @Path("/2D/cassttes")
  @GET  
  @Produces(MediaType.TEXT_PLAIN)
  public Response get2DCassettes(@QueryParam("firstCassette") int first, @QueryParam("lastCassette") int last)
  {
     ServiceDao dao = ServiceDao.getInstance();
     return dao.get2DCassettes(first,last);
  }
  
  
 
    
}
