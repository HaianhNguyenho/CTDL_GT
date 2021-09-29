package com.anhnhh2008110020.tuan04;

public class ChuongTrinhLab4Bai2 {
    public static void main(String[] args) {
        System.out.println("==========Bảng-Nhân==========");
        int x =8;
        for(int i =1;i<=10;i++){
            System.out.printf("%d*%d=%d",x,i,x*i);
            System.out.println();
        }
    
        System.out.println("==========Bảng Củu Chương==========");
        for(int j=1;j<=9;j++){
            for(int k=1; k<=10;k++){
                System.out.printf("%d*%d=%d",j,k,j*k);
                System.out.println();
            }

        }
    }

    
}
