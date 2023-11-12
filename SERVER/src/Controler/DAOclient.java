/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import Model.M_Client;
import Model.M_DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAOclient {
    
   public static void main(String[] args){
        M_DBconnect.loadConnection();
    }
   
    public ArrayList<M_Client> getListClients(){
        ArrayList<M_Client> list = new ArrayList<>();
        String sql = "SELECT * FROM client ";
        try{
            PreparedStatement ps = M_DBconnect.con.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
            while(rs.next()){
                M_Client c =new M_Client();
                c.setID(rs.getInt("id"));
                c.setUsername(rs.getString("username"));
                c.setPassword(rs.getString("password"));
                c.setBlock(rs.getString("block"));
                list.add(c);
            }
        }catch(Exception e){JOptionPane.showMessageDialog(null, "loi "+e);}
        return list;
    }
    
    
}
