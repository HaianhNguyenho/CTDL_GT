package com.anhnhh2008110020.tuan04;

public class Sach {
    int giaBan;
    String nhaXuatBan;
    int namXuatBan;
    int soLuong;
    String loai;
    
    //HÀM TẠO
    Sach(){//Hàm tạo mặc định

    }
    Sach(int gia,String xuat,int nam,int luong,String l){

        giaBan = gia;
        nhaXuatBan = xuat;
        namXuatBan = nam;
        soLuong = luong;
        loai = l;
    }
    void inThongTin(){
        System.out.println("Giá bàn: "+giaBan+" Nhà Xuất Bản: "+nhaXuatBan+" Năm Sản Xuất: "+namXuatBan+" Số lượng: "+soLuong+" Loại: "+loai);
        
    }

    
}
