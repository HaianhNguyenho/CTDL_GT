package com.anhnhh2008110020.tuan06;

import java.util.Scanner;

public class MangSanPhamTestDrive {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        
        while(true){
            System.out.println("================MENU================");
            System.out.println("1. Nhập danh sách sản phẩm");
            System.out.println("2. Xuất danh sách sản phẩm");
            System.out.println("3. Sắp xếp giảm dần theo giá");
            System.out.println("4. Tìm sản phẩm");
            System.out.println("5. Xóa sản phẩm");
            System.out.println("6. Xuất giá trung bình của sản phẩm");
            System.out.println("7. Thoát");

            System.out.print("Chọn chức năng: ");
            switch(scanner.nextInt()){
                case 1:
                
                nhap();
                
                break;
                case 2:
                System.out.println("Xuất sản phẩm");
                
                break;
                case 3:
                System.out.println("Sắp xếp sản phẩm");
                
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
    static public void nhap(){
        Scanner varInput = new Scanner(System.in);
        System.out.print("Số lượng sản phẩm: ");
        int a = varInput.nextInt();
        MangSanPham[] mangSanPham = new MangSanPham[a];

        Scanner b = new Scanner(System.in);
        System.out.println("==========Nhập danh sách sản phẩm===========");
        for(int i=0; i<mangSanPham.length;i++){
            System.out.println("Nhập sản phẩm thứ: "+(i+1));
            System.out.print("Tên sản phẩm: ");
            String tenSanPham = b.nextLine();
            b.nextLine();
            System.out.print("Đơn giá sản phẩm: ");
            Double donGia =  b.nextDouble();
            System.out.print("Giảm giá sản phẩm: ");
            Double giamGia = b.nextDouble();
            System.out.print("Thuế nhập khẩu sản phẩm: ");
            Double thueNhapKhau = b.nextDouble();
            b.nextLine();

            mangSanPham[i] = new MangSanPham(tenSanPham, donGia, giamGia,thueNhapKhau);


        }

        
    }
  
}
