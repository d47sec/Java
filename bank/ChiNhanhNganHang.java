import java.util.ArrayList;

public class ChiNhanhNganHang{
    private String maChiNhanh;
    private String tenChiNhanh;
    private String diaChi;
    private ArrayList<KhachHang> dsKhachHang = new ArrayList<>();

    public ChiNhanhNganHang() {
    }

    public ChiNhanhNganHang(String maChiNhanh, String tenChiNhanh, String diaChi, ArrayList<KhachHang> dsKhachHang) {
        this.maChiNhanh = maChiNhanh;
        this.tenChiNhanh = tenChiNhanh;
        this.diaChi = diaChi;
        this.dsKhachHang = dsKhachHang;
    }

    public String getMaChiNhanh() {
        return this.maChiNhanh;
    }

    public void setMaChiNhanh(String maChiNhanh) {
        this.maChiNhanh = maChiNhanh;
    }

    public String getTenChiNhanh() {
        return this.tenChiNhanh;
    }

    public void setTenChiNhanh(String tenChiNhanh) {
        this.tenChiNhanh = tenChiNhanh;
    }

    public String getDiaChi() {
        return this.diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public ArrayList<KhachHang> getDsKhachHang() {
        return this.dsKhachHang;
    }

    public void setDsKhachHang(ArrayList<KhachHang> dsKhachHang) {
        this.dsKhachHang = dsKhachHang;
    }


    @Override
    public String toString() {
        return "{" +
            " maChiNhanh='" + getMaChiNhanh() + "'" +
            ", tenChiNhanh='" + getTenChiNhanh() + "'" +
            ", diaChi='" + getDiaChi() + "'" +
            ", dsKhachHang='" + getDsKhachHang() + "'" +
            "}";
    }

}
