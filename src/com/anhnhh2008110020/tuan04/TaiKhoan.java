package com.anhnhh2008110020.tuan04;

public class TaiKhoan {
    String tenTaiKhoan;
    int soTaiKhoan;
    int soDuTaiKhoan;
    
    TaiKhoan(){

    };
    TaiKhoan(String ten,int so, int du){
        tenTaiKhoan = ten;
        soTaiKhoan = so;
        soDuTaiKhoan = du;
    }
    void inThongTin(){
        System.out.println("Tên tài khoản: "+tenTaiKhoan+" Số tài khoản: "+soTaiKhoan+" Số dư tài khoản: "+soDuTaiKhoan);
    }

    
}
