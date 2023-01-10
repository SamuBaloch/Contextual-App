/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dom;

import DAL.DALManager;
import Dom.DTO.Response;
import Dom.DTO.UserDTO;
import Dom.Validators.CommonValidator;
import java.util.ArrayList;

/**
 *
 * @author Attou
 */
public class OSSController {
    DALManager objDAL;
    public OSSController(){
        objDAL = SMSFactory.getInstanceOfDALManager();
    }

    public ArrayList<UserDTO> viewUser(String searchKey) {
        return objDAL.getUsersList(searchKey);
    }
    
    public Response addUser(UserDTO objUser) {
        Response objResponse = SMSFactory.getResponseInstance();
        CommonValidator.validateUser(objUser,objResponse);
        if(objResponse.isSuccessfull()){
            objDAL.saveUser(objUser,objResponse);
        }
        else{
            System.out.println("");
        }
        return objResponse;
    }
}
