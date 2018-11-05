/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liconic;

import com.liconic.binding.xmlcontent.ObjectFactory;
import com.liconic.binding.xmlcontent.STXCommand;
import com.liconic.binding.xmlcontent.STXParameter;
import com.liconic.binding.xmlcontent.STXPlate;
import com.liconic.binding.xmlcontent.STXRequest;
import com.liconic.binding.xmlcontent.STXTubePos;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.InputStream;
import java.io.StringReader;
import java.math.BigInteger;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.Timer;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.Unmarshaller;
import static jdk.nashorn.internal.objects.ArrayBufferView.buffer;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import static org.apache.tomcat.jni.Shm.buffer;
import org.json.JSONArray;
import org.json.JSONObject;
/**
 *
 * @author Rucha Deshpande
 */
public class ServiceDao {
    private String uri;
    private static ServiceDao instance;    
    ObjectFactory of = new ObjectFactory();
       //  private List<String> listTubes = new ArrayList<String>();   
 //   STXRequest request = (STXRequest)(of.createSTXRequest());
    private String paths;
    private String DBUser = "";
    private String DBPswd = "";
    private String DBHost = "";
    private String DBPath = "";
    private String DB_DRIVER = "";
    private String DBConnectString="";
    private List<String> listTubes = new ArrayList<String>();          
    private List<String> listLocation = new ArrayList<String>();
    private ArrayList<Job> joblist = new ArrayList<Job>();
    
public static ServiceDao getInstance(){
        
        if(instance == null)
        instance = new ServiceDao();
        return instance;
    }
public Response get1DInventory(String partition){
     STXRequest request = (STXRequest)(of.createSTXRequest());
     STXCommand command = (STXCommand) (of.createSTXCommand());
     command.setID(5);
     command.setCmd("Inventory");
     command.setUser("ADMIN");
     command.setPartition(partition);
     request.setCommand(command);
     
     Client client = ClientBuilder.newClient();
     WebTarget target = client.target("http://localhost:8080/LiconicScheduler/webresources/invenotry");
    STXRequest response = target.request().post(Entity.entity(request, MediaType.APPLICATION_XML), STXRequest.class);
    try {
         if(response.getAnswer().getStatus().equals("OK"))
         {
            String jsonreply = "{\n" +
                    "    \"jobId\": "+ request.getCommand().getID() + "\n" +
                    "}";
        return  Response.ok(jsonreply,MediaType.APPLICATION_JSON).build();
        }
    } 
    catch(Exception e) {
    return Response.status(500).entity("No response from server, try again" + e.getMessage()).build();
    } 
    return Response.status(500).entity("Job was not submitted successfully, please try again").build();
}

public Response get2DInventory(String partition){
     STXRequest request = (STXRequest)(of.createSTXRequest());
     STXCommand command = (STXCommand) (of.createSTXCommand());
     command.setID(5);
     command.setCmd("Inventory");
     command.setUser("ADMIN");
     command.setPartition(partition);
     STXParameter parameter = (STXParameter) (of.createSTXParameter());
     parameter.setParameter("2D Scan");
     parameter.setValue("true");
     command.getParameters().add(parameter);     
     request.setCommand(command);
     
     Client client = ClientBuilder.newClient();
     WebTarget target = client.target("http://localhost:8080/LiconicScheduler/webresources/inventory");
     STXRequest response = target.request().post(Entity.entity(request, MediaType.APPLICATION_XML), STXRequest.class);
     try {
         if(response.getAnswer().getStatus().equals("OK"))
         {
            String jsonreply = "{\n" +
                    "    \"jobId\": "+ request.getCommand().getID() + "\n" +
                    "}";
            return  Response.ok(jsonreply,MediaType.APPLICATION_JSON).build();
        }
    } 
    catch(Exception e) {
    return Response.status(500).entity("No response from server, try again" + e.getMessage()).build();
    } 
    return Response.status(500).entity("Job was not submitted successfully, please try again").build();
}

public Response get2DCassettes(int first, int last){
     STXRequest request = (STXRequest)(of.createSTXRequest());
     STXCommand command = (STXCommand) (of.createSTXCommand());
     command.setID(5);
     command.setCmd("Inventory");
     command.setUser("ADMIN");
     STXParameter parameter = (STXParameter) (of.createSTXParameter());
      
     parameter.setParameter("Device");
     parameter.setValue("STXPlateStore");
     command.getParameters().add(parameter);   
     
     parameter.setParameter("First Cassette");
     parameter.setValue(Integer.toString(first));
     command.getParameters().add(parameter);  
     
     
     parameter.setParameter("Last Cassette");
     parameter.setValue(Integer.toString(last));
     command.getParameters().add(parameter);  
     
     
     parameter.setParameter("2D Scan");
     parameter.setValue("true");
     command.getParameters().add(parameter);  
     request.setCommand(command);
     
     
     Client client = ClientBuilder.newClient();
     WebTarget target = client.target("http://localhost:8080/LiconicScheduler/webresources/inventory");
     STXRequest response = target.request().post(Entity.entity(request, MediaType.APPLICATION_XML), STXRequest.class);
     try {
         if(response.getAnswer().getStatus().equals("OK"))
         {
            String jsonreply = "{\n" +
                    "    \"jobId\": "+ request.getCommand().getID() + "\n" +
                    "}";
            return  Response.ok(jsonreply,MediaType.APPLICATION_JSON).build();
        }
    } 
    catch(Exception e) {
    return Response.status(500).entity("No response from server, try again" + e.getMessage()).build();
    } 
    return Response.status(500).entity("Job was not submitted successfully, please try again").build();
}

public Response importPlates(RequestBody json) throws JAXBException, UnsupportedEncodingException, IOException{
    
    STXRequest request = (STXRequest)(of.createSTXRequest());
        String jsonreply;
        Response response = null;
        STXCommand command = (STXCommand) (of.createSTXCommand());
        command.setID(0);
        command.setCmd("ImportFromXfer");
       // System.out.println("Plate barcode: " + json.getrackBarcode() );
        
        command.setUser(json.getUser());
            
        STXParameter parameter = (STXParameter) (of.createSTXParameter());
        
        parameter.setParameter("Scan");
        
        if(json.empty==true)
        {
          parameter.setValue(json.getScan());  
        }
        
        else
        {
            parameter.setValue("true");
        }
        
        command.getParameters().add(parameter);
        
        request.setCommand(command);
        
        STXPlate plate = (STXPlate) (of.createSTXPlate());
        
        plate.setPltBCR(json.getrackBarcode());
        
        
        if(json.getrackType().equals("Fluid-x 96"))
        {
            plate.setPltType(1);
        }
        
        else if(json.getrackType().equals("Fluid-x 24"))
        {
            plate.setPltType(0);
        }
        
        if(json.getEmpty()==true)
        {
            STXTubePos tubePos = (STXTubePos) (of.createSTXTubePos());
            
            tubePos.setPX((byte) 1);
            tubePos.setPY((byte) 1);
            tubePos.setPYA("A");            
            tubePos.setPTV(BigInteger.valueOf(plate.getPltType()));
            plate.getPltTPos().add(tubePos);
        }
        
        else if (json.getEmpty()==false)
        {
            if(plate.getPltType()==1)
            {
                for(int i = 1; i<=12; i++)
                {
                    char pya = 'A';
                    for(int j=1;j<=8;j++)
                    {
                        STXTubePos tubePos = (STXTubePos) (of.createSTXTubePos());
                        tubePos.setPX((byte) i);
                        tubePos.setPY((byte) j);
                        tubePos.setPYA(String.valueOf((pya)));
                        tubePos.setPTV(BigInteger.valueOf(plate.getPltType()));
                        plate.getPltTPos().add(tubePos); 
                        pya++;
                    }
                }
            }
            
            else if(plate.getPltType()==0)
            {
                for(int i = 1; i<=6; i++)
                {
                    char pya = 'A';
                    for(int j=1;j<=4;j++)
                    {
                        STXTubePos tubePos = (STXTubePos) (of.createSTXTubePos());
                        tubePos.setPX((byte) i);
                        tubePos.setPY((byte) j);
                        tubePos.setPYA(String.valueOf((pya)));
                        tubePos.setPTV(BigInteger.valueOf(plate.getPltType()));
                        plate.getPltTPos().add(tubePos); 
                        pya++;
                    }
                }
            }
        }
        request.getPlates().add(plate);
        JAXBContext context = JAXBContext.newInstance(STXRequest.class); //Create Marshaller using JAXB context
        Marshaller marshaller = context.createMarshaller(); 
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);   //Do the marshal operation
        //marshaller.marshal(json,System.out);
        java.io.StringWriter inputXML = new StringWriter();
        marshaller.marshal(request,inputXML); 
        System.out.println("Request in XML:\n"+inputXML.toString());
        String xmlResponse = "";
         HttpClient httpClient = new DefaultHttpClient();
    try {
      HttpPost postRequest = new HttpPost("http://localhost:80/LiconicScheduler/webresources/import");
      postRequest.setHeader("Content-Type", "application/xml");
      
      String xmlRequest = inputXML.toString();
      
      HttpEntity entity = new ByteArrayEntity(xmlRequest.getBytes("UTF-8"));
    postRequest.setEntity(entity);
      
      HttpResponse httpResponse = httpClient.execute(postRequest);
      byte[] buffer = new byte[1024];
      if (httpResponse != null) {
        InputStream inputStream = httpResponse.getEntity().getContent();
        try {
          int bytesRead = 0;
          BufferedInputStream bis = new BufferedInputStream(inputStream);
          StringBuilder stringBuilder = new StringBuilder();
          while ((bytesRead = bis.read(buffer)) != -1) {
          stringBuilder.append(new String(buffer, 0, bytesRead));
          }
          //String Response
          System.out.println(stringBuilder.toString());
         xmlResponse  = stringBuilder.toString();
          
        } catch (Exception e) {
          e.printStackTrace();
        } finally {
          try { inputStream.close(); } catch (Exception ignore) {}
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      httpClient.getConnectionManager().shutdown();
    }
    
    JAXBContext jaxbContext = JAXBContext.newInstance(STXRequest.class);
    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

    StringReader reader = new StringReader(xmlResponse);
  request = (STXRequest) unmarshaller.unmarshal(reader);
  
  if(request.getAnswer().getStatus().equals("OK"))
  {
     jsonreply = "{\n" +
"    \"jobId\": "+ request.getCommand().getID() + "\n" +
"}";
     return  Response.ok(jsonreply,MediaType.APPLICATION_JSON).build();
  }
  
  else if(request.getAnswer().getStatus().equals("ERR"))
  {
      return Response.status(400).entity(request.getAnswer().getErrMsg()).build();
  }
  
  return Response.status(500).entity("Some other error").build();
    }
    
public Response pickTubes(RequestBody json) throws JAXBException {
       
        STXRequest request = (STXRequest)(of.createSTXRequest());
        Response response = null;
        STXCommand command = (STXCommand) (of.createSTXCommand());
        command.setID(1);
        command.setCmd("PickTubes");
        command.setUser(json.getUser());
        request.setCommand(command);
        //System.out.println("Pick job: " + json.toString());
        ArrayList<Tube> tubes = json.getTubes();
        
            for (Tube tube : tubes)
            {
                STXRequest.Tubes xmltubes = (STXRequest.Tubes) (of.createSTXRequestTubes());       
                xmltubes.setTube(tube.getBarcode());
                STXPlate plate1 = (STXPlate) (of.createSTXPlate());
                String location = tube.getLocation();
                String tubeRack = tube.getRack();
                if (location.contentEquals("") && tubeRack.contentEquals(""))
                { 
                   // System.out.println("Case 1 ");
                    request.getTubes().add(xmltubes);                    
                }
                else  {
                       //System.out.println("Case 3 ");
                plate1.setPltBCR("["+tubeRack+"]");
                xmltubes.setPlate(plate1);
                
                 byte px =  (byte)Integer.parseInt(location.substring(1));
                 byte py = (byte) (location.charAt(0) - 'A' + 1); 
//                byte px =  (byte)(location.charAt(1) - 48);
//                byte py = (byte) (location.charAt(0) - 'A' + 1); 
                STXTubePos tubePos = (STXTubePos) (of.createSTXTubePos());
                tubePos.setPX(px);
                tubePos.setPY(py);
                xmltubes.setPltTPos(tubePos);
                request.getTubes().add(xmltubes);
            }
            }
        JAXBContext context = JAXBContext.newInstance(STXRequest.class); //Create Marshaller using JAXB context
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);   //Do the marshal operation
        java.io.StringWriter inputXML = new StringWriter();
        marshaller.marshal(request,inputXML); 
        
            System.out.println("XML Request: "+ inputXML.toString());
        String xmlResponse = "";
        HttpClient httpClient = new DefaultHttpClient();
    try {
      HttpPost postRequest = new HttpPost("http://localhost:80/LiconicScheduler/webresources/pickjob");
      postRequest.setHeader("Content-Type", "application/xml");
      String xmlRequest = inputXML.toString();
      HttpEntity entity = new ByteArrayEntity(xmlRequest.getBytes("UTF-8"));
      postRequest.setEntity(entity);
      HttpResponse httpResponse = httpClient.execute(postRequest);
  
      byte[] buffer = new byte[1024];
      if (httpResponse != null) {
        InputStream inputStream = httpResponse.getEntity().getContent();
        try {
          int bytesRead = 0;
          BufferedInputStream bis = new BufferedInputStream(inputStream);
          StringBuilder stringBuilder = new StringBuilder();
          while ((bytesRead = bis.read(buffer)) != -1) {
          stringBuilder.append(new String(buffer, 0, bytesRead));
          }
          System.out.println(stringBuilder.toString());
         xmlResponse  = stringBuilder.toString();
          
        } catch (Exception e) {} 
      }
      
    } catch (IOException | UnsupportedOperationException e) {
    } finally {
      httpClient.getConnectionManager().shutdown();
    }
    
    JAXBContext jaxbContext = JAXBContext.newInstance(STXRequest.class);
    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

    StringReader reader = new StringReader(xmlResponse);
  request = (STXRequest) unmarshaller.unmarshal(reader);
  if(request.getAnswer().getStatus().equals("OK"))
  {
            String jsonreply = "{\n" +
                    "    \"jobId\": "+ request.getCommand().getID() + "\n" +
                    "}";
     return  Response.ok(jsonreply,MediaType.APPLICATION_JSON).build();
  }
  
  else if(request.getAnswer().getStatus().equals("ERR"))
  {
      return Response.status(400).entity(request.getAnswer().getErrMsg()).build();
  }
  return Response.status(500).entity("Some other error").build();
}

public Response exportPlates(RequestBody json) throws JAXBException {
 
        Response response ;
        String jsonreply,barcode = "";
         listTubes.clear();
         listLocation.clear();
        STXRequest request = (STXRequest)(of.createSTXRequest());
        STXCommand command = (STXCommand) (of.createSTXCommand());
        command.setID(1);
        command.setCmd("ExportToXfer");        
        command.setUser(json.getUser());
        if(Integer.parseInt(json.getPickJobId()) !=0 )
        {
             STXParameter parameter = (STXParameter) (of.createSTXParameter());
             parameter.setParameter("PickJobId");
             parameter.setValue(json.getPickJobId());
             command.getParameters().add(parameter);
             request.setCommand(command);
        }
        else if(Integer.parseInt(json.getPickJobId()) ==0)
        {
            request.setCommand(command);
            STXPlate plate = (STXPlate) (of.createSTXPlate());
            plate.setPltBCR(json.getrackBarcode()); 
             barcode = json.getrackBarcode();
          /*  if(json.getrackType().equals("Fluid-x 96"))
            {
                plate.setPltType(1);
            }
            else if(json.getrackType().equals("Fluid-x 24"))
            {
                plate.setPltType(0);
            }*/
            request.getPlates().add(plate);                
        }
        
         JAXBContext context = JAXBContext.newInstance(STXRequest.class); //Create Marshaller using JAXB context
        Marshaller marshaller = context.createMarshaller(); marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);   //Do the marshal operation
        //marshaller.marshal(json,System.out);
           java.io.StringWriter inputXML = new StringWriter();
        marshaller.marshal(request,inputXML); 
        
        System.out.println("Export request in XML:\n"+inputXML.toString());
        String xmlResponse = "";
        
           
    //    System.out.println("Query: "+ query );
         try{         
             Class.forName(DB_DRIVER);         
             Connection con = DriverManager.getConnection(DBConnectString,DBUser , DBPswd);
             Statement stmt = con.createStatement();
             
             if(Integer.parseInt(json.getPickJobId()) !=0 )
             {
              ResultSet rs1 = stmt.executeQuery("select plate_bcr from jobs\n" +
"inner join tasks on jobs.id_job=tasks.link_job\n" +
"inner join task_src_link_trg on tasks.id_task = task_src_link_trg.link_task\n" +
"inner join plate_link_task on task_src_link_trg.id_src_link_trg = plate_link_task.link_task\n" +
"inner join plates on plate_link_task.link_plate = plates.id_plate\n" +
"where jobs.id_job ="+ json.getPickJobId());
              
              while (rs1.next()) 
             {
                 barcode = rs1.getString("plate_bcr");     
             }
             }
             else
             {
                 barcode = json.getrackBarcode();
             }
              
             String query = "select tubes.tube_bcr, tube_x,tube_y from\n" +
"tubes  INNER JOIN tubes_link_plate\n" +
"  on tubes_link_plate.link_tube=tubes.id_tube\n" +
"INNER join plate_link_tube_pos\n" +
"  on  plate_link_tube_pos.id_link_tube_pos = tubes_link_plate.link_pos\n" +
"  inner join plates\n" +
"  on plates.id_plate=plate_link_tube_pos.link_plate\n" +
"  inner join tube_positions\n" +
"  on tube_positions.id_tube_position=plate_link_tube_pos.link_tube_pos\n" +
"  inner join plate_link_level\n" +
"  on plate_link_level.link_plate=plates.id_plate\n" +
"  inner join levels\n" +
"  on plate_link_level.link_level = levels.id_level\n" +
"  where plates.plate_bcr='"+barcode+"'";

             ResultSet rs = stmt.executeQuery(query);
             while (rs.next()) 
             {
                 listTubes.add(rs.getString("tube_bcr"));
                 int x= rs.getInt("tube_x");
                 int y = rs.getInt("tube_y");
                 char b =(char)(64+y);
                 StringBuilder sb = new StringBuilder();
                 sb.append(b);
                 sb.append(x);              
                 listLocation.add(sb.toString());
             }
 
             con.close();
             }
             catch(Exception e)
             {
                 System.out.println(e.getMessage());
             }
         
         HttpClient httpClient = new DefaultHttpClient();
    try {
      HttpPost postRequest = new HttpPost("http://localhost:80/LiconicScheduler/webresources/export");
      postRequest.setHeader("Content-Type", "application/xml");
      
      String xmlRequest = inputXML.toString();
      
      HttpEntity entity = new ByteArrayEntity(xmlRequest.getBytes("UTF-8"));
      postRequest.setEntity(entity);  
      HttpResponse httpResponse = httpClient.execute(postRequest);
      byte[] buffer = new byte[1024];
      if (httpResponse != null) {
        InputStream inputStream = httpResponse.getEntity().getContent();
        try {
          int bytesRead = 0;
          BufferedInputStream bis = new BufferedInputStream(inputStream);
          StringBuilder stringBuilder = new StringBuilder();
          while ((bytesRead = bis.read(buffer)) != -1) {
          stringBuilder.append(new String(buffer, 0, bytesRead));
          }
          //String Response
          System.out.println(stringBuilder.toString());
         xmlResponse  = stringBuilder.toString();
          
        } catch (Exception e) {
          e.printStackTrace();
        } finally {
          try { inputStream.close(); } catch (Exception ignore) {}
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      httpClient.getConnectionManager().shutdown();
    }
    
    JAXBContext jaxbContext = JAXBContext.newInstance(STXRequest.class);
    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

    StringReader reader = new StringReader(xmlResponse);
   
    request = (STXRequest) unmarshaller.unmarshal(reader);
    
      if(request.getAnswer().getStatus().equals("OK"))
      {
             jsonreply = "{\n" +
        "    \"jobId\": "+ request.getCommand().getID() + "\n" +
        "}";
             return  Response.ok(jsonreply,MediaType.APPLICATION_JSON).build();
      }
      else if(request.getAnswer().getStatus().equals("ERR"))
      {
          return Response.status(400).entity(request.getAnswer().getErrMsg()).build();
      }     
        
       return Response.status(500).entity("Some other error").build();       
   }   

public Response jobStatus(int job_id) throws ClassNotFoundException, FileNotFoundException, SQLException{
    
        try{       
             Class.forName(DB_DRIVER);
             Connection con = DriverManager.getConnection(DBConnectString,DBUser, DBPswd);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("select DONE from JOBS where ID_JOB ="+job_id+";");
             int count =0;
             while(rs.next()){
                     String status = rs.getString("DONE");
                     if(Integer.parseInt(status) == 0)
                     {
                         System.out.println("Job "+ job_id + " is pending.");
                         con.close();
                         return  Response.ok("Job "+ job_id + " is pending.",MediaType.TEXT_PLAIN).build();
                     }

                     else if(Integer.parseInt(status) == 1)
                     {
                         System.out.println("Job "+ job_id + " is completed.");
                        // return  Response.ok("Job "+ job_id + " is completed.",MediaType.TEXT_PLAIN).build();
                         String report="";
                          File folder = new File(paths);
                          File[] listOfFiles = folder.listFiles();
                          for (int i = 0; i < listOfFiles.length; i++)
                          {
                              String fileName;
                            ///  System.out.println("File name: " + listOfFiles[i].getName());
                              if(listOfFiles[i].getName().startsWith(String.valueOf(job_id)))
                              {
                                  BufferedReader reader = new BufferedReader(new FileReader(listOfFiles[i]));
                                  String line = null;
                                  StringBuilder  stringBuilder = new StringBuilder();
                                  String ls = System.getProperty("line.separator");
                                  try{
                                  while((line = reader.readLine()) != null) {
                                    stringBuilder.append(line);
                                    stringBuilder.append(ls);
                                  }
                                  report =   stringBuilder.toString();
                                  return  Response.ok(report,MediaType.TEXT_PLAIN).build();
                                  }
                                  catch(Exception e)
                                  {
                                      System.out.println("Error out: " + e.getMessage());
                                  }
                              }
                          }
                                 System.out.println("Job completed, report not found");
                                 return Response.status(404).entity("Job completed, report not found").build();
                     }
             }
        }
              catch(ClassNotFoundException | SQLException e)
             {
                 System.out.println("Error accessing database: "+e.getMessage());
                 return Response.status(500).entity("Some other error: "+e.getMessage()).build();  
             }
         return Response.status(404).entity("Job " + job_id + " not found").build();  
}

public Response jobData(int job_id){
    PreparedStatement stmt1,stmt2, stmt3, stmt4,stmt5,stmt6;
     
             ResultSet rs1,rs2,rs3,rs4,rs5, rs6;
     try{       
             Class.forName(DB_DRIVER);
             Connection con = DriverManager.getConnection(DBConnectString,DBUser, DBPswd);
             stmt1 = con.prepareStatement("select Job_type from Jobs where id_job = ?");
             stmt1.setInt(1, job_id);
             rs1 = stmt1.executeQuery();
             JSONObject data = new JSONObject();
             JSONObject rack;
             JSONObject tube;
             JSONArray racks = new JSONArray();
             JSONArray tubes = new JSONArray();
             while(rs1.next())
             {
                 if(rs1.getInt(1) == 3) //Import
                 {
                    String report = importExportReport(job_id,"Import");
                   //  System.out.println(report);
                      if(report.contains("jobId"))
                     {
                         return Response.status(200).entity(report).build();
                     }
                      else
                     return  Response.status(500).entity(report).build();
                 }
                 
                 else if(rs1.getInt(1) == 2)//Pick Job / Job File
                 {
                     Response report = pickJobReport(job_id);
                    // System.out.println(report);
//                      if(report.getStatus() != 200)
//                     {
//                         return Response.status(report.getStatus()).entity(report.getEntity().toString()).build();
//                     }
//                      else
                     return  report;
                 }
                     else if(rs1.getInt(1) == 5) //EXport
                 {
                          String report = importExportReport(job_id,"Export");
                  //   System.out.println(report);
                      if(report.contains("jobId"))
                     {
                         return Response.status(200).entity(report).build();
                     }
                      else
                     return  Response.status(500).entity(report).build();
                         
                 }
             }         
             stmt1.close();
             rs1.close();
             con.close();
               //System.out.println(data.toString());
     }
     catch(Exception e)
     {
          return Response.status(500).entity(e.getMessage()).build(); 
     }
     finally{
       
     }
    return Response.status(200).entity("").build(); 
}

public Response getJobs(long timestamp, int pageSize, int pageNumber) throws ParseException {
   
    if(pageSize > 500)
    {
        return Response.status(400).entity("Maximum allowable page size is 500, requested page size is " + pageSize).build();
    }
     
   java.util.Date time=new java.util.Date((long)(timestamp)*1000);
   SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");
   String date = dateFormatter.format(time);
   
   PreparedStatement stat;
   String SQL;        
   ResultSet rs; 
   int first = (pageNumber -1) * pageSize + 1;
   int last = pageNumber * pageSize;
   JSONArray obj = new JSONArray();
   try{         
         Class.forName(DB_DRIVER);         
         Connection con = DriverManager.getConnection(DBConnectString, DBUser, DBPswd);
   SQL = "select job_id, TYPE, Date_Created dateCreated, STATUS_TIME dateUpdated, TASK_STATUS   from\n" +
"( select s1.ID_TASK task_id, STATUS_TIME, TASK_STATUS, type from \n" +
"( SELECT t.ID_TASK, tt.TASK_TYPE type, max(tls.STATUS_TIME) m\n" +
"FROM TASKS t \n" +
"  INNER JOIN TASK_LINK_STATUS tls ON ( t.ID_TASK = tls.LINK_TASK  )  \n" +
"      INNER JOIN TASK_STATUS ts ON ( tls.LINK_STATUS = ts.ID_TASK_STATUS  )  \n" +
"      INNER JOIN TASK_TYPES tt ON ( t.TASK_TYPE = tt.ID_TASK_TYPE  )  \n" +
"  group by t.ID_TASK,tt.TASK_TYPE ) s1\n" +
"   inner join \n" +
"  ( SELECT t1.ID_TASK, tls.STATUS_TIME, ts.TASK_STATUS\n" +
"  FROM TASKS t1 \n" +
"      INNER JOIN TASK_LINK_STATUS tls ON ( t1.ID_TASK = tls.LINK_TASK  )  \n" +
"          INNER JOIN TASK_STATUS ts ON ( tls.LINK_STATUS = ts.ID_TASK_STATUS  ) ) s2\n" +
"               on s1.ID_TASK = s2.ID_TASK \n" +
"               where s1.m = s2.status_time ) s4\n" +
"               inner join \n" +
"               (SELECT t.ID_TASK, min(tls.STATUS_TIME) Date_Created\n" +
"               FROM TASKS t \n" +
"                 INNER JOIN TASK_LINK_STATUS tls ON ( t.ID_TASK = tls.LINK_TASK  )  \n" +
"                     INNER JOIN TASK_STATUS ts ON ( tls.LINK_STATUS = ts.ID_TASK_STATUS  )  \n" +
"                     INNER JOIN TASK_TYPES tt ON ( t.TASK_TYPE = tt.ID_TASK_TYPE  )  \n" +
"                 group by t.ID_TASK,tt.TASK_TYPE ) smin\n" +
"                 on smin.id_task = s4.task_id\n" +
"               inner join \n" +
"               ( select jobs.ID_JOB job_id ,jobs.job_type, t2.ID_TASK from jobs \n" +
"               inner join tasks t2 on jobs.ID_JOB = t2.LINK_JOB ) s3\n" +
"               on s3.ID_TASK = s4.task_id \n" +
"               where TYPE != 'ImportXfer'  AND STATUS_TIME >= '" + date + "'\n"+
"               order by Job_id desc\n" +
"               rows " + first + " to " + last;
   
         
            Statement stmt = con.createStatement();
      
           // System.out.println("Query:" + SQL );
            rs = stmt.executeQuery(SQL);
            //System.out.println(SQL);
            
            DateFormat dfm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");  
         
          
            while (rs.next()){
             JSONObject job = new JSONObject();       
           // Job job = new Job();
            job.put("jobId",rs.getInt(1));
            
            if(rs.getString(2).equalsIgnoreCase("Job File"))
            {
                job.put("jobType","Pick");
                //job.setJobType("Pick Job");
            }
            else  if(rs.getString(2).equalsIgnoreCase("Scan 2D"))
            {
                job.put("jobType","Import");
               // job.setJobType("Import"); 
            }
            else
            {  
                job.put("jobType",rs.getString(2));
               //  job.setJobType(rs.getString(2));
            }
            
            job.put("user", "ADMIN");
            
            String dateCreated = rs.getTimestamp(3).toString();
            Date DateCreated  = dfm.parse(rs.getTimestamp(3).toString());
            long created = (long) DateCreated.getTime()/1000; 
            job.put("dateCreated",created);
            
            Date DateUpdated  = dfm.parse(rs.getTimestamp(4).toString());
            long updated = (long) DateUpdated.getTime()/1000; 
            job.put("dateUpdated",updated);
            
//            String dateUpdated = rs.getTimestamp(4).toString();
//            long updated = dfm.parse(dateUpdated).getTime();  
//            updated=updated/1000;
//            job.put("dateUpdated", rs.getTimestamp(4));
            
            job.put("status", rs.getString(5));
            obj.put(job);
            }
              con.close();
             return Response.status(200).entity(obj.toString()).build(); 
           
   }
   catch(Exception e)
   {
       System.out.println(" GetAlljobsStatus Exception:  " + e.getMessage());
       return Response.status(500).entity(" GetAlljobsStatus Exception:  " + e.getMessage()).build(); 
   }
 //  return Response.status(500).entity("Please try again").build(); 
}
  
public String importExportReport(int job_id, String jobType){
     PreparedStatement stmt2;
    ResultSet rs2;
    JSONObject data = new JSONObject();
             JSONObject rack;
             JSONObject tube;
             JSONArray racks = new JSONArray();
             JSONArray tubes = new JSONArray();
      try{       
             Class.forName(DB_DRIVER);
             Connection con = DriverManager.getConnection(DBConnectString,DBUser, DBPswd);
             
    stmt2 = con.prepareStatement("select plate_bcr, tube_bcr,tube_x, tube_y from Jobs\n" +
"inner join tasks on jobs.id_job = tasks.link_job\n" +
"inner join task_src_link_trg on task_src_link_trg.link_task = tasks.id_task\n" +
" INNER JOIN plate_link_task ON plate_link_task.link_task=id_src_link_trg\n" +
" INNER JOIN plates ON plate_link_task.link_plate=id_plate\n" +
"   LEFT JOIN plate_link_tube_pos ON plate_link_tube_pos.link_plate=id_plate\n" +
"\n" +
"   LEFT JOIN tubes_link_plate ON link_pos=id_link_tube_pos\n" +
" left join tube_positions on tube_positions.id_tube_position = plate_link_tube_pos.link_tube_pos\n" +
"    LEFT JOIN tubes ON link_tube=id_tube\n" +
"where id_job = ? \n" +
"       GROUP BY id_plate, plate_bcr, tube_bcr,tube_x, tube_y");
                     stmt2.setInt(1,job_id);
                      rs2 = stmt2.executeQuery();
                      String rackBarcode = "00", loc = "";
                      rack = new JSONObject();
                     while(rs2.next())
                     {
                         tube = new JSONObject();
                         
                         if(rackBarcode.equalsIgnoreCase(rs2.getString(1)))
                         {
                             
                             if(rs2.getString(2)!=null){
                             tube.put("barcode", rs2.getString(2));
                             loc = GetYA(rs2.getInt(4)) + rs2.getInt(3);
                             tube.put("location",loc);//listTubeB.add(rs2.getString(2));
                             tubes.put(tube);
                             }
                         }
                         
                         else if(rackBarcode.equalsIgnoreCase("00"))
                         {
                              if(rs2.getString(2)!=null){
                             tube.put("barcode", rs2.getString(2));
                             loc = GetYA(rs2.getInt(4)) + rs2.getInt(3);
                             tube.put("location",loc);//listTubeB.add(rs2.getString(2));
                             tubes.put(tube); }
                              rackBarcode = rs2.getString(1);
                             rack.put("rackBarcode", rackBarcode);
                         }
                     }
                     rack.put("tubes", tubes);
                     racks.put(rack);
                     data.put("racks",racks); 
                     data.put("freezerId","liconic01");
                     data.put("user","ADMIN");
                     data.put("jobId",job_id);
                     data.put("jobType", jobType);
                     
                      return data.toString();
    }
    catch(Exception e)
    {
         return e.getMessage();
    }
}

public Response pickJobReport(int job_id){
    PreparedStatement stmt3;
    ResultSet rs3;
    JSONObject data = new JSONObject();
             JSONObject rack;
             JSONObject tube;
             JSONArray racks = new JSONArray();
             JSONArray tubes = new JSONArray();
    try{       
             Class.forName(DB_DRIVER);
             Connection con = DriverManager.getConnection(DBConnectString,DBUser, DBPswd);
 stmt3 = con.prepareStatement("select id_task, task_type from jobs inner join tasks on tasks.link_job = jobs.id_job where id_job = ?");
 stmt3.setInt(1, job_id);
 rs3 = stmt3.executeQuery();
 StringBuilder report = new StringBuilder() ;
 JSONArray report1 = new JSONArray();
 while(rs3.next()){

     if(rs3.getInt(2) == 10) //Picking
     { 
         int task = rs3.getInt(1);
         String output = pickingReport(task,job_id);
        //  System.out.println(output);
         if(!output.contains("jobId"))
         {
             return Response.status(500).entity(output).build(); 
         }
         report1.put(new JSONObject(output));
       //  report.append(output);
     }
     else if(rs3.getInt(2) == 2) //Export task
     {
         int task = rs3.getInt(1);
         String output = exportReport(task,job_id);
      //    System.out.println(output);
          if(!output.contains("jobId"))
         {
            return Response.status(500).entity(output).build(); 
         }
          report1.put(new JSONObject(output));
        // report.append(output);
     }
 }
// System.out.println(report1);
 stmt3.close();
   con.close();
  return Response.status(200).entity(report1.toString()).build(); 
           /// return report.toString();
    }
    catch(Exception e)
    {
         return  Response.status(500).entity(e.getMessage()).build();
    }
}

public String pickingReport(int task,int job_id){
    PreparedStatement stmt4;
    ResultSet rs4;
    String report = "";
    JSONObject data = new JSONObject();
             JSONObject rack;
             JSONObject tube;
             JSONArray racks = new JSONArray();
             JSONArray tubes = new JSONArray();
    try{       
             Class.forName(DB_DRIVER);
             Connection con = DriverManager.getConnection(DBConnectString,DBUser, DBPswd);
              stmt4 = con.prepareStatement("SELECT plate_bcr, tube_bcr, tube_x, tube_y\n" +
"    FROM task_src_link_trg, tube_link_task, tubes, tubes_link_plate,\n" +
"   plate_link_tube_pos, tube_positions, plates\n" +
"    WHERE task_src_link_trg.link_task= ? AND tube_link_task.link_task=id_src_link_trg\n" +
"   AND tube_link_task.link_tube=id_tube AND tubes_link_plate.link_tube=id_tube AND\n" +
"    link_pos=id_link_tube_pos AND link_tube_pos=id_tube_position AND link_plate=id_plate\n" +
"    AND is_DONE = 1\n" +
"           GROUP BY plate_bcr, tube_bcr, tube_x, tube_y\n" +
"         ORDER BY plate_bcr, tube_x, tube_y");
                             
                             stmt4.setInt(1,task);
                             rs4 = stmt4.executeQuery();
                             String rackBarcode = "00", loc = "";
                                 rack = new JSONObject();
                             if(!rs4.next())
                             {
                                return "Error";
                             } 
                                 while(rs4.next())                                 {  
                                     tube = new JSONObject();
                                     if(rackBarcode.equalsIgnoreCase(rs4.getString(1)))
                                     {
                                         if(rs4.getString(2)!=null)
                                         {
                                            tube.put("barcode", rs4.getString(2));
                                            loc = GetYA(rs4.getInt(4)) + rs4.getInt(3);
                                            tube.put("location",loc);//listTubeB.add(rs2.getString(2));
                                            tubes.put(tube);
                                         }
                                     }
//                                    
                                     else if(!rackBarcode.equalsIgnoreCase(rs4.getString(1)))
                                             {
                                                 if(!rackBarcode.equalsIgnoreCase("00"))
                                                 {
                                                       rack.put("rackBarcode", rackBarcode);
                                                       rack.put("tubes", tubes);
                                                       racks.put(rack);
                                                 }
                                                   tubes = new JSONArray();
                                                   rack = new JSONObject();
                                                 if(rs4.getString(2)!=null)
                                                 {
                                                     tube.put("barcode", rs4.getString(2));
                                                     loc = GetYA(rs4.getInt(4)) + rs4.getInt(3);
                                                     tube.put("location",loc);//listTubeB.add(rs2.getString(2));
                                                     tubes.put(tube); 
                                                     rackBarcode = rs4.getString(1);
                                                 }
                                             }
                                 }
                                 rs4.close();
                                 stmt4.close();
                                  rack.put("rackBarcode", rackBarcode);
                                  rack.put("tubes", tubes);
                                  racks.put(rack);
                                  data.put("freezerId","liconic01");
                                  data.put("user","ADMIN");
                                  data.put("jobId",job_id);
                                  data.put("jobType", "pick");
                                  data.put("racks",racks);
                                  report = data.toString();
             con.close();
            return report;
    }
    catch(Exception e)
    {
         return e.getMessage();
    }
}

public String exportReport(int task,int jobid){
    
     PreparedStatement stmt5;
    ResultSet rs5;
    String report = "";
    JSONObject data = new JSONObject();
             JSONObject rack;
             JSONObject tube;
             JSONArray racks = new JSONArray();
             JSONArray tubes = new JSONArray();
    try{       
             Class.forName(DB_DRIVER);
             Connection con = DriverManager.getConnection(DBConnectString,DBUser, DBPswd);
     stmt5 = con.prepareStatement("SELECT plate_bcr, tube_bcr, tube_x, tube_y\n" +
"           FROM task_src_link_trg\n" +
"     INNER JOIN plate_link_task ON plate_link_task.link_task=id_src_link_trg\n" +
"         INNER JOIN plates ON plate_link_task.link_plate=id_plate\n" +
"     LEFT JOIN plate_link_tube_pos ON plate_link_tube_pos.link_plate=id_plate\n" +
"\n" +
"  LEFT JOIN tubes_link_plate ON link_pos=id_link_tube_pos\n" +
"  left join tube_positions on tube_positions.id_tube_position = plate_link_tube_pos.link_tube_pos    LEFT JOIN tubes ON link_tube=id_tube\n" +
" WHERE task_src_link_trg.link_task= ?\n" +
" GROUP BY plate_bcr, tube_bcr,tube_x, tube_y");
                             stmt5.setInt(1, task);
                             rs5 = stmt5.executeQuery();
                             String rackBarcode = "00", loc = "";
                              rack = new JSONObject();
                              while(rs5.next())
                     {
                         tube = new JSONObject();
                         
                         if(rackBarcode.equalsIgnoreCase(rs5.getString(1)))
                         {
                             
                             if(rs5.getString(2)!=null){
                             tube.put("barcode", rs5.getString(2));
                             loc = GetYA(rs5.getInt(4)) + rs5.getInt(3);
                             tube.put("location",loc);//listTubeB.add(rs2.getString(2));
                             tubes.put(tube);
                             }
                         }
                         
                         else if(rackBarcode.equalsIgnoreCase("00"))
                         {
                              if(rs5.getString(2)!=null){
                             tube.put("barcode", rs5.getString(2));
                             loc = GetYA(rs5.getInt(4)) + rs5.getInt(3);
                             tube.put("location",loc);//listTubeB.add(rs2.getString(2));
                             tubes.put(tube); }
                              rackBarcode = rs5.getString(1);
                             rack.put("rackBarcode", rackBarcode);
                         }
                     }stmt5.close();rs5.close();
                     rack.put("tubes", tubes);
                     racks.put(rack);
                       data.put("freezerId","liconic01");
                                  data.put("user","ADMIN");
                     data.put("racks",racks); 
                     data.put("jobId",jobid);
                    data.put("jobType", "export");
                     report = data.toString();
                        con.close();
            return report;
    }
    catch(Exception e)
    {
         return e.getMessage();
    }
}

public Response continueJob(int jobid){
HttpClient httpClient = new DefaultHttpClient();
int code =0;  
String msg ="";
int task_id = 0 ;

   try{         
         Class.forName(DB_DRIVER);         
         Connection con = DriverManager.getConnection(DBConnectString,DBUser, DBPswd);
          PreparedStatement stmt1;
          ResultSet rs1;
          String query = "SELECT t.ID_TASK, t.LINK_JOB\n" +
"FROM TASKS t \n" +
"WHERE t.TASK_TYPE = 10 AND\n" +
"	t.LINK_JOB = ?";
           stmt1 = con.prepareStatement(query);
           stmt1.setInt(1, jobid);
           rs1 = stmt1.executeQuery();
           while (rs1.next()){
               task_id = rs1.getInt(1);
               }
           con.close();
             }
   catch(Exception e)
   {
       System.out.println("Continue Job Error: " + e.getMessage());
   }

try{
        URL url = new URL("http://localhost:80/LiconicScheduler/webresources/scheduler/tasks/"+task_id +"/action/continue");
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("PUT");
        connection.connect();
         code = connection.getResponseCode();
        if (code==200)
        {
            System.out.println("Job will continue: " + jobid + "   task_id: " + task_id );
            msg = "Job will continue: " + jobid;
            return Response.status(code).entity(jobid).build();
        }
        else if(code == 404){
            return Response.status(code).entity("JobId "+ jobid + " not found").build();
        }
        else{
             System.out.println("Job canot be continue: " + jobid ); 
            msg = "Job canot be continue: " + jobid ;
            return Response.status(code).entity(connection.getErrorStream().toString()).build();}
   }
   catch(Exception e)
   {
       System.out.println("Continue Job Error: " + e.getMessage());
   }
   return Response.status(code).entity("").build();
}

public Response ContinueTasks()
{
    String response =""; 
    try{
        URL url = new URL("http://localhost:80/LiconicScheduler/webresources/scheduler/jobs");
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();
       InputStream inputStream = connection.getInputStream();
        byte[] buffer = new byte[1024];
             try {
          int bytesRead = 0;
          BufferedInputStream bis = new BufferedInputStream(inputStream);
          StringBuilder stringBuilder = new StringBuilder();
          while ((bytesRead = bis.read(buffer)) != -1) {
          stringBuilder.append(new String(buffer, 0, bytesRead));
          }
          //String Response
          System.out.println(stringBuilder.toString());
         response  = stringBuilder.toString();
          
        } catch (Exception e) {
          e.printStackTrace();
        } finally {
          try { inputStream.close(); } catch (Exception ignore) {}
        }
       
             connection.disconnect();
       return Response.status(200).entity(response).build();
    }
    catch(Exception e)
    {
        System.out.println("ContinueTasks error: " + e.getMessage());
    }
    
     return Response.status(404).entity("Error Connecting to Server, please try again.").build();
}

 public Response deleteJob(int id){
HttpClient httpClient = new DefaultHttpClient();
int code =0;  
String msg ="";
try{
     URL url = new URL("http://localhost:80/LiconicScheduler/webresources/scheduler/jobs/" + id);
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("DELETE");
        connection.connect();

         code = connection.getResponseCode();
         
        connection.disconnect();
   //     System.out.println("Response code of the object is "+code);
        if (code==200)
        {
            System.out.println("Job is deleted: "+id);
            return Response.status(code).entity(id).build();
        }
        else if(code==404)
        {
            System.out.println("JobId not found: " + id); 
         return Response.status(code).entity("JobId "+ id + " not found").build();
        }
        else
        {
             return Response.status(code).entity(connection.getErrorStream().toString()).build();   
        }
   }
   catch(Exception e)
   {
       System.out.println(e.getMessage());
   }
   return Response.status(code).entity("").build();
} 
 
public Response getInventory() {
     try{         
         Class.forName(DB_DRIVER);         
         Connection con = DriverManager.getConnection(DBConnectString,DBUser,DBPswd);
         Statement stmt = con.createStatement();
         
         ResultSet rs = stmt.executeQuery("select tubes.tube_bcr from tubes  INNER JOIN tubes_link_plate\n" +
" on tubes_link_plate.link_tube=tubes.id_tube\n" +
"INNER join plate_link_tube_pos\n" +
" on  plate_link_tube_pos.id_link_tube_pos = tubes_link_plate.link_pos\n" +
"inner join plates\n" +
" on plates.id_plate = plate_link_tube_pos.link_plate\n" +
"inner join plate_link_level\n" +
"  on plates.id_plate = plate_link_level.link_plate\n" +
"inner join levels\n" +
" on levels.id_level = plate_link_level.link_level");
         int count =0;
         List listTubes = new ArrayList();
         while (rs.next()) 
         {
             listTubes.add(rs.getString("tube_bcr"));
           //  return Response.status(404).entity("").build();
         }
         
        ResultSet rs1 = stmt.executeQuery("select PLATE_BCR from plates inner join plate_link_level "
                 + "on plates.id_plate = plate_link_level.link_plate inner join levels "
                 + "on levels.id_level = plate_link_level.link_level");
         List listPlates = new ArrayList();
         while (rs1.next()) 
         {
             listPlates.add(rs1.getString("PLATE_BCR"));
           //  return Response.status(404).entity("").build();
         }

         JSONObject obj = new JSONObject();
         obj.put("racks",listPlates);
         obj.put("tubes",listTubes);
         con.close();
         return Response.status(200).entity(obj.toString()).build();
          
     }
     catch(Exception e)
     {
         return Response.status(500).entity(e.getMessage()).build();
     }
     
    
}
 
void readFile(String fileName) throws IOException, JAXBException {

    STXRequest request = (STXRequest)(of.createSTXRequest());
    BufferedReader br = new BufferedReader(new FileReader(fileName));
    try {
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

        while (line != null) {
            sb.append(line);
            sb.append("\n");
            line = br.readLine();
        }
       String xmlreply =  sb.toString();
       
        JAXBContext jaxbContext = JAXBContext.newInstance(STXRequest.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        StringReader reader = new StringReader(xmlreply);
        request = (STXRequest) unmarshaller.unmarshal(reader);
       
    } finally {
        br.close();
    }
}

public void watchReports(){
    String path = getReportPath();
    File folder = new File(path);
    Calendar now = Calendar.getInstance();
    Calendar calendar = Calendar.getInstance();
    CopyReports reports = new CopyReports(this);
    Timer timer = new Timer();
    timer.schedule(reports, calendar.getTime(), 1000*180);
}

public  void sendReports(String report, String uri){
    String response;
 //   System.out.println("Report to Moderna: " + report);

     HttpClient httpClient = new DefaultHttpClient();
    try {
      HttpPost postRequest = new HttpPost(uri);
      postRequest.setHeader("Content-Type", "application/json");
      HttpEntity entity = new ByteArrayEntity(report.getBytes("UTF-8"));
      postRequest.setEntity(entity);
      HttpResponse httpResponse = httpClient.execute(postRequest);
  
      byte[] buffer = new byte[1024];
      if (httpResponse != null) {
        InputStream inputStream = httpResponse.getEntity().getContent();
        try {
          int bytesRead = 0;
          BufferedInputStream bis = new BufferedInputStream(inputStream);
          StringBuilder stringBuilder = new StringBuilder();
          while ((bytesRead = bis.read(buffer)) != -1) {
          stringBuilder.append(new String(buffer, 0, bytesRead));
          }
         
         response  = stringBuilder.toString();
       //  System.out.println("Response from Moderna: " + response);
        } catch (Exception e) {
          e.printStackTrace();
        } finally {
          try { inputStream.close(); } catch (Exception ignore) {}
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      httpClient.getConnectionManager().shutdown();
    }
}

public String getReportPath() {
       return paths;
    }
    
public String getURIImport()     {
         return uri;
     }

public String getURIExport()     {
         return uri;
     }
     
public String getURIPick()     {
         return uri;
     }

public String getDB_DRIVER() {
       return DB_DRIVER;
    }

public String getDBPath() {
        return DBPath;
    }

public String getDBConnectString(){
    return DBConnectString;
}

public void setReportPath(String paths) {
        this.paths = paths;
    }

public void setDB_DRIVER(String DB_DRIVER) {
        this.DB_DRIVER = DB_DRIVER;
    }
    
public void setDBHost(String DBHost) {
        this.DBHost = DBHost;
    }

public void setDBPath(String DBPath) {
        this.DBPath = DBPath;
    }
    
public void setDBUser(String DBUser) {
        this.DBUser = DBUser;
    }

public void setDBPswd(String DBPswd) {
        this.DBPswd = DBPswd;
    }

public void setDBConnectString(String DBConnectString){
     this.DBConnectString = DBConnectString;
}

public void setURIPick(String uri)    {
        this.uri = uri;
    }

public void setURIExport(String uri)    {
        this.uri = uri;
    }

public void setURIImport(String uri)    {
        this.uri = uri;
    }

public List<String> getListTubes(){
    return listTubes;
}

public List<String> getLocation(){
    return listLocation;
}

Response getFreezerStatus(String cmd) {
    String status  = "";
   status = connectToServer(cmd);
    try 
    {  
        int response = -1;
        response = Integer.parseInt(status);  
        System.out.println("Freezer response code : " + response);
      
            if(response != -1)        {
        String strBin = Integer.toBinaryString(65536 +  response);
        String  str = strBin.substring(strBin.length() - 16);
       // str = str.substring(str.length() - 16);
        System.out.println("Status: " + str);
        char c = str.charAt(0);
        int ready = Integer.parseInt(str.valueOf(c));
         System.out.println("ready: " + ready);
        if(ready == 1)
          {
            c = str.charAt(3);
            int initialized = Integer.parseInt(str.valueOf(c));
            System.out.println("initialized: " + initialized);
            if(initialized == 1)
            {
             System.out.println("System is available and initialized");
             status = "System is available and initialized";
            }
            else
            {System.out.println("System is not initialized");
                status = "System is not initialized";
          }
          }
            else if (ready == 0)
            {
                c = str.charAt(4);
                int error = Integer.parseInt(str.valueOf(c));
                System.out.println("error: " + error);
                if(error == 1)
                {
                System.out.println("System is not available and is in error state");
                status = "System is not available and is in error state";
                }
                else 
                {System.out.println("System is not available "); 
                  status = "System is not available";
            }}
         return Response.status(200).entity(status).build();  
        }
    else
    {
      System.out.println("Couldnt find response, please try again"); 
      Response.status(500).entity("Error: Couldnt find response, please try again.").build();
    }
    }  
      catch(NumberFormatException nfe)  
      {  
           return Response.status(500).entity("Error: " +  status).build();          
      }  
     return Response.status(200).entity(status).build();  
}

Response getPickerStatus(String pickerId) {
        String status;
        status = connectToServer(pickerId);
    try 
    {   int response = -1;
        response = Integer.parseInt(status);  
        System.out.println("Tube-Picker response code : " + response);
       
             if(response != -1)        {
        String strBin = Integer.toBinaryString(65536 + response);
        String  str = strBin.substring(strBin.length() - 16);
       // str = str.substring(str.length() - 16);
        System.out.println("Status: " + str);
        char c = str.charAt(0);
        int ready = Integer.parseInt(str.valueOf(c));
          System.out.println("ready: " + ready);
        if(ready == 1)
          {
            c = str.charAt(3);
            int initialized = Integer.parseInt(str.valueOf(c));
            System.out.println("initialized: " + initialized);
            if(initialized == 1)
            {
             System.out.println("Tube-Picker is available and initialized");
             status = "Tube-Picker is available and initialized";
            }
            else
            {System.out.println("Tube-Picker is not initialized");
                status = "Tube-Picker is not initialized";
          }}
        
            else if (ready == 0)
            {
                c = str.charAt(4);
                int error = Integer.parseInt(str.valueOf(c));
                if(error == 1)
                { System.out.println("error: " + error);
                System.out.println("Tube-Picker is not available and is in error state");
                status = "Tube-Picker is not available and is in error state";
                }
                else 
                {System.out.println("Tube-Picker is not available "); 
                  status = "Tube-Picker is not available";
            }}
         return Response.status(200).entity(status).build();  
        }
    else
    {
      System.out.println("Couldnt find response, please try again"); 
      Response.status(500).entity("Error: Couldnt find response, please try again.").build();
    }
    }  
      catch(NumberFormatException nfe)  
      {  
           return Response.status(500).entity("Error: " +  status).build();          
      }  
     return Response.status(200).entity(status).build(); 
}

private String connectToServer(String id) {
         try {
            int port = 3333;
            String hostname = "localhost";
            String input,output;
            Socket socket = new Socket(hostname, port);           /*Connects to server*/
            String request = id;
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println(request);       
            BufferedReader in = new BufferedReader(new
            InputStreamReader(socket.getInputStream()));  
            String response = in.readLine();/*Reads from server*/
            System.out.println("Response from server for "+ request + " is "+ response);
            out.close();    /*Closes all*/
            in.close();
            socket.close();
            return response;
      }

        catch(Exception e) {
         System.out.print("Error Connecting to Server\n");
         return "Error Connecting to Server to get instrument status";
      } 
    }

private String GetYA(int y){
        
        String ya = "";
        
        if (y == 1)
            ya = "A";
        else if (y == 2)
            ya = "B";
        else if (y == 3)
            ya = "C";
        else if (y == 4)
            ya = "D";
        else if (y == 5)
            ya = "E";
        else if (y == 6)
            ya = "F";
        else if (y == 7)
            ya = "G";
        else if (y == 8)
            ya = "H";

        return ya;
        
    }



}