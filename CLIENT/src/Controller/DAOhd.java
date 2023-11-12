
package Controller;

import Model.M_DBconnect;
import Model.M_Hoadon;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAOhd {
    public static void main(String[] args){
        M_DBconnect.loadConnection();
    }
    public ArrayList<M_Hoadon> getListHD()
    {
        ArrayList<M_Hoadon> list=new ArrayList<>();
        String sql="SELECT * FROM hoadon";
        try{
            PreparedStatement ps=M_DBconnect.con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                M_Hoadon n=new M_Hoadon();
                n.setMaHD(rs.getInt("ID"));
                n.setDateOrder(rs.getString("Date"));
                n.setThanhtien(rs.getInt("Thanhtien"));
                list.add(n);                        
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    } 
}
