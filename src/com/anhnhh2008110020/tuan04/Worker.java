package com.anhnhh2008110020.tuan04;

public class Worker {
    String tenNhanVien;
    int luong;
    String diaChi;
    String boPhanLamViec;
    int ngaySinh;

    Worker(){};

    Worker(String t,int l,String d,String b,int n){
        tenNhanVien = t;
        luong = l;
        diaChi = d;
        boPhanLamViec = b;
        ngaySinh = n;
    }
    void inThongTin(){
        System.out.println("Tên Nhân Viên: "+tenNhanVien+" Lương: "+luong+" Địa chỉ: "+diaChi+" Bộ phận làm việc: "+boPhanLamViec+" Ngày sinh: "+ngaySinh );
    }
    
}
