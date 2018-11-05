/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liconic;

import com.liconic.binding.conffiles.Parameter;
import com.liconic.binding.conffiles.ParameterGroup;
import com.liconic.binding.conffiles.Parameters;
import java.io.FileInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

/**
 * Web application lifecycle listener.
 *
 * @author GKo
 */
public class AppListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        
        ServletContext context = sce.getServletContext();
               
        String ParamFile = "";
        String KIWIDBDriver = "";
    
        String DBUser = "";
        String DBPswd = "";
        String DBHost = "";
        String DBPath = "";
        String DBConnectString = "";

         ServiceDao dao = ServiceDao.getInstance();
        String path ="";
        ParamFile = context.getInitParameter("ConfigFile");
        
        System.out.println("REPORT read config: Reading ConfFile:"+ParamFile);
        
       try 
       {
            JAXBContext jaxbContent = JAXBContext.newInstance(com.liconic.binding.conffiles.ObjectFactory.class);

            Unmarshaller um = jaxbContent.createUnmarshaller();

            FileInputStream fis = new FileInputStream(ParamFile);

            Parameters params = (Parameters) um.unmarshal(fis);

            for(int i=0; i<params.getParameterGroup().size(); i++){
                                
                ParameterGroup paramGroup = (ParameterGroup)params.getParameterGroup().get(i);
                
                if (paramGroup.getName().equals("KIWI Database")){
                    
                    for(int j=0; j<paramGroup.getParameter().size(); j++)
                    {
                        Parameter param = (Parameter)paramGroup.getParameter().get(j);
                        
                        if (param.getName().equals("KIWIDBDriver"))
                        {
                            KIWIDBDriver = param.getValue();
                            dao.setDB_DRIVER(KIWIDBDriver);
                        }
                        else if (param.getName().equals("KIWIDBUser")) {
                                DBUser = param.getValue();
                            }
                        else if (param.getName().equals("KIWIDBPswd")) {
                                    DBPswd = param.getValue();
                                }   
                        else if (param.getName().equals("HostName"))
                        {
                            DBHost = param.getValue();
                        }
                        else if (param.getName().equals("Path"))
                        {
                            DBPath = param.getValue();
                        }   
                        else if (param.getName().equals("KIWIConnectString"))
                        {
                            DBConnectString = param.getValue();
                            dao.setDBConnectString(DBConnectString);
                        }
                    }
                }
                else if (paramGroup.getName().equals("KIWI CallBack URI")){
                 
                    
                    for(int j=0; j<paramGroup.getParameter().size(); j++)
                    {
                        
                        Parameter param = (Parameter)paramGroup.getParameter().get(j);
                        
                        if (param.getName().equals("uriImport"))
                        {
                            String uri = "";
                            uri = param.getValue();
                            dao.setURIImport(uri);
                        }
                        
                        else if(param.getName().equals("uriExport"))
                        {
                            String uri = "";
                            uri = param.getValue();
                            dao.setURIExport(uri);
                        }
                        
                        else if(param.getName().equals("uriPick"))
                        {
                            String uri = "";
                            uri = param.getValue();
                            dao.setURIPick(uri);
                        } 
                    }
                }
                
                if (paramGroup.getName().equals("Report")){
                    for(int j=0; j<paramGroup.getParameterGroup().size(); j++)
                    {
                         ParameterGroup paramGroup1 = (ParameterGroup) paramGroup.getParameterGroup().get(j);
                         
                          for(int k=0; k<paramGroup1.getParameter().size(); k++)
                          {
                              Parameter param = (Parameter) paramGroup1.getParameter().get(k);
                              
                              if (param.getName().equals("Path")){
                                path = param.getValue();                                                          
                            dao.setReportPath(path);
                              }
                          }
                    }
                }
            }
       }
       
        catch (Exception ex)
        {
            System.out.println("Read config file error: "+ex.getMessage());
            ex.printStackTrace();
        }
       
        dao.setDBHost(DBHost);
        dao.setDBPath(DBPath);
        dao.setDBUser(DBUser);
        dao.setDBPswd(DBPswd);
        dao.setDB_DRIVER(KIWIDBDriver);
        dao.setDBConnectString(DBConnectString);
        context.setAttribute("Liconic", dao);
      //  dao.watchReports();
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        
    }
}
