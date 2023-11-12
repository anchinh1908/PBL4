
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class M_DBconnect {

    public static Connection con=null;
    
    public static void loadConnection(){
        String url = "jdbc:mysql://localhost:3309/pbl4";
        String root = "root";
        String pass = "123456789";
                
        try{
           con=DriverManager.getConnection(url,root,pass);
           
           if(con!=null){
           System.out.println("Ket noi thanh cong");
           }
        } catch(Exception e){
            System.out.println("Loi");            
        }
}
}
