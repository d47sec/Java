package app;

import java.util.Scanner;

import abs.QuanLi;
import entities.CongNhan;
import entities.KySu;
import entities.NhanVien;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLi qlcb = new QuanLi();
        while (true) {
            System.out.println("============= Chuong Trinh Quan Li Can Bo ==================");
            System.out.println("1: Them mot can bo");
            System.out.println("2: Tim kiem can bo theo ten");
            System.out.println("3: Hien thi tat ca cac bo");
            System.out.println("4: Thoat chuong trinh:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("a: Them Ky Su");
                    System.out.println("b: Them Cong Nhan");
                    System.out.println("c: Them Nhan Vien");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            System.out.print("Nhap ten: ");
                            String hoTen = scanner.nextLine();
                            System.out.print("Nhap tuoi:");
                            int tuoi = scanner.nextInt();
                            System.out.print("Nhap gioi tinh: ");
                            scanner.nextLine();
                            String gioiTinh = scanner.nextLine();
                            System.out.print("Nhap dia chi: ");
                            String diaChi = scanner.nextLine();
                            System.out.print("Nhap nganh dao tao: ");
                            String nganhDaoTao = scanner.nextLine();
                            KySu ks = new KySu(hoTen, tuoi, diaChi, gioiTinh, nganhDaoTao);
                            qlcb.themCanBo(ks);
                            break;

                        }
                        case "b": {
                            System.out.print("Nhap ten: ");
                            String hoTen = scanner.nextLine();
                            System.out.print("Nhap tuoi:");
                            int tuoi = scanner.nextInt();
                            System.out.print("Nhap gioi tinh: ");
                            scanner.nextLine();
                            String gioiTinh = scanner.nextLine();
                            System.out.print("Nhap dia chi: ");
                            String diaChi = scanner.nextLine();
                            System.out.print("Nhap bac cua cong nhan: ");
                            int bac = scanner.nextInt();
                            CongNhan cn = new CongNhan(hoTen, tuoi, diaChi, gioiTinh, bac);
                            qlcb.themCanBo(cn);
                            scanner.nextLine();
                            break;
                        }
                        case "c": {
                            System.out.print("Nhap ten: ");
                            String hoTen = scanner.nextLine();
                            System.out.print("Nhap tuoi: ");
                            int tuoi = scanner.nextInt();
                            System.out.print("Nhap gioi tinh: ");
                            scanner.nextLine();
                            String gioiTinh = scanner.nextLine();
                            System.out.print("Nhap dia chi: ");
                            String diaChi = scanner.nextLine();
                            System.out.print("Nhap cong viec: ");
                            String congViec = scanner.nextLine();
                            NhanVien nv = new NhanVien(congViec, hoTen, tuoi, diaChi, gioiTinh);
                            qlcb.themCanBo(nv);
                            break;
                        }
                        default:
                            System.out.println("Khong hop le");
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.print("Nhap ten can bo de tim kiem: ");
                    String ten = scanner.nextLine();
                    qlcb.timKiemTheoHoTen(ten);
                    break;
                }
                case "3": {
                    qlcb.hienThiThongTin();
                    break;
                }
                case "4": {
                    qlcb.thoatChuongTring();
                    return;
                }
            }
        }
    }
}
