package com.anhnhh2008110020.tuan04;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TaiKhoanTestDrive {
    public static void main(String[] args) {
        // tạo 1 danh sách tài khoản
        TaiKhoan[] taiKhoanList = new TaiKhoan[2];

        // nhập danh sách tài khoản từ bàn phím
        Scanner varInput = new Scanner(System.in);
        
        System.out.println("Nhập vào danh sách tài khoản");

        for(int i= 0;i<taiKhoanList.length;i++){
            System.out.println("Nhập tài khoản thứ "+(i+1));
            System.out.print("Tên chủ tài khoản: ");
            String tenTaiKhoan = varInput.nextLine();
            System.out.print("Số tài khoản: ");
            int soTaiKhoan = varInput.nextInt();
            System.out.print("Số dư tài khoản: ");
            int soDuTaiKhoan =varInput.nextInt();
            varInput.nextLine();

            taiKhoanList[i] = new TaiKhoan(tenTaiKhoan, soTaiKhoan, soDuTaiKhoan);

        }
        //in danh sách tài khoản
        System.out.println("==========In danh sách tài khoản sau khi nhập ==========");
        for (TaiKhoan taiKhoan : taiKhoanList) {

            taiKhoan.inThongTin();

        }
        List list = Arrays.asList(taiKhoanList);

        //Bộ so sánh
        Comparator comparator = new Comparator<TaiKhoan>(){
            @Override
            public int compare(TaiKhoan o1, TaiKhoan o2){
                return Integer.compare(o1.soDuTaiKhoan,o2.soDuTaiKhoan);
            }
            
        };  
        list.sort(comparator);

        //In danh sach tai khoan
        System.out.println("==========In danh sách tài khoản sau khi so sánh==========");
        for (TaiKhoan taiKhoan : taiKhoanList){
            taiKhoan.inThongTin();
        }

        }
    }
    

