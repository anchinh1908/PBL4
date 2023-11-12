
package Model;

public class M_Sanpham {
    private int id,Masp;
    private String Tensp,Tenloai;
    private int Soluong;
    private int gia;

    public M_Sanpham(){
    }

    public M_Sanpham(int Masp, String Tensp, String Tenloai, int Soluong, int gia) {
        this.Masp = Masp;
        this.Tensp = Tensp;
        this.Tenloai = Tenloai;
        this.Soluong = Soluong;
        this.gia = gia;
    }

    public M_Sanpham(int id, int Masp, String Tensp, String Tenloai, int Soluong, int gia) {
        this.id = id;
        this.Masp = Masp;
        this.Tensp = Tensp;
        this.Tenloai = Tenloai;
        this.Soluong = Soluong;
        this.gia = gia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMasp() {
        return Masp;
    }

    public void setMasp(int Masp) {
        this.Masp = Masp;
    }

    public String getTensp() {
        return Tensp;
    }

    public void setTensp(String Tensp) {
        this.Tensp = Tensp;
    }

    public String getTenloai() {
        return Tenloai;
    }

    public void setTenloai(String Tenloai) {
        this.Tenloai = Tenloai;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }





    
}