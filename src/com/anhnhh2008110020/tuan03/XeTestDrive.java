package com.anhnhh2008110020.tuan03;

public class XeTestDrive {
    public static void main(String[] args) {
        Xe xe;
        xe = new Xe("HaiAnh", "Honda","Veision","A1","5.2 lít");
        System.out.println("Tên chủ xe:"+xe.tenChuXe+",Hãng sản Xuất:"+xe.hangSanXuat+",Dòng xe:"+xe.dong+",Dung Tích Xăng:"+xe.dungTichXang);
    }
    
}
