public class DiaChi {
    private String thon;
    private String xa;
    private String huyen;
    private String tinh;

    public DiaChi() {
    }

    public DiaChi(String thon, String xa, String huyen, String tinh) {
        this.thon = thon;
        this.xa = xa;
        this.huyen = huyen;
        this.tinh = tinh;
    }

    public String getThon() {
        return this.thon;
    }

    public void setThon(String thon) {
        this.thon = thon;
    }

    public String getXa() {
        return this.xa;
    }

    public void setXa(String xa) {
        this.xa = xa;
    }

    public String getHuyen() {
        return this.huyen;
    }

    public void setHuyen(String huyen) {
        this.huyen = huyen;
    }

    public String getTinh() {
        return this.tinh;
    }

    public void setTinh(String tinh) {
        this.tinh = tinh;
    }

    public DiaChi thon(String thon) {
        setThon(thon);
        return this;
    }

    public DiaChi xa(String xa) {
        setXa(xa);
        return this;
    }

    public DiaChi huyen(String huyen) {
        setHuyen(huyen);
        return this;
    }

    public DiaChi tinh(String tinh) {
        setTinh(tinh);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " thon='" + getThon() + "'" +
            ", xa='" + getXa() + "'" +
            ", huyen='" + getHuyen() + "'" +
            ", tinh='" + getTinh() + "'" +
            "}";
    }

}
