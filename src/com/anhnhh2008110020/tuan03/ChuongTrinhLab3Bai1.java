package com.anhnhh2008110020.tuan03;

import java.util.Scanner;

public class ChuongTrinhLab3Bai1 {
    public static void main(String[] args) {
         //Số nguyên tố
         Scanner bienNhap;
         bienNhap = new Scanner(System.in);
         System.out.println("Nhập vào 1 số bất kỳ: ");
         int n = bienNhap.nextInt();
 
         ChuongTrinhLab3Bai1 soNguyenTo = new ChuongTrinhLab3Bai1();
 
         if(soNguyenTo.SNT(n) == true){
             System.out.println("n là số nguyên tố ");
 
         }
         else{
             System.out.println("n không phải là số nguyên tố ");
         }
     }
     // hàm bool trả về true/false
     public boolean SNT(int N){
         if(N <=1){
             return false;
 
         }
         else{
             for (int i=2;i<N-1;i++){
                 if(N%i ==0){
                     return false;
                 }
             }
         }
         return true;
    }
    
}
