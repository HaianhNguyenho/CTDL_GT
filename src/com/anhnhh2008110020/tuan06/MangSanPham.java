package com.anhnhh2008110020.tuan06;

public class MangSanPham {
    String tenSanPham;
    Double donGia;
    Double giamGia;
    Double thueNhapKhau;

   public  MangSanPham(){}

    MangSanPham(String tsp, Double dg, Double gg, Double tnk){
        tenSanPham = tsp;
        donGia = dg;
        giamGia = gg;
        thueNhapKhau = tnk;
    } 
    void inThongTin(){
        System.out.println("Tên Sản Phẩm: "+tenSanPham+"Đơn Giá: "+donGia+"Giảm Giá: "+giamGia+"Thuế Nhập Khẩu: "+thueNhapKhau);
    }
}


