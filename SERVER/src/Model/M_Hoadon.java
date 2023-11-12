
package Model;

public class M_Hoadon {
    private int MaHD;
    private String DateOrder;
    private int Thanhtien;
    
    public M_Hoadon(){
        
    }

    public M_Hoadon(String DateOrder, int Thanhtien) {
        this.DateOrder = DateOrder;
        this.Thanhtien = Thanhtien;
    }

    public M_Hoadon(int MaHD, String DateOrder, int Thanhtien) {
        this.MaHD = MaHD;
        this.DateOrder = DateOrder;
        this.Thanhtien = Thanhtien;
    }

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public String getDateOrder() {
        return DateOrder;
    }

    public void setDateOrder(String DateOrder) {
        this.DateOrder = DateOrder;
    }

    public int getThanhtien() {
        return Thanhtien;
    }

    public void setThanhtien(int Thanhtien) {
        this.Thanhtien = Thanhtien;
    }
    
            
          
}
