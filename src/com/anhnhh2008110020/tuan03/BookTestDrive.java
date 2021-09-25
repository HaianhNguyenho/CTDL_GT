package com.anhnhh2008110020.tuan03;

public class BookTestDrive {
    public static void main(String[] args) {
        Book book;
        //book = new Book();
    
        book = new Book(15000,"Kim Đồng",2002 , 1, "Thiếu Nhi");//Hàm tạo 5 tham số

        System.out.printf("Giá Bán:"+book.giaBan+",Nhà xuất bản:"+book.nhaXuatBan+",Năm xuất bản:"+book.namXuatBan+",Số lượng:"+book.soLuong+",Loại sách:"+book.loai);

    }
    
}
