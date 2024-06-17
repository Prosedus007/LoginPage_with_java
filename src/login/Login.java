/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package login;

/**
 *
 * @author msraut
 * 
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Login {

    public static void main(String[] args) {
        
        String url = "jdbc:mysql://localhost:3306/login";
        String user = "root";
        String password = "prosedus";
 
            class.forName("com.mysql.cj.jdbc.Driver");
//            class.forName("oracle.jdbc.driver.OracleDriver");
            try(Connection connection =DriverManager.getConnection(url,user,password)){
            if(connection != null){
                System.out.println("Connected to database");
            }else{
                System.out.println("Connection Failed");
            }
            }catch(SQLException e){
                System.out.println(e);
            }
     
        
        
        
        // TODO code application logic here
        Login1 LoginFrame = new Login1();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
    }
    
}
