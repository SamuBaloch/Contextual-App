/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Attou
 */
public class SqlConnection {
    private String servername;
    private String DBName;
    private String DBUsername;
    private String DBPassword;

     public SqlConnection(String servername, String DBName, String DBUsername, String DBPassword) {
        this.servername = servername;
        this.DBName = DBName;
        this.DBUsername = DBUsername;
        this.DBPassword = DBPassword;
    }
    public Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/contextualchatting", "root", "fwth1234");
        }
        catch(Exception ex){
            System.out.println("Error Trace in getConnection() : " + ex.getMessage());
        }
        return null;
    }
    
}
