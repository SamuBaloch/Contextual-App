/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Dom.DTO.Message;
import Dom.DTO.MessageType;
import Dom.DTO.Response;
import Dom.DTO.UserDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Attou
 */
public class DBAdder {
    void saveEmployee(UserDTO objEmp, Response objResponse, Connection dbConnection) {
        try{
            PreparedStatement p = dbConnection.prepareStatement("INSERT INTO Users (FirstName,LastName,Username,Email,PhoneNo,Password) VALUES (?,?,?,?,?,?);");
            p.setString(1, objEmp.FirstName);
            p.setString(2, objEmp.LastName);
            p.setString(3, objEmp.Username);
            p.setString(4, objEmp.Email);
            p.setString(5, objEmp.PhoneNo);
            p.setString(6, objEmp.Password);
            int rowsInserted = p.executeUpdate();
            
            if(rowsInserted > 0){
                objResponse.messagesList.add(new Message("User added successfully.", MessageType.Information));
            }
        }catch(SQLException e){
            objResponse.messagesList.add(new Message("Oops! Failed to create employee, Please contact support that there an issue while saving new employee.", MessageType.Error));
            objResponse.messagesList.add(new Message(e.getMessage() + "\n Stack Track:\n"+e.getStackTrace(), MessageType.Exception));
        }
    }
}
