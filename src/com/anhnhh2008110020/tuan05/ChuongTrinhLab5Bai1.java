package com.anhnhh2008110020.tuan05;

import java.util.ArrayList;
import java.util.Scanner;

public class ChuongTrinhLab5Bai1 {
    public static void main(String[] args) {
        ArrayList<Double> arr = new ArrayList<Double>();//tạo đối tượng
        arr = nhap();
        xuat(arr);
    }
    public static ArrayList<Double> nhap(){
        ArrayList<Double> list =new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Nhập vào một con số: ");
            Double x = scanner.nextDouble();
            list.add(x);
            scanner.nextLine();
            
            System.out.print("Nhập thêm(Y/N)? ");
            if(scanner.nextLine().equals("N")){
                break;
            }

        }
        return list;
    }
        public static void xuat(ArrayList<Double> list2){
            double tong = 0;
            System.out.println("Các phần tử của list: ");
            for (Double double1 : list2) {
                System.out.println("Xuất phần tử trong list: "+double1);
                tong = tong + double1;
            }
            System.out.println("Tổng các phần tử của list: "+tong);

        }

    }

