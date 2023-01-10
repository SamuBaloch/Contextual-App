/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dom.Validators;

import Dom.DTO.Message;
import Dom.DTO.MessageType;
import Dom.DTO.Response;
import Dom.DTO.UserDTO;
/**
 *
 * @author Attou
 */
public class CommonValidator {
    public static void validateUser(UserDTO objUser, Response objResponse) {
        isValidName(objUser.FirstName, objResponse);
        isValidName(objUser.LastName, objResponse);
    }

    private static void isValidName(String nameToValidate, Response objResponse) {
        if(nameToValidate == null || nameToValidate.length() < 3){
            objResponse.messagesList.add(new Message("Provide valid first name and last name with at least 3 characters.",MessageType.Error));            
        }
    }
}
