import java.util.ArrayList;

public class TaiKhoan {
    private int soTaiKhoan;
    private int soDu;
    private ArrayList<GiaoDich> dsGiaoDich = new ArrayList<GiaoDich>();

    public TaiKhoan() {
    }

    public TaiKhoan(int soTaiKhoan, int soDu, ArrayList<GiaoDich> dsGiaoDich) {
        this.soTaiKhoan = soTaiKhoan;
        this.soDu = soDu;
        this.dsGiaoDich = dsGiaoDich;
    }

    public int getSoTaiKhoan() {
        return this.soTaiKhoan;
    }

    public void setSoTaiKhoan(int soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public int getSoDu() {
        return this.soDu;
    }

    public void setSoDu(int soDu) {
        this.soDu = soDu;
    }

    public ArrayList<GiaoDich> getDsGiaoDich() {
        return this.dsGiaoDich;
    }

    public void setDsGiaoDich(ArrayList<GiaoDich> dsGiaoDich) {
        this.dsGiaoDich = dsGiaoDich;
    }

    @Override
    public String toString() {
        return "{" +
            " soTaiKhoan='" + getSoTaiKhoan() + "'" +
            ", soDu='" + getSoDu() + "'" +
            ", dsGiaoDich='" + getDsGiaoDich() + "'" +
            "}";
    }

}
