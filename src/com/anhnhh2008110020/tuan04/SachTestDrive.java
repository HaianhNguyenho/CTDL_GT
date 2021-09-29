package com.anhnhh2008110020.tuan04;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SachTestDrive {
    public static void main(String[] args) {
        // tạo 1 ds sản xuất sách
        Sach [] sachList = new Sach[4];

        // tạo danh sách sản xuất sách 
        Scanner varInput = new Scanner(System.in);

        System.out.println("Nhập vào danh sách sản xuất sách");

        for(int i=0; i<sachList.length;i++){
            System.out.println("Nhập sách thứ "+(i+1));
            System.out.print("Giá bán sách: ");
            int giaBan =varInput.nextInt();
            System.out.print("Nhà xuất bản: ");
            String nhaXuatBan = varInput.nextLine();
            varInput.nextLine();
            System.out.print("Năm xuất bản: ");
            int namXuatBan = varInput.nextInt();
            System.out.print("Số lượng: ");
            int soLuong = varInput.nextInt();
            System.out.print("Loại: ");
            String loai = varInput.nextLine();
            varInput.nextLine();
            sachList[i] = new Sach(giaBan,nhaXuatBan,namXuatBan,soLuong,loai);

            }
            //in danh sách sản xuất sách
            System.out.println("==========In danh sách sản xuất sách sau khi nhập==========");
            for (Sach sach : sachList) {
                sach.inThongTin();
            }
            List list = Arrays.asList(sachList);

            //Bộ so sánh
            Comparator comparator = new Comparator<Sach>(){

                @Override
                public int compare(Sach o1, Sach o2){
   
                   return Integer.compare(o1.soLuong,o2.soLuong);
                }
            };
            list.sort(comparator);
            //In danh sách sản xuất sách
            System.out.println("==========In danh sách sản xuất sách sau khi so sánh=========");
            for ( Sach sach : sachList) {
                sach.inThongTin();
                
            }


    }
    
}
