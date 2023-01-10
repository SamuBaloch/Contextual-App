/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dom;

import DAL.DALManager;
import DAL.DBAdder;
import DAL.DBReader;
import DAL.RecordMapper;
import Dom.DTO.Response;

/**
 *
 * @author Attou
 */
public class SMSFactory {
    public static OSSController getInstanceOfSMSController() {
        return new OSSController();
    }

    static Response getResponseInstance() {
        return new Response();
    }
    
    public static DBReader getInstanceOfReader() {
        return new DBReader();
    }
    
    static DALManager getInstanceOfDALManager() {
        return new DALManager(new RecordMapper());
    }
    
    public static DBAdder getInstanceOfAdder() {
        return new DBAdder();
    }
    
}
