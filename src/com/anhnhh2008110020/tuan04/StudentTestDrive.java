package com.anhnhh2008110020.tuan04;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentTestDrive {
    public static void main(String[] args) {
        // tạo 1 ds sinh vien
        Student[] studentList = new Student[2];
        
        //nhập danh sách sinh viên từ bàn phím
        Scanner varInput = new Scanner(System.in);
        
        System.out.println("Nhập vào danh sách sinh viên");

        for(int i =0; i<studentList.length; i++){//vòng lặp 0.1
            System.out.println("Nhập sinh viên thứ "+(i+1));
            System.out.print("Mã số sinh viên: ");
            String code= varInput.nextLine();
            System.out.print("Tên sinh viên: ");
            String name = varInput.nextLine();
            System.out.print("Tuổi: ");
            int age = varInput.nextInt();
            System.out.print("Quê quán: ");
            String homeTown = varInput.nextLine();
            varInput.nextLine();//nhận vào phím Enter

            studentList[i] = new Student(code,name,age,homeTown);
        }
        //in danh sách sinh viên
        System.out.println("==========In danh sách sinh viên sau khi nhập ==========");
        for(Student student : studentList){
                student.inThongTin();
        }
        List list = Arrays.asList(studentList);

        //BỘ SO SÁNH
         Comparator comparator = new Comparator<Student>(){

             @Override
             public int compare(Student o1, Student o2){

                return Integer.compare(o1.age,o2.age);
             }
         };


        //Truyền vào đây đối số cần thiết để so sánh
        

        //IN danh sach sinh vien
        System.out.println("==========In danh sách sinh viên sau khi so sánh ==========");
        
        for (Student student : studentList) {

            student.inThongTin();
        }     
     
        
    }
    
}
