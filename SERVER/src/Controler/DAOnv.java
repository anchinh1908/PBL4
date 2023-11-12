
package Controler;
import Model.M_DBconnect;
import Model.M_Nhanvien;
import java.sql.*;
import java.util.ArrayList;

public class DAOnv {
    public static void main(String[] args){
        M_DBconnect.loadConnection();
    }
    public ArrayList<M_Nhanvien> getListNV()
    {
        ArrayList<M_Nhanvien> list=new ArrayList<>();
        String sql="SELECT * FROM nhanvien";
        try{
            PreparedStatement ps=M_DBconnect.con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                M_Nhanvien n=new M_Nhanvien();
                n.setId(rs.getInt("ID"));
                n.setManv(rs.getString("Manhanvien"));  
                n.setTennv(rs.getString("Hoten"));
                n.setChucvu(rs.getString("Chucvu"));
                n.setDate(rs.getDate("Ngaysinh"));
                n.setGt(rs.getString("Gioitinh"));
                n.setDiachi(rs.getString("Diachi"));
                n.setEmail(rs.getString("Email"));
                n.setLuong(rs.getInt("Luong"));
                list.add(n);                        
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    } 
    public void AddNV(M_Nhanvien n){
        String sql="insert into nhanvien values(null,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement ps=M_DBconnect.con.prepareStatement(sql);
            ps.setString(1,n.getManv());
            ps.setString(2,n.getTennv());
            ps.setString(3,n.getChucvu());
            ps.setObject(4,n.getDate());
            ps.setString(5,n.getGt());
            ps.setString(6,n.getDiachi());
            ps.setString(7, n.getEmail());
            ps.setInt(8, n.getLuong());
            ps.executeUpdate();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void DeleteNV(int id){
        String sql="delete from nhanvien where Id=?";
        try{
            PreparedStatement ps=M_DBconnect.con.prepareCall(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public ArrayList<M_Nhanvien> findbyName(String Name)
    {
        ArrayList<M_Nhanvien> list=new ArrayList<>();
        String sql="SELECT * FROM nhanvien where Hoten like ?";
        try{
            PreparedStatement ps=M_DBconnect.con.prepareStatement(sql);
            ps.setString(1,"%"+Name+"%");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                M_Nhanvien n=new M_Nhanvien();
                n.setId(rs.getInt("ID"));
                n.setManv(rs.getString("Manhanvien"));  
                n.setTennv(rs.getString("Hoten"));
                n.setChucvu(rs.getString("Chucvu"));
                n.setDate(rs.getDate("Ngaysinh"));
                n.setGt(rs.getString("Gioitinh"));
                n.setDiachi(rs.getString("Diachi"));
                n.setEmail(rs.getString("Email"));
                n.setLuong(rs.getInt("Lương"));
                list.add(n);                        
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    } 

}
