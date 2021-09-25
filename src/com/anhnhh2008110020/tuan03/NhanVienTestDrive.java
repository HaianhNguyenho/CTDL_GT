package com.anhnhh2008110020.tuan03;

public class NhanVienTestDrive {
    public static void main(String[] args) {
        NhanVien nhanVien;
        nhanVien = new NhanVien("HaiAnh",10000000, "90/6 Yên Thế", "Kỹ Thuật", 9);
        System.out.println("Tên Nhân Viên:"+nhanVien.tenNhanVien+",Lương:"+nhanVien.luong+",Địa chỉ làm việc"+nhanVien.diaChi+",Bộ phận làm việc:"+nhanVien.boPhanLamViec+",Ngày Sinh:"+nhanVien.ngaySinh);
    }
    
}
