package manager;

import abs.ChucNang;
import entities.CanBo;

public class QuanLi extends ChucNang {

    @Override
    public void themCanBo(CanBo c) {
        this.dsCanBo.add(c);
        System.out.println("Da them can bo thanh cong");
    }

    @Override
    public void timKiemTheoHoTen(String name) {
        boolean found = false;
        for (CanBo canBo : dsCanBo) {
            if(canBo.getHoTen().equalsIgnoreCase(name)){
                System.out.println("Thong tin cua can bo can tim la: ");
                System.out.println(canBo.toString());
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Can bo can tim khong tim thay!");
        }
        
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Danh sach cua tat ca can bo: ");
        for (CanBo canBo : dsCanBo) {
            System.out.println(canBo.toString());
        }
    }

    @Override
    public void thoatChuongTring() {
        System.out.println("Dang thoat chuong trinh");
    }
}
