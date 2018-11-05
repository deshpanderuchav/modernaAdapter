/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liconic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rucha Deshpande
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class RequestBody {
    @XmlElement String user;
    @XmlElement Boolean empty;
    @XmlElement String rackBarcode;
    @XmlElement String rackType;
    @XmlElement String scan;
    @XmlElement String pickJobId ="0";
    @XmlElement int jobId;
    @XmlElement String jobType;
    @XmlElement String status;
    @XmlElement private Data data;  
    
    
    public void setEmpty(boolean empty)
    {
        this.empty = empty;
    }
    
    public void setScan(String scan)
    {
        this.scan = scan;
    }
    
    public void setjobId(int jobId)
    {
        this.jobId = jobId;
    }
    
    public void setjobType(String jobType)
    {
        this.jobType = jobType;
    }
    
     public void setStatus(String status)
    {
        this.status = status;
    }
    
    public void setUser(String user)
    {
        this.user = user;
    }
    
    public void setrackBarcode(String rackBarcode)
    {
        this.rackBarcode = rackBarcode;
    }
    
    public void setrackType(String rackType)
    {
        this.rackType = rackType;
    }
    
    public boolean getEmpty()
    {
        return empty;
    }
    
    
     public String getjobType()
    {
        return jobType;
    }
    
     public String getStatus()
    {
        return status;
    }
     
       public int getjobId()
    {
        return jobId;
    }
       
    public String getScan()
    {
        return scan;
    }
    
    public String getPickJobId()
    {
        return this.pickJobId = pickJobId;        
    }
    public String getUser()
    {
        return user;
    }
    
    public String getrackBarcode() {
        return rackBarcode;
    }
    
    public String getrackType()
    {
        return rackType;
    }
    
    private ArrayList<Tube> tubes;

  public ArrayList<Tube> getTubes() { return this.tubes; }

  public void setTubes(ArrayList<Tube> tubes) { this.tubes = tubes; }
  
    public Data getData() 
  { return this.data; }

  public void setData(Data data) 
  { this.data = data; }


}

