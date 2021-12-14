package entities;

public class CanBo {
    private String hoTen;
    private int tuoi;
    private String diaChi;
    private String gioiTinh;

    public CanBo() {
    }

    public CanBo(String hoTen, int tuoi, String diaChi, String gioiTinh) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public String getHoTen() {
        return this.hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return this.tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return this.diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return this.gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public CanBo hoTen(String hoTen) {
        setHoTen(hoTen);
        return this;
    }

    public CanBo tuoi(int tuoi) {
        setTuoi(tuoi);
        return this;
    }

    public CanBo diaChi(String diaChi) {
        setDiaChi(diaChi);
        return this;
    }

    public CanBo gioiTinh(String gioiTinh) {
        setGioiTinh(gioiTinh);
        return this;
    }
    
    @Override
    public String toString() {
        return "{" +
            " hoTen='" + getHoTen() + "'" +
            ", tuoi='" + getTuoi() + "'" +
            ", diaChi='" + getDiaChi() + "'" +
            ", gioiTinh='" + getGioiTinh() + "'" +
            "}";
    }

}
