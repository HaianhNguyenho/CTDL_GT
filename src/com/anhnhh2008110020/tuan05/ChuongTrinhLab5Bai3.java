package com.anhnhh2008110020.tuan05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ChuongTrinhLab5Bai3 {
    static ArrayList<SanPham>list = new ArrayList<SanPham>();
    public static void main(String[] args) {
        
        Scanner varInput = new Scanner(System.in);
        while(true){
            System.out.println("================MENU================");
            System.out.println("1. Nhập danh sách sản phẩm");
            System.out.println("2. Xuất danh sách sản phẩm");
            System.out.println("3. Sắp xếp giảm dần theo giá");
            System.out.println("4. Tìm sản phẩm");
            System.out.println("5. Xóa sản phẩm");
            System.out.println("6. Xuất giá trung bình của sản phẩm");
            System.out.println("7. Thoát");

            System.out.println("Chọn chức năng: ");
            switch(varInput.nextInt()){
                case 1:
                System.out.println("Nhập sản phẩm");
                nhap();
                break;
                case 2:
                System.out.println("Xuất sản phẩm");
                xuat();
                break;
                case 3:
                System.out.println("Sắp xếp sản phẩm");
                sapXep();
                break;
                case 4:
                System.out.println("Tìm sản phẩm");
                
                break;
                case 5:
                System.out.println("Xóa sản phẩm");
                break;
                case 6:
                System.out.println("Xuất giá trung bình sản phẩm");
                break;
                case 7:
                System.exit(0);
                break;
                default:
                System.out.println("Bạn chọn sai rồi.Vui lòng chọn lại chức năng");
        
            }

        }
        
    }
    public static void nhap(){
        while (true){
        Scanner scanner = new Scanner(System.in);
        SanPham sp = new SanPham();
        System.out.println("Tên sản phẩm:");
        sp.tenSanPham = scanner.nextLine();
       System.out.println("Giá sản phẩm:");
       sp.giaSanPham = scanner.nextDouble();
       list.add(sp);
       scanner.nextLine();
       System.out.print("Nhập thêm (Y/N)? ");
       if(scanner.nextLine().equalsIgnoreCase("N")){
           break;
            }
        }
    }
    public static void xuat(){
        SanPham sp = new SanPham();
        System.out.println("Danh sách sản phẩm: ");
        for (SanPham sanPham : list) {//duyệt từng phần tử
            System.out.println("Tên sản phẩm:  "+sp.tenSanPham);
            System.out.println("Giá sản phẩm: "+sp.giaSanPham);
        }
    }
    public static void sapXep(){
        Comparator<SanPham> comp = new Comparator<SanPham>() {//KDLtham chiếu đối tượng
            @Override
            public int compare(SanPham o1, SanPham o2) { 
                return Double.compare(o1.giaSanPham, o2.giaSanPham);
            }
        };
          Collections.sort(list,comp); 
    }
    public static void tim(String tenSanPham){
        
    }
}
