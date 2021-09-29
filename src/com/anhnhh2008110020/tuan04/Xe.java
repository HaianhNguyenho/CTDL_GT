package com.anhnhh2008110020.tuan04;

public class Xe {
    String tenChuXe;
    String hangSanXuat;
    String dong;
    String giayPhep;
    int dungTichXang;

    Xe(){

    };
    Xe(String t,String ha,String g,String p,int du ){
        tenChuXe = t;
        hangSanXuat = ha;
        dong = g;
        giayPhep = p;
        dungTichXang = du;

    }
    void inThongTin(){
        System.out.println("Tên chủ xe"+tenChuXe+" Hàng sản xuất: "+hangSanXuat+" Dòng: "+dong+" Giấy phép: "+giayPhep+" Dung tích xăng: "+dungTichXang);
    }
    
}
