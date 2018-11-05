/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liconic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import javax.ws.rs.core.Response;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Rucha Deshpande
 */
public class Service {
    
    String DB_DRIVER = "org.firebirdsql.jdbc.FBDriver";
    String DBConnectString = "jdbc:firebirdsql://localhost:3050/D:\\Data\\Liconic\\DB\\STXDRV.GDB";
    private ArrayList<Job> joblist = new ArrayList<Job>();
    private static Service instance;   
    
    public static Service getInstance(){
        if(instance == null)
        instance = new Service();
        return instance;
    }
public Response getJobs(long timestamp, int pageSize, int pageNumber) throws ParseException {
   
    if(pageSize > 500)
    {
        return Response.status(400).entity("Maximum allowable page size is 500, requested page size is " + pageSize).build();
    }
   java.util.Date time=new java.util.Date((long)(timestamp)*1000);
   SimpleDateFormat dateFormatter = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss.SSS");
   String date = dateFormatter.format(time);
//   System.out.println(date);
    joblist.clear();
        try{         
         Class.forName(DB_DRIVER);         
         Connection con = DriverManager.getConnection(DBConnectString,"SYSDBA", "masterkey");
        
         
         String query = "select id1, job_type, user_name,\n" +
"CAST(Date_Created AS DATE) Date_Created,\n" +
"CAST(Date_Updated AS DATE) Date_Updated,\n" +
"done, plate_bcr\n" +
"\n" +
"FROM (select id1, job_type, user_name,\n" +
"min(status_time) Date_Created,\n" +
"max(status_time) Date_Updated,\n" +
"done, plate_bcr from\n" +
"(\n" +
"select s1.*\n" +
"from (select jobs.id_job id1, job_types.job_type, users.user_name, task_link_status.status_time,\n" +
"task_status.task_status, done, plate_bcr from jobs\n" +
"inner join tasks on tasks.link_job = jobs.id_job\n" +
"inner join task_link_status on task_link_status.link_task = tasks.id_task\n" +
"inner join task_status on task_status.id_task_status = task_link_status.link_status\n" +
"inner join task_types on task_types.id_task_type = tasks.task_type\n" +
"inner join job_types on job_types.id_job_type = jobs.job_type\n" +
"inner join users on users.id_user = jobs.link_user\n" +
"inner join task_src_link_trg on task_src_link_trg.link_task = tasks.id_task\n" +
"inner join plate_link_task on plate_link_task.link_task = task_src_link_trg.id_src_link_trg\n" +
"inner join plates on plates.id_plate = plate_link_task.link_plate) s1\n" +
"inner join\n" +
"(\n" +
"select id_job id2, max(task_link_status.status_time) as maxts\n" +
"from jobs\n" +
"inner join tasks on tasks.link_job = jobs.id_job\n" +
"inner join task_link_status on task_link_status.link_task = tasks.id_task\n" +
"inner join task_status on task_status.id_task_status = task_link_status.link_status\n" +
"inner join task_types on task_types.id_task_type = tasks.task_type\n" +
"inner join job_types on job_types.id_job_type = jobs.job_type\n" +
"inner join users on users.id_user = jobs.link_user\n" +
"group by id_job, done)s2\n" +
"on s2.id2 = s1.id1 and s1.status_time = s2.maxts\n" +
"union all\n" +
"select s1.*\n" +
"from (select jobs.id_job id1, job_types.job_type, users.user_name, task_link_status.status_time,\n" +
"task_status.task_status, done, plate_bcr from jobs\n" +
"inner join tasks on tasks.link_job = jobs.id_job\n" +
"inner join task_link_status on task_link_status.link_task = tasks.id_task\n" +
"inner join task_status on task_status.id_task_status = task_link_status.link_status\n" +
"inner join task_types on task_types.id_task_type = tasks.task_type\n" +
"inner join job_types on job_types.id_job_type = jobs.job_type\n" +
"inner join users on users.id_user = jobs.link_user\n" +
"inner join task_src_link_trg on task_src_link_trg.link_task = tasks.id_task\n" +
"inner join plate_link_task on plate_link_task.link_task = task_src_link_trg.id_src_link_trg\n" +
"inner join plates on plates.id_plate = plate_link_task.link_plate) s1\n" +
"inner join\n" +
"(\n" +
"select id_job id2, min(task_link_status.status_time) as mins\n" +
"from jobs\n" +
"inner join tasks on tasks.link_job = jobs.id_job\n" +
"inner join task_link_status on task_link_status.link_task = tasks.id_task\n" +
"inner join task_status on task_status.id_task_status = task_link_status.link_status\n" +
"inner join task_types on task_types.id_task_type = tasks.task_type\n" +
"inner join job_types on job_types.id_job_type = jobs.job_type\n" +
"inner join users on users.id_user = jobs.link_user\n" +
"group by id_job, done)s2\n" +
"on s2.id2 = s1.id1 and s1.status_time = s2.mins\n" +
") group by id1, job_type, user_name, done, plate_bcr\n" +
"order by id1 desc\n" +
"rows "+ ((pageNumber -1) * pageSize + 1) +" to " + (pageNumber * pageSize)+
") where date_updated >= '"+date+"'";
         
         
   //System.out.println(query);
         PreparedStatement stat;
          ResultSet rs1 ;
          String query1 = " select tubes.tube_bcr, tube_x,tube_y from   \n" +
"  jobs inner join tasks on jobs.id_job = tasks.link_job\n" +
"  inner join task_src_link_trg on task_src_link_trg.link_task = tasks.id_task\n" +
"  inner join plate_link_task on plate_link_task.link_task = task_src_link_trg.id_src_link_trg\n" +
"  inner join plates on plates.id_plate = plate_link_task.link_plate\n" +
"  inner join plate_link_tube_pos on  plate_link_tube_pos.link_plate = plates.id_plate\n" +
"  inner join tube_positions on tube_positions.id_tube_position = plate_link_tube_pos.link_tube_pos\n" +
"  inner join tubes_link_plate on tubes_link_plate.link_pos =plate_link_tube_pos.id_link_tube_pos\n" +
"  inner join tubes on tubes.id_tube = tubes_link_plate.link_tube\n" +
"where id_job =?";
          
          stat = con.prepareStatement(query1);
          
           Statement stmt = con.createStatement();
          
         ResultSet rs = stmt.executeQuery(query);
         while (rs.next()) 
         {
            Job job = new Job();
            job.setId(rs.getInt(1));
            job.setJobType(rs.getString(2));
            job.setUserName(rs.getString(3));
            job.setDateCreated(rs.getTimestamp(4));
            job.setDateUpdated(rs.getTimestamp(5));
            job.setDone(rs.getString(6));
            job.setPlateBCR(rs.getString(7));
            joblist.add(job);
         }
         
         int count = 0, x =0,y=0,m=0;
         char b;
         JSONArray obj = new JSONArray();
         for(Job job : joblist)
         {
          
             count++;
             String status;
             JSONObject jobObj = new JSONObject();
             jobObj.put("jobId",job.getId());
             
             if(job.getJobType().equals("Job File"))  
                 jobObj.put("jobType", "Pick Job");
             else
                 jobObj.put("jobType", job.getJobType());

             jobObj.put("user", job.getUserName());
            
            DateFormat dfm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");  
            long dateCreated,dateUpdated;
            dfm.setTimeZone(TimeZone.getTimeZone("GMT-4"));

            dateCreated = dfm.parse(job.getDateCreated().toString()).getTime();  
            dateCreated=dateCreated/1000;
            dateUpdated = dfm.parse(job.getDateUpdated().toString()).getTime();  
            dateUpdated=dateUpdated/1000;
            
             jobObj.put("dateCreated", dateCreated);
             jobObj.put("dateUpdated", dateUpdated);
             
             if(Integer.parseInt(job.getDone()) == 1)
                 status = "completed";
             else
                 status = "Created";
             
             jobObj.put("status",status);
             
            List<String> tubeBarcode = new ArrayList<String>();          
            List<String> tubeLocation = new ArrayList<String>();
            
            stat.setInt(1, job.getId());
            
            rs1 = stat.executeQuery();
               while (rs1.next()) 
             {
                 
                 tubeBarcode.add(rs1.getString("tube_bcr"));
                  x= rs1.getInt("tube_x");
                  y = rs1.getInt("tube_y");
                  b =(char)(64+y);
                 StringBuilder sb = new StringBuilder();
                 sb.append(b);
                 sb.append(x);              
                 tubeLocation.add(sb.toString());
             }
//           //  System.out.println("Breakdown1");
              JSONArray tubes = new JSONArray();
              for(int i =0; i<tubeBarcode.size();i++)
              {
                 JSONObject tube = new JSONObject();
                 tube.put("barcode", tubeBarcode.get(i));
                 tube.put("location", tubeLocation.get(i));
                 tubes.put(tube);
              }
             String rackBarcode = job.getPlateBCR();
             JSONObject data = new JSONObject();
             data.put("rackBarcode",rackBarcode);  
             data.put("tubes", tubes);
             jobObj.put("data", data);
             obj.put(jobObj);
         }
         //System.out.println("C");
         if(count > 2000)
         {
             return Response.status(400).entity("Query found " + count + " number of results, which is greater than the maximum returnable number of 2000.").build();
         }
     //   System.out.println("All jobs: "+ obj.toString());
         con.close();
         return Response.status(200).entity(obj.toString()).build(); 
     }
     catch(Exception e)
     {
         return Response.status(500).entity("Some other error: " + e.getMessage()).build();
     }
        
    }

}
