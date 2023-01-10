/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Dom.DTO.Message;
import Dom.DTO.MessageType;
import Dom.DTO.Response;
import Dom.DTO.UserDTO;
import Dom.SMSFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Attou
 */
public class DALManager {
    DBAdder objAdder;
    SqlConnection objConnection;
    RecordMapper objMapper;
    DBReader objReader;

    public DALManager(RecordMapper mapper) {
        objConnection = new SqlConnection("DESKTOP-A161ST8","contextualchatting", "root","fwth1234");
        objAdder = SMSFactory.getInstanceOfAdder();
        this.objMapper=mapper;
        this.objReader=SMSFactory.getInstanceOfReader();
    }
    
    public ArrayList<UserDTO> getUsersList(String searchKey) {
                
        Connection  dbConnection = objConnection.getConnection();
        String viewEmployeesQuery = "Select * from Users where Username='"+searchKey+"';";
        
        ResultSet rs = objReader.getRecords(viewEmployeesQuery, dbConnection);
        return objMapper.getUsers(rs);        
    }  
    
    public void saveUser(UserDTO objUser, Response objResponse) {
        try{
            Connection  dbConnection = objConnection.getConnection();
            objAdder.saveEmployee(objUser,objResponse,dbConnection);            
        }catch(Exception e){
        objResponse.messagesList.add(new Message("Ooops! Failed to create employee, Please contact support that there an issue while saving new employee.", MessageType.Error));
        objResponse.messagesList.add(new Message(e.getMessage() + "\n Stack Track:\n"+e.getStackTrace(), MessageType.Exception));
        }
    }
    
}
