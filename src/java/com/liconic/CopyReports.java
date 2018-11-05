/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liconic;

import com.liconic.binding.xmlcontent.ObjectFactory;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Calendar;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Rucha Deshpande
 */
public class CopyReports extends TimerTask {
      private ServiceDao dao = new ServiceDao();
      ObjectFactory of = new ObjectFactory();
     
      
    public CopyReports(ServiceDao dao) {
        this.dao = dao;
        
    }
    
     @Override
    public void run() {
      RequestBody request = new RequestBody();
        File folder = new File(dao.getReportPath());
       File[] listOfFiles = folder.listFiles();
       
         //System.out.println("Checking for new files....."+cal.getTime());
         String line = null;
         
         String report = null;
        // StringBuilder  sb = new StringBuilder();
          //List listTubes = new ArrayList();
      
                 Calendar cal = Calendar.getInstance();
                    cal.add(Calendar.MINUTE, -2);
       for (int i = 0; i < listOfFiles.length; i++) {
       if (listOfFiles[i].isFile()) {
           
            Path path = Paths.get(listOfFiles[i].getAbsolutePath());
            String uri ="";
            BasicFileAttributes attr;
            try {
                
                File file = new File(path.toString());            
                java.util.Date fileDate = new java.util.Date(file.lastModified());    
               
                if(fileDate.after(cal.getTime()))
                {          
                    System.out.println("FileDate:" + fileDate);
                    System.out.println("Cal: "+ cal.getTime());
                    StringBuilder  stringBuilder = new StringBuilder();
                    BufferedReader reader = new BufferedReader(new FileReader (file));
                    String ls = System.getProperty("line.separator");
                    try {
                    while((line = reader.readLine()) != null) {
                        stringBuilder.append(line);
                        stringBuilder.append(ls);
                    }
                    report =   stringBuilder.toString();
                   System.out.println("New file copied: "+ file.getName());
                //    System.out.println("Original report: "+ report);
                   final JSONObject obj = new JSONObject(report);
                          //  request.setjobId(obj.getInt("jobId"));
                    if (file.getName().contains("import"))
                    {
                        uri = dao.getURIImport();
                       System.out.println("import response: "+report);
                    }
                    else if (file.getName().contains("export"))
                    {
                        
                        System.out.println("Export response:"+ report); 
                      
                    
                        uri = dao.getURIExport();
                    }
                    
                    else if (file.getName().contains("pick"))
                    {
                         System.out.println("Pick response:"+ report); 
                      uri = dao.getURIPick();
                    }
                                
                     dao.sendReports(report, uri);
                    }
                    catch (IOException ex) {
                        System.out.println("oops error! " + ex.getMessage());
                    } 
                  finally {
                    reader.close();
                }
                  }
                }
            catch (IOException e) {
            System.out.println("oops error! " + e.getMessage());
            }
       
    }
}
    }
}
   