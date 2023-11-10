
package Model;

import java.util.Date;


public class M_Nhanvien {
    private int id;
    private String Manv,Tennv,Chucvu,Gt,Diachi,Email;
    private Date date;
    private int luong;

    public M_Nhanvien(){
    }

    public M_Nhanvien(String Manv, String Tennv, String Chucvu, String Gt, String Diachi, String Email, Date date, int luong) {
        this.Manv = Manv;
        this.Tennv = Tennv;
        this.Chucvu = Chucvu;
        this.Gt = Gt;
        this.Diachi = Diachi;
        this.Email = Email;
        this.date = date;
        this.luong = luong;
    }

    public M_Nhanvien(int id, String Manv, String Tennv, String Chucvu, String Gt, String Diachi, String Email, Date date, int luong) {
        this.id = id;
        this.Manv = Manv;
        this.Tennv = Tennv;
        this.Chucvu = Chucvu;
        this.Gt = Gt;
        this.Diachi = Diachi;
        this.Email = Email;
        this.date = date;
        this.luong = luong;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManv() {
        return Manv;
    }

    public void setManv(String Manv) {
        this.Manv = Manv;
    }

    public String getTennv() {
        return Tennv;
    }

    public void setTennv(String Tennv) {
        this.Tennv = Tennv;
    }

    public String getChucvu() {
        return Chucvu;
    }

    public void setChucvu(String Chucvu) {
        this.Chucvu = Chucvu;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }



    public String getGt() {
        return Gt;
    }

    public void setGt(String Gt) {
        this.Gt = Gt;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }
    
}
