
package Controller;

import Model.M_DBconnect;
import javax.swing.*;
import java.sql.*;

public class C_checkLogin {
    
    public boolean checkLogin(String email,String pass){
        M_DBconnect.loadConnection();
        boolean b=false;
        try{
            String query="select username,password from client where username='"+email+"' AND password='"+pass+"' ";
            Statement st=M_DBconnect.con.createStatement();
            ResultSet rs=st.executeQuery(query);

            if(rs.next()){
                b=true;
            }else{
                JOptionPane.showMessageDialog(null,"That bai, nhap lai..");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,""+ e);
        }
        return b;
    }
}
