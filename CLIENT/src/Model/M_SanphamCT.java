
package Model;


public class M_SanphamCT {
    private int id, Maloai;
    private String Tenloai,Mota;
    
    public M_SanphamCT(){}

    public M_SanphamCT(int id, int Maloai, String Tenloai, String Mota) {
        this.id = id;
        this.Maloai = Maloai;
        this.Tenloai = Tenloai;
        this.Mota = Mota;
    }

    public M_SanphamCT(int Maloai, String Tenloai, String Mota) {
        this.Maloai = Maloai;
        this.Tenloai = Tenloai;
        this.Mota = Mota;
    }

    public int getMaloai() {
        return Maloai;
    }

    public void setMaloai(int Maloai) {
        this.Maloai = Maloai;
    }

    public String getTenloai() {
        return Tenloai;
    }

    public void setTenloai(String Tenloai) {
        this.Tenloai = Tenloai;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String Mota) {
        this.Mota = Mota;
    }       

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
