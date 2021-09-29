package com.anhnhh2008110020.tuan04;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ComputerTestDrive {
    public static void main(String[] args) {
        //tạo 1 danh sách máy tính

        Computer[] computerList = new Computer[2];
        //tạo danh sách máy tính
        Scanner varInput = new Scanner(System.in);

        System.out.println("Nhập danh sách máy tính");

        for(int c=0; c<computerList.length;c++){
            System.out.println("Nhập máy tính thứ "+(c+1));
            System.out.print("Nhà sản xuất: ");
            String nhaSanXuat = varInput.nextLine();
            System.out.print("Năm sản xuất: ");
            int namSanXuat = varInput.nextInt();
            System.out.print("Hệ điều hành: ");
            String heDieuHanh= varInput.nextLine();
            varInput.nextLine();
            System.out.print("Ram: ");
            String ram = varInput.nextLine();
            System.out.print("CPU: ");
            String cpu = varInput.nextLine();
            System.out.print("Giá: ");
            int gia = varInput.nextInt();
            System.out.println("Năm bảo hành: ");
            int namBaoHanh = varInput.nextInt();
            varInput.nextLine();

            computerList[c] = new Computer(nhaSanXuat, namSanXuat, heDieuHanh, ram, cpu, gia, namBaoHanh);

        }
        //in danh sách máy tính
        System.out.println("==========In danh sách máy tính sau khi nhập==========");
        for (Computer computer : computerList) {
            computer.inThongTin();
        }       
        List list = Arrays.asList(computerList);      
        //Bộ so sánh
        Comparator comparator = new Comparator<Computer>(){

            @Override
            public int compare(Computer o1,Computer o2){

                return Integer.compare(o1.gia,o2.gia);

            }
        };  
        list.sort(comparator);
        //In danh sách máy tính
        System.out.println("==========In danh sách máy tính sau khi so sánh ==========");
        for (Computer computer : computerList) {
            computer.inThongTin();
        }
    }
    
}
