package entities;
public class CongNhan extends CanBo {
    private int bac;

    public CongNhan(String hoTen, int tuoi, String diaChi, String gioiTinh,int bac) {
        super(hoTen, tuoi, diaChi, gioiTinh);
        this.bac = bac;
    }

    public int getBac() {
        return this.bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "{" + super.toString() +
            " bac='" + getBac() + "'" +
            "}";
    }
    
}
