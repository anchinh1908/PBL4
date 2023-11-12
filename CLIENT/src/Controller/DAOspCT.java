
package Controller;

import Model.M_DBconnect;
import Model.M_SanphamCT;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DAOspCT {
    public static void main(String[] args){
        M_DBconnect.loadConnection();
    }
    public ArrayList<M_SanphamCT> getListSPCT()
    {
        ArrayList<M_SanphamCT> list=new ArrayList<>();
        String sql="SELECT * FROM ctsp";
        try{
            PreparedStatement ps=M_DBconnect.con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                M_SanphamCT n=new M_SanphamCT();
                  n.setMaloai(rs.getInt("MaLoai"));
                  n.setTenloai(rs.getString("TenLoai"));
                  n.setMota(rs.getString("Mota"));
                list.add(n);                        
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    } 

    public void AddSPCT(M_SanphamCT s){
        String sql="insert into ctsp values(?,?,?)";
        try{
            PreparedStatement ps=M_DBconnect.con.prepareStatement(sql);
              ps.setInt(1,s.getMaloai());
              ps.setString(2,s.getTenloai());
              ps.setString(3,s.getMota());
            ps.executeUpdate();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void DeleteSPCT(int mact){
        String sql="delete from ctsp where Maloai=?";
        try{
            PreparedStatement ps=M_DBconnect.con.prepareCall(sql);
            ps.setInt(1, mact);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
