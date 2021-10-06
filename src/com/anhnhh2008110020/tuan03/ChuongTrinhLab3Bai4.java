package com.anhnhh2008110020.tuan03;

import java.util.Scanner;

public class ChuongTrinhLab3Bai4 {
    public static void main(String[] args) {
        Scanner varInput;
        varInput = new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên: ");
        int soLuong = varInput.nextInt();

        String [] hoTen = new String[soLuong];
        double [] diem = new double[soLuong];
        for(int j=0;j<soLuong;j++){
            System.out.println("Nhập sinh viên thứ:"+(j+1));
            System.out.print("Họ tên: ");
            hoTen[j] = varInput.nextLine();
            varInput.nextLine();
            System.out.print("Điểm: ");
            diem[j] = varInput.nextDouble();
           
        }
    }
    
}
