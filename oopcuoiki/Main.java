import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Random;
public class Main {
    public static void thongTinKhachHang(String tenKhCanTim, ChiNhanhNganHang chiNhanh1){
        boolean found = false;
        for(KhachHang kh : chiNhanh1.getDsKhachHang()){
            if(kh.getTenKhachHang().equals(tenKhCanTim)){
                System.out.println(kh.toString());
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Khong tim thay khach hang can tim");
        }
    }

    public static GiaoDich thucHienGiaoDich(String loaiGD, int soTkGd, int soTienGd, ChiNhanhNganHang chiNhanh1, GiaoDich gd){
        // W là rút tiền , D là gửi        
        Random rd = new Random();
        int rand = rd.nextInt(100)+1;
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        String ngayGd = formatter.format(date);
        if(loaiGD == "W"){
            for(KhachHang kh : chiNhanh1.getDsKhachHang()){
                for(TaiKhoan tk: kh.getDsTaiKhoan()){
                    if(tk.getSoTaiKhoan() == soTkGd){
                        if((tk.getSoDu() - soTienGd) < 0){
                            System.out.println("Khong du tien de rut");
                            break;
                        }else{
                            tk.setSoDu(tk.getSoDu() - soTienGd);
                            System.out.println("Rut tien thanh cong");
                            break;
                        }
                    }
                }
            }
        }else{
            for(KhachHang kh : chiNhanh1.getDsKhachHang()){
                for(TaiKhoan tk: kh.getDsTaiKhoan()){
                    if(tk.getSoTaiKhoan() == soTkGd){
                        tk.setSoDu(tk.getSoDu() + soTienGd);
                        System.out.println("Gui tien thanh cong");
                        break;
                    }
                }
            }
        }
        gd.setLoaiGiaoDich(loaiGD);
        gd.setMaGiaoDich(loaiGD + ":" + rand);
        gd.setSoTienGiaoDich(soTienGd);
        gd.setNgayGiaoDich(ngayGd);
        return gd;
    }
    public static void hienThiTatCaGiaoDich(ChiNhanhNganHang chiNhanh1){
        int i = 1;
        System.out.println("======== TAT CA GIAO DICH CUA KHACH HANG ========");
        for(KhachHang kh: chiNhanh1.getDsKhachHang()){
            for(TaiKhoan tk: kh.getDsTaiKhoan()){
                for(GiaoDich gd: tk.getDsGiaoDich()){
                    System.out.println(i + ": " + gd.toString());
                    i ++;
                }
            }
        }
        System.out.println("==================================================");
    }
    public static void main(String[] args) {
        // CÂU A: KHAI BÁO MỘT CHI NHÁNH 
        ChiNhanhNganHang chiNhanh1 = new ChiNhanhNganHang(); 

        KhachHang kh1 = new KhachHang(); // khách hàng của chi nhánh 1
        KhachHang kh2 = new KhachHang(); // khách hàng của chi nhánh 1
        TaiKhoan tk1 = new TaiKhoan();
        TaiKhoan tk2 = new TaiKhoan();
        TaiKhoan tk3 = new TaiKhoan();

        kh1.setTenKhachHang("ThanhDat");
        kh1.setMaKhachHang("VIP1");
        kh1.setThon("Thon 8");
        kh1.setHuyen("Huyen Dai Loc");
        kh1.setXa("ABC");
        kh1.setTinh("Quang Nam");

        kh2.setTenKhachHang("d47");
        kh2.setMaKhachHang("VIP2");
        kh2.setThon("Thon 7");
        kh2.setHuyen("Huyen Dai Son");
        kh2.setXa("EFG");
        kh2.setTinh("Quang Ngai");

        tk1.setSoTaiKhoan(12345);
        tk1.setSoDu(500000);
        tk2.setSoTaiKhoan(23456);
        tk2.setSoDu(400000);
        tk3.setSoTaiKhoan(111111);
        tk3.setSoDu(99999);

        kh1.getDsTaiKhoan().add(tk1); // khách hàng 1 có 2 tài khoản
        kh1.getDsTaiKhoan().add(tk2); // khách hàng 1 có 2 tài khoản
        kh2.getDsTaiKhoan().add(tk3);  // khách hàng 2 có 1 tài khoản

        chiNhanh1.getDsKhachHang().add(kh1);
        chiNhanh1.getDsKhachHang().add(kh2);

        // CÂU B: IN RA THÔNG TIN CỦA MỘT KHÁCH HÀNG BẤT KÌ 
        thongTinKhachHang("ThanhDat", chiNhanh1);

        // CÂU C: THỰC HIỆN RÚT TIỀN VÀ GỬI TIỀN VÀO MỘT TÀI KHOẢN BẤT KÌ 
        tk1.getDsGiaoDich().add(thucHienGiaoDich("W", 12345, 50000, chiNhanh1, new GiaoDich()));
        tk2.getDsGiaoDich().add(thucHienGiaoDich("D", 23456, 300000, chiNhanh1, new GiaoDich()));
        tk3.getDsGiaoDich().add(thucHienGiaoDich("W", 111111, 8888, chiNhanh1, new GiaoDich()));
        // thongTinKhachHang("ThanhDat", chiNhanh1);

        // CÂU D: THỰC HIỆN IN RA TẤT CẢ CÁC GIAO DỊCH CỦA KHÁCH HÀNG RA MÀN HÌNH 
        hienThiTatCaGiaoDich(chiNhanh1);
        
        // CÂU E: LIỆT KÊ TẤT CẢ CÁC TÀI KHOẢN CỦA KHÁCH HÀNG CÓ SỐ DƯ LỚN NHẤT
        for(KhachHang kh: chiNhanh1.getDsKhachHang()){
            int max = 0;
            for(TaiKhoan tk: kh.getDsTaiKhoan()){
                if(max < tk.getSoDu()){
                    max = tk.getSoDu();
                }
            }
            System.out.println("So du lon nhat cua khach hang " + kh.getTenKhachHang() + " la " + max);
            System.out.println();
        }


        // CÂU F: SẮP XẾP TĂNG DẦN THEO TỔNG SỐ DƯ CỦA TỪNG KHÁCH HÀNG VÀ IN RA THÔNG TIN CỦA KHÁCH HÀNG NÀY
        Collections.sort(chiNhanh1.getDsKhachHang(), new Comparator<KhachHang>() {
            @Override
            public int compare(KhachHang kh1, KhachHang kh2) {
                int sum1 = 0;
                int sum2 = 0;
                
                for (TaiKhoan taiKhoan : kh1.getDsTaiKhoan()) {
                    sum1 += taiKhoan.getSoDu();
                }
                
                for (TaiKhoan taiKhoan : kh2.getDsTaiKhoan()) {
                    sum2 += taiKhoan.getSoDu();
                }
                
                return (sum1 > sum2) ? 1 : (sum1 == sum2) ? 0 : -1;
            }
        });
        System.out.println("Danh sach ten khach hang co tong so du sap xep tang dan");
        for(KhachHang kh: chiNhanh1.getDsKhachHang()){
            System.out.println(kh.getTenKhachHang());
        }

        // CÂU G: HIỂN THỊ KHÁCH HÀNG CÓ TỔNG SỐ LƯỢNG GIAO DỊCH CAO NHẤT 
        KhachHang khCoGdCaoNhat = new KhachHang();
        int max = 0;
        for(KhachHang kh: chiNhanh1.getDsKhachHang()){
            int tmp = 0;
            for(TaiKhoan tk: kh.getDsTaiKhoan()){
                tmp = tmp + tk.getDsGiaoDich().size();
            }
            if(max < tmp){
                max = tmp;
                khCoGdCaoNhat = kh;
            }
        }
        System.out.println("Khach hang co so luong giao dich cao nhat la: " + khCoGdCaoNhat.getTenKhachHang() + " co " + max + " giao dich");
    }
}
