import java.util.ArrayList;

public class KhachHang extends DiaChi {
    private String maKhachHang;
    private String tenKhachHang;
    private ArrayList<TaiKhoan> dsTaiKhoan = new ArrayList<>();


    public KhachHang() {
    }

    public KhachHang(String thon, String xa, String huyen, String tinh, String maKhachHang, String tenKhachHang, ArrayList<TaiKhoan> dsTaiKhoan) {
        super(thon, xa, huyen, tinh);
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.dsTaiKhoan = dsTaiKhoan;
    }

    public String getMaKhachHang() {
        return this.maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenKhachHang() {
        return this.tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public ArrayList<TaiKhoan> getDsTaiKhoan() {
        return this.dsTaiKhoan;
    }

    public void setDsTaiKhoan(ArrayList<TaiKhoan> dsTaiKhoan) {
        this.dsTaiKhoan = dsTaiKhoan;
    }

    @Override
    public String toString() {
        return "{" +
            " maKhachHang='" + getMaKhachHang() + "'" +
            ", tenKhachHang='" + getTenKhachHang() + "'" +
            ", dsTaiKhoan='" + getDsTaiKhoan() + "'" +
            "}";
    }
}
