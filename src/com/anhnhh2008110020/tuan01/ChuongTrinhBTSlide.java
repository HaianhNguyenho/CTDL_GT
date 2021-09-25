/*
*   created date: 9/6/2021
*   author:Haianh
*/
package com.anhnhh2008110020.tuan01;

public class ChuongTrinhBTSlide {
    public static void main(String[] args) {
         //VD1
         int a =1, b=9;
         int max = a>b?a:b;
         System.out.println("Số lớn nhất của 2 số a và b là: "+max);
         //VD2
         double diem_1 = 4;
         if(diem_1 >= 5){
             System.out.println("Đậu");
         }
         //VD3
         double diem=4;
         if(diem < 5){
             System.out.println("Rớt");
         }
         else{
             System.out.println("Đậu");
         }
         //VD4
         int x = 11%4;
         boolean t = 9 < 2 && true|| 4>3;
         System.out.println("Giá trị của biểu thức là "+x );
         //VD5
         double  j=1, k =-4, l=4;
         double delta = Math.pow(j,2)-4*k*l;
         if(delta < 0){
             System.out.println("Vô nghiệm");
         }
         else if(delta ==0){
             System.out.println("Nghiệm kép");
         }
         else{
             System.out.println("2 nghiệm");
         }
         //VD6
         int luong=16000000;
         int thue;
 
         if(luong<9000000 ){
             System.out.println("Khong dong thue");
         }
         if(15000000>=luong && luong>9000000){
             thue = luong*10/100;
             System.out.println("Thuế thu nhập là: "+thue);
         }
         if(30000000 >=luong && luong>15000000){
             thue = luong*15/100;
             System.out.println("Thuế thu nhập là: "+ thue);
         }
         if(luong > 30000000){
             thue = luong*20/100;
             System.out.println("Thuế thu nập là: "+ thue);
         }
         //VD7
         double z = 5, f = 7, s = -1;
         char op ='+';
         switch(op){
             case'+':
                 s = z+f;
                 break;
             case '-':
                 s = z-f;
                 break;
             case '*':
                 
             case '/':
                 System.out.println("Đang xây dựng");
                 break;
             default:
                 System.out.println("Vui lòng chọn +,-,* và /");
                 break;
         }
        
    }
    
}
