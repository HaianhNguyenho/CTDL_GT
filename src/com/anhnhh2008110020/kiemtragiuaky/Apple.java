package com.anhnhh2008110020.kiemtragiuaky;

public class Apple {
    int id;
    Double weight;
    String color;

    Apple(){

    }
    
    public Apple(int id, Double weight, String color) {
        this.id = id;
        this.weight = weight;
        this.color = color;
    }

    void inThongTin(){
        System.out.println("Mã táo: "+id+"Khối lượng táo: "+weight+"Màu sắc táo: "+color);
    }

}



