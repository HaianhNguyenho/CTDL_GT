package com.anhnhh2008110020.kiemtragiuaky;

import java.util.ArrayList;

import java.util.Scanner;

public class AppleTestDrive {
 static ArrayList<Apple> list = new ArrayList<Apple>();

    public static void main(String[] args) {

        Scanner varInput = new Scanner(System.in);
        while(true){
            System.out.println("==========MENU==========");
            System.out.println("1. Nhập danh sách táo");
            System.out.println("2. In danh sách táo");
            System.out.println("3.Tìm táo theo màu");
            System.out.println("4.Thêm táo vào kho");
            System.out.println("5.Thoát");
            
            System.out.print("Chọn chức năng: ");
            switch(varInput.nextInt()){
                case 1:
                System.out.println("Nhập danh sách táo ");
                nhap();
                break;
                case 2:
                System.out.println("In danh sách táo ");
                xuat();
                break;
                case 3:
                System.out.println("Tìm táo theo màu ");
                break;
                case 4:
                System.out.println("Tìm táo theo màu");
                break;
                case 5:
                System.exit(0);
                break;
                default:
                System.out.println("Bạn chọn sai rồi.Vui lòng chọn lại chức năng");
            }


        }
        
    }
    public static void nhap(){
        while(true){
            Scanner scanner = new Scanner(System.in);
            Apple apple = new Apple();
            System.out.println("Mã táo: ");
            apple.id = scanner.nextInt();
            System.out.println("Khối lượng táo: ");
            apple.weight = scanner.nextDouble();
            System.out.println("Màu sắc táo: ");
            apple.color = scanner.nextLine();
            list.add(apple);
            scanner.nextLine();
            System.out.print("Nhập thêm(Y/N)? ");
            if(scanner.nextLine().equalsIgnoreCase("N")){
                break;
            }

        }
    }
    public static void xuat(){
        Apple tao = new Apple();
        System.out.println("Danh sách táo: ");
        for (Apple apple : list) {
            System.out.println("Id táo: "+tao.id);
            System.out.println("Khối lượng táo "+tao.weight);
            System.out.println("Màu sắc: "+tao.color);
        }
       
    }
        static Apple timSanPhamTheoTen(String color,ArrayList<Apple> list){
            Apple result = null;
            for (Apple apple : list) {
                if(apple.color.equals())
            }
        }

}
