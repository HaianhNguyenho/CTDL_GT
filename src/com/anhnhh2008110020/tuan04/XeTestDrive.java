package com.anhnhh2008110020.tuan04;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class XeTestDrive {
    public static void main(String[] args) {
        //tạo 1 ds xe

        Xe[] xeList =new Xe[3];

        //tạo danh sách xe
        Scanner varInput = new Scanner (System.in);

        System.out.println("Nhập vào danh sách xe");
        
        for(int k=0; k<xeList.length;k++){
            System.out.println("Nhập xe thứ "+(k+1));
            System.out.print("Tên chủ xe: ");
            String tenChuXe = varInput.nextLine();
            System.out.print("Hãng sản xuất: ");
            String hangSanXuat = varInput.nextLine();
            System.out.print("Dòng xe: ");
            String dong = varInput.nextLine();
            System.out.print("Giấy phép: ");
            String giayPhep = varInput.nextLine();
            System.out.print("Dung tích xăng: ");
            int dungTichXang = varInput.nextInt();

            xeList[k] = new Xe(tenChuXe, hangSanXuat, dong, giayPhep,dungTichXang);
        
        }
        //in danh sách sản xuất xe
        System.out.println("==========In danh sách sản xuất xe sau khi nhập==========");
        for (Xe xe : xeList) {
            xe.inThongTin();           
        }
        List list = Arrays.asList(xeList);

        //Bộ so sánh
        Comparator comparator =new Comparator<Xe>(){

            @Override
            public int compare(Xe o1,Xe o2){

                return Integer.compare(o1.dungTichXang,o2.dungTichXang);
            }
            
        };
        list.sort(comparator);
        //In danh sách xe
        System.out.println("==========In danh sách sản xuất xe==========");
        for (Xe xe : xeList) {
            xe.inThongTin();
            
        }
               

    }
    
}
