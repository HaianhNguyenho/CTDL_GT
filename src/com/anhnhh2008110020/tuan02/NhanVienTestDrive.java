package com.anhnhh2008110020.tuan02;

public class NhanVienTestDrive {
    public static void main(String[] args) {
        NhanVien nhanVien;
        nhanVien = new NhanVien();
        nhanVien.tenNhanVien = "Nguyễn Hồ Hải Anh";
        nhanVien.luong = 1000000;
        nhanVien.diaChi = "90/6 Yên Thế, P.2,Q.Tân Bình";
        nhanVien.boPhanLamViec = "Thiết kế";
        nhanVien.ngaySinh = "9";

        nhanVien.inNhanVien();
    }
    
}
