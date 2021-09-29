package com.anhnhh2008110020.tuan04;

public class Computer {
    String nhaSanXuat;
    int namSanXuat;
    String heDieuHanh;
    String ram;
    String cpu;
    int gia;
    int namBaoHanh;

    Computer(){

    }

    Computer(String xuat,int nam, String he,String r,String h,int g, int hanh){
        nhaSanXuat = xuat;
        namSanXuat = nam;
        heDieuHanh = he;
        ram = r;
        cpu = h;
        gia = g;
        namBaoHanh = hanh;
    }
    void inThongTin(){
        System.out.println("Nhà sản xuất: "+nhaSanXuat+"Năm sản xuất: "+namSanXuat+"Hệ điều hành"+heDieuHanh+"Ram: "+ram+"CPU: "+cpu+"Giá: "+gia+"Năm Bảo Hành: "+namBaoHanh);
        
    }
    
    
}
