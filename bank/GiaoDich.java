public class GiaoDich {
    private String maGiaoDich;
    private  String ngayGiaoDich;
    private int soTienGiaoDich;
    private String loaiGiaoDich;

    public GiaoDich() {
    }

    public GiaoDich(String maGiaoDich, String ngayGiaoDich, int soTienGiaoDich, String loaiGiaoDich) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.soTienGiaoDich = soTienGiaoDich;
        this.loaiGiaoDich = loaiGiaoDich;
    }

    public String getMaGiaoDich() {
        return this.maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public String getNgayGiaoDich() {
        return this.ngayGiaoDich;
    }

    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public int getSoTienGiaoDich() {
        return this.soTienGiaoDich;
    }

    public void setSoTienGiaoDich(int soTienGiaoDich) {
        this.soTienGiaoDich = soTienGiaoDich;
    }

    public String getLoaiGiaoDich() {
        return this.loaiGiaoDich;
    }

    public void setLoaiGiaoDich(String loaiGiaoDich) {
        this.loaiGiaoDich = loaiGiaoDich;
    }

    @Override
    public String toString() {
        return "{" +
            " maGiaoDich='" + getMaGiaoDich() + "'" +
            ", ngayGiaoDich='" + getNgayGiaoDich() + "'" +
            ", soTienGiaoDich='" + getSoTienGiaoDich() + "'" +
            ", loaiGiaoDich='" + getLoaiGiaoDich() + "'" +
            "}";
    }

}
