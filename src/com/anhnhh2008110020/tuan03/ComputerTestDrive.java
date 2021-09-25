package com.anhnhh2008110020.tuan03;

public class ComputerTestDrive {
    public static void main(String[] args) {
        Computer computer;

        computer = new Computer("Lenovo", 2011, "Win 10", "8GB", "Intel 5", 200000000, 2012);

        System.out.print("Nhà sản xuất:"+computer.nhaSanXuat+",Năm Sản Xuất:"+computer.nhaSanXuat+",Hệ Điều Hành:"+computer.heDieuHanh+",Ram:"+computer.ram+",CPU:"+computer.cpu+",Giá tiền:"+computer.gia+",Năm Bảo Hành:"+computer.namBaoHanh);
    }

    
}
