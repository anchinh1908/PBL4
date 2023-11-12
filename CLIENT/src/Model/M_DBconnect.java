
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class M_DBconnect {

    public static Connection con=null;
    
    public static void loadConnection(){
        String url="jdbc:mysql://127.0.0.1:3360/pbl";
        String root="root";
        String pass="Chinhm245#";
                
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
