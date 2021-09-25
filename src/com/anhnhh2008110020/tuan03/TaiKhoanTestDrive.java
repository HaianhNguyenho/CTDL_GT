package com.anhnhh2008110020.tuan03;

public class TaiKhoanTestDrive {
    public static void main(String[] args) {
        TaiKhoan taiKhoan;

        taiKhoan = new TaiKhoan("Haianh", 12345, 50000);

        System.out.println("Tên tài khoản:"+taiKhoan.tenTaiKhoan+",Số tài khoản: "+taiKhoan.soTaiKhoan+",Số dư tài khoản:"+taiKhoan.soDuTaiKhoan);

    }
    
}
