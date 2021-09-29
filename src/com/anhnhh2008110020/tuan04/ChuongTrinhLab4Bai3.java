package com.anhnhh2008110020.tuan04;

import java.util.Arrays;
import java.util.Scanner;

public class ChuongTrinhLab4Bai3 {
    public static void main(String[] args) {
        //khởi tạo mảng gồm 10 phần tử
        //Sắp xếp và xuất mảng vừa nhập ra màn hình.

        int mang[] = new int[10];
        Scanner varInput;
        varInput = new Scanner(System.in);

        for(int x=0;x<mang .length;x++){
            System.out.print("Nhập phần tử thứ " +(x+1) );
            mang[x] = varInput.nextInt();
            
        }
        System.out.println("Những phần tử trong mảng : "+Arrays.toString(mang));

        Arrays.sort(mang);

        System.out.println("Những phần tử trong mảng sau khi sắp xếp: "+Arrays.toString(mang));
        //Xuất phần tử có giá trị nhỏ nhất ra màn hình
        int min = mang[0];
        for(int i=1; i<mang.length; i++){
            min = Math.min(min,mang[i]);
        }
        System.out.println("Số phần tử nhỏ nhất: "+min);
        //Tính và xuất ra màn hình trung bình cộng các phần tử chia hết cho 3
        int tong = 0, soDem=0;
        for(int i=0;i<mang.length;i++){
            if(mang[i]%3==0){
                tong = tong+mang[i];
                soDem=soDem+1;
            }
        }
        float trungBinhCong =(float) tong/soDem;
        System.out.println("Trung bình cộng các phần tử chia hết cho 3: "+trungBinhCong);

    }
}
