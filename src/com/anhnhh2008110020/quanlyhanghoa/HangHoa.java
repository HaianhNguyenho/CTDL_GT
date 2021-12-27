package com.anhnhh2008110020.quanlyhanghoa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangHoa {
    //Khai báo các thuộc tính cần thiết
    private int loai;
    private int ma;
    private String ten;
    private double giaNhap;
    private int soLuong;
    private LocalDate ngayNhap;

    //Hàm tạo mặc định

    public HangHoa(){

    } 

    //Hàm tạo chứa tham số

    public HangHoa(int loai, int ma, String ten, double giaNhap, int soLuong, LocalDate ngayNhap) {
        this.loai = loai;
        this.ma = ma;
        this.ten = ten;
        this.giaNhap = giaNhap;
        this.soLuong = soLuong;
        this.ngayNhap = ngayNhap;
    }
// ----------begin getter and setter----------
    public int getLoai(){
        return this.loai;
    }

    public int getMa(){
        return this.ma;
    }

    public String getTen(){
        return this.ten;
    }

    public double getGiaNhap(){
        return this.giaNhap;
    }

    public int getSoLuong(){
        return this.soLuong;
    }

    public LocalDate getNgayNhap(){
        return this.ngayNhap;
    }

    public String getLoaiHH(){
        if(this.loai == 0)
            return "Thực phẩm";
        if(this.loai == 1)
            return "Sành sứ";
        return "Điện Máy";
    }

    public double getTongGia(){
        return this.soLuong * this.giaNhap;
    }

    public String getNgayMua(){
        DateTimeFormatter dinhDangNgayGio = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        return this.ngayNhap.format(dinhDangNgayGio);
    }
    
    public void setLoai(int loai){
        this.loai = loai;
    }

    public void setTen(String ten){
        this.ten = ten;
    }

    public void setGiaNhap(double giaNhap){
        this.giaNhap = giaNhap;
    }

    public void setNgayNhap(LocalDate ngayNhap){
        this.ngayNhap = ngayNhap;
    }
//----------end getter and setter----------

// in thông tin hàng hóa
    void inThongTin(){
        System.out.println("=======================");
        System.out.print("Loại hàng hóa: "+loai);
        System.out.print("Mã hàng hóa: "+ma);
        System.out.print("Tên hàng hóa: "+ten);
        System.out.println("Giá nhập: "+giaNhap);
        System.out.print("Số lượng tồn kho: "+soLuong);
        System.out.println("Ngày nhập kho: "+ngayNhap);

    }

}
