/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dom.DTO;

/**
 *
 * @author Attou
 */
public class Message {
    public String Message;
    public MessageType type;

    public Message(String errorMessage, MessageType messageType) {
        this.Message = errorMessage;
        this.type = messageType;
    }
}
