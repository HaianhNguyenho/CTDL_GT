package com.anhnhh2008110020.tuan01;

import java.util.Scanner;

public class ChuongTrinhLab1Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hệ số a là: ");
        double a = scanner.nextDouble();
        System.out.print("Hệ số b là ");
        double b = scanner.nextDouble();
        System.out.print("Hệ số c là: ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b,2)-4*a*c;

        double can = Math.sqrt(delta);

        System.out.println("Delta của phương trình bậc 2 là: "+delta);
        System.out.println("Căn của delta là: "+can);
    }
    
}
