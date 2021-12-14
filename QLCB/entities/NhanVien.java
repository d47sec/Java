package entities;

public class NhanVien extends CanBo{
    private String congViec;

    public NhanVien() {
    }

    public NhanVien(String congViec,String hoTen, int tuoi, String diaChi, String gioiTinh) {
        super(hoTen, tuoi, diaChi, gioiTinh);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return this.congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    public NhanVien congViec(String congViec) {
        setCongViec(congViec);
        return this;
    }

    @Override
    public String toString() {
        return "{" +  super.toString() + 
            " congViec='" + getCongViec() + "'" +
            "}";
    }

}
