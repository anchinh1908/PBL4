
package Controler;

import Model.M_DBconnect;
import Model.M_Sanpham;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Statement;

public class DAOsp {
    public static void main(String[] args){
        M_DBconnect.loadConnection();
    }
    public ArrayList<M_Sanpham> getListSP()
    {
        ArrayList<M_Sanpham> list=new ArrayList<>();
        String sql="SELECT * FROM sanpham";
        try{
            PreparedStatement ps=M_DBconnect.con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                M_Sanpham n=new M_Sanpham();
                //n.setId(rs.getInt("ID"));
                n.setMasp(rs.getInt("Masanpham"));
                n.setTensp(rs.getString("Tensanpham"));
                n.setTenloai(rs.getString("Tenloai"));
                n.setSoluong(rs.getInt("Soluong"));
                n.setGia(rs.getInt("Gia"));
                list.add(n);                        
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    } 
    public void AddSP(M_Sanpham s){
        String sql="insert into sanpham values(?,?,?,?,?)";
        try{
            PreparedStatement ps=M_DBconnect.con.prepareStatement(sql);
            ps.setInt(1,(int) s.getMasp());
            ps.setString(2,s.getTensp());
            ps.setString(3,s.getTenloai());
            ps.setInt(4,s.getSoluong());
            ps.setInt(5, (int) s.getGia());
            ps.executeUpdate();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void DeleteSP(int Masp){
        String sql="delete from sanpham where Masanpham=?";
        try{
            PreparedStatement ps=M_DBconnect.con.prepareCall(sql);
            ps.setInt(1, Masp);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public ArrayList<M_Sanpham> findbyTensp(String Namesp)
    {
        ArrayList<M_Sanpham> list=new ArrayList<>();
        String sql="SELECT * FROM sanpham where Tensanpham like ?";
        try{
            PreparedStatement ps=M_DBconnect.con.prepareStatement(sql);
            ps.setString(1,"%"+Namesp+"%");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                M_Sanpham n=new M_Sanpham();
                n.setMasp(rs.getInt("Masanpham"));  
                n.setTensp(rs.getString("Tensanpham"));
                n.setTenloai(rs.getString("Tenloai"));
                n.setSoluong(rs.getInt("Soluong"));
                n.setGia(rs.getInt("Gia"));
                list.add(n);                        
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
    //đổ tên loại sản phẩm từ textfield vào combobox tên loại sản phẩm
    public int countCategories(){
        int total=0;
        try{
            Statement st=M_DBconnect.con.createStatement();
            ResultSet rs=st.executeQuery("Select count(*) as 'total' from ctsp");
            if(rs.next()){
                total=rs.getInt(1);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return total;     
        }
    public String[] getCat(){
        String[] categories=new String[countCategories()];
        try{
            Statement st=M_DBconnect.con.createStatement();
            ResultSet rs=st.executeQuery("Select * from ctsp");
            int i=0;
            while(rs.next()){
                categories[i]=rs.getString(2);
                i++;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return categories; 
    }
    //hàm kiểm tra tên sản phẩm và tên loại sản phẩm đã tồn tại
    public boolean isProCateExist(String pro, String cat){
        String sql="SELECT * FROM sanpham where Tensanpham = ? and Tenloai=?";
        try {
            PreparedStatement ps=M_DBconnect.con.prepareStatement(sql);
            ps.setString(1,pro);
            ps.setString(2,cat);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                return true;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}


