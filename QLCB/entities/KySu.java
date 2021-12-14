package entities;

public class KySu extends CanBo {
    private String nganhDaoTao;

    public KySu(){
    }

    public KySu(String hoTen, int tuoi, String diaChi, String gioiTinh,String nganhDaoTao) {
        super(hoTen, tuoi, diaChi, gioiTinh);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return this.nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return "{" + super.toString() + 
            " nganhDaoTao='" + getNganhDaoTao() + "'" +
            "}";
    }

}
