/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liconic;

import java.sql.Timestamp;

/**
 *
 * @author Rucha Deshpande
 */
public class Job {
    private String job_type, user_nmae, done, plate_bcr;
    Timestamp date_created, date_updated;
    private int id;
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public int getId()
    {
        return id;
    }
    
    public void setJobType(String job_type)
    {
        this.job_type = job_type;
    }
    
     public String getJobType()
    {
        return job_type;
    }
    
    public void setUserName(String user_nmae)
    {
        this.user_nmae = user_nmae;
    }
    
    public String getUserName()
    {
        return user_nmae;
    }
    
    public void setDone(String done)
    {
        this.done = done;
    }
    
    public String getDone()
    {
        return done;
    }
    
    public void setPlateBCR(String plate_bcr)
    {
        this.plate_bcr = plate_bcr;
    }
    
     public String getPlateBCR()
    {
        return plate_bcr;
    }
     
     public void setDateCreated(Timestamp date_created)
    {
        this.date_created = date_created;
    }
    
     public Timestamp getDateCreated()
    {
        return date_created;
    }
     
      public void setDateUpdated(Timestamp date_updated)
    {
        this.date_updated = date_updated;
    }
    
     public Timestamp getDateUpdated()
    {
        return date_updated;
    }
        
}
