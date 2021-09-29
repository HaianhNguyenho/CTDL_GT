package com.anhnhh2008110020.tuan04;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class WorkerTestDrive {
    public static void main(String[] args) {
        // tạo 1 danh sách nhân viên
        Worker [] workerList = new Worker[4];

        //nhập danh sách nhân viên từ bàn phím
        Scanner varInput = new Scanner(System.in);

        System.out.println("Nhập vào danh sách nhân viên");
        for(int h=0; h< workerList.length;h++){
            System.out.println("Nhập nhân viên thứ "+(h+1));
            System.out.print("Tên nhân viên: ");
            String tenNhanVien = varInput.nextLine();
            System.out.print("Lương: ");
            int luong = varInput.nextInt();
            System.out.print("Địa chỉ: ");
            String diaChi = varInput.nextLine();
            varInput.nextLine();
            System.out.print("Bộ phận làm việc: ");
            String boPhanLamViec = varInput.nextLine();
            System.out.print("Ngày sinh: ");
            int ngaySinh = varInput.nextInt();
            varInput.nextLine();
            workerList[h] = new Worker(tenNhanVien,luong,diaChi,boPhanLamViec,ngaySinh);
        }
        //in danh sách sinh viên
        System.out.println("==========in danh sách nhân viên==========");
        for (Worker worker : workerList) {
            worker.inThongTin();
        }
        List list = Arrays.asList(workerList);

        Comparator comparator = new Comparator<Worker>(){
            @Override
            public int compare(Worker o1, Worker o2){
                return Integer.compare(o1.luong,o2.luong);
            }

            
        };
        list.sort(comparator);

        //in danh sách nhân viêm
        System.out.println("==========In danh sách nhân viên sau khi so sánh==========");
        for (Worker worker : workerList) {
            worker.inThongTin();
            
        }
            
        
    }    
}
