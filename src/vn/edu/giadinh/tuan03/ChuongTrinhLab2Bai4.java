package vn.edu.giadinh.tuan03;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class ChuongTrinhLab2Bai4 {
    public static void main(String[] args) {
        System.out.println("==========Menu==========");
        System.out.println(">>1. Giải phương trình bậc I");
        System.out.println(">>2. Giải phương trình bậc II");
        System.out.println(">>3. Tính tiền điện");
        System.out.println("==========Menu==========");
        int suLuaChon;
        System.out.print("Lựa chọn chức năng:");
        Scanner bienNhap;
        bienNhap = new Scanner(System.in);
        suLuaChon = bienNhap.nextInt();

        switch(suLuaChon){
            case 1: giaiPTBacI(); break;
            case 2: giaiPTbacII(); break;
            case 3: tinhTienDien(); break;
            default: System.out.println("Chọn chức năng khác");

        }
    }
    static void giaiPTBacI(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập hệ số b: ");
        int b = scanner.nextInt();
        if(a == 0){
            if(b==0){
                System.out.println("Phương trình có vô số nghiệm");
            }
            else{
                System.out.println("Phương trình vô nghiệm");

            }
        }
        else{
            double nghiem = (double) -b/a;
            System.out.println("Phương trình có nghiệm x= "+nghiem);
            }

        }
    static void giaiPTbacII(){
        float x1,x2;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Nhập hệ số a: ");
    int a = scanner.nextInt();
    System.out.print("Nhập hệ số b: ");
    int b = scanner.nextInt();
    System.out.print("Nhập hệ số c: ");
    int c = scanner.nextInt();


    double delta = Math.pow(b,2)-4*a*c;
    if(delta<0){
        System.out.println("Phương trình vô nghiệm");
    }
    else if(delta == 0){
         x1 = x2 = (-b/(2*a));
        System.out.print("Phương trình có nghiệm kép x1=x2 "+x1);
    }
    else{
        x1=(float) ((-b+sqrt(delta))/(2*a));
        x2=(float) ((-b-sqrt(delta))/(2*a));
        System.out.println("Phương trình có 2 nghiệm: x1=" +x1 + ",x2=" + x2);
        }
    
    }
    static void tinhTienDien(){
        Scanner scanner =new Scanner (System.in);
        System.out.print("Số tiền điện của tháng là: ");
        double soDien =scanner.nextDouble();
        if(soDien>=50){
            System.out.println("Số tiền điện trong tháng là: "+(soDien*1000));
        }
        else{
            System.out.println("Số tiền điện trong tháng là:"+(50*1000+(soDien-50)*1200));

        }
    }
}
