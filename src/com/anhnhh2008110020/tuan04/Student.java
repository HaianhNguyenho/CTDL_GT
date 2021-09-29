package com.anhnhh2008110020.tuan04;

public class Student {
    String code;

    String name;

    int age;

    String homeTown;

    
    Student(){};//Hàm tạo mặc định

    Student(String c,String n, int a, String h){
        code = c;
        name =n;
        age = a;
        homeTown = h;
        
    }
    void inThongTin(){
        System.out.println("Code: "+code+" Name: "+name+" age: "+age+" HomeTown: "+homeTown);
    }


    
}
