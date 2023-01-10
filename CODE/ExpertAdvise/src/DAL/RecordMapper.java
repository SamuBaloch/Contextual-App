/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Dom.DTO.UserDTO;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Attou
 */
public class RecordMapper {
    ArrayList<UserDTO> getUsers(ResultSet rs) {
        ArrayList<UserDTO> emplist = new ArrayList<>();
        try{
        while (rs.next())
            {
                UserDTO objUser=new UserDTO();                
                objUser.FirstName=rs.getString(1);
                objUser.LastName= rs.getString(2);
                objUser.Username =rs.getString(3);
                objUser.Email=rs.getString(4);  
                objUser.PhoneNo=rs.getString(5); 
                objUser.Password=rs.getString(6); 
                emplist.add(objUser);
            }
        }catch (Exception e){
        }
        return emplist;
    }
}
