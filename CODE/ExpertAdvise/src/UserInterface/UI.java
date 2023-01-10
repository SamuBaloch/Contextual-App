/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserInterface;
import Dom.DTO.Response;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
/**
 *
 * @author Attou
 */
public class UI {
    static void handleResponse(Response objResponse) {
        if(objResponse.hasError()){
            JOptionPane.showMessageDialog(new JFrame(), objResponse.getErrorMessages(),"ERROR",JOptionPane.ERROR_MESSAGE);
            /*if(uiComponent instanceof JLabel){
                ((JLabel)uiComponent).setText(objResponse.getErrorMessages());
                ((JLabel)uiComponent).setForeground(Color.RED);
            }*/
        }
    }
}
