package vn.edu.giadinh.tuan08;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemoProgram {
    public static void main(String[] args) {
        Queue<Integer> queue;

        queue = new LinkedList<>();

        queue.add(8);
        queue.add(19);
        queue.add(9);

        //lấy ra 1 phần tử - trong queue - lấy đầu
        System.out.println(queue);

        int phanTuDuocLayRa = queue.remove();

        System.out.println("Phần tử đươc lấy ra từ Queue "+phanTuDuocLayRa);

        System.out.println("Phần tử còn lại trong Queue"+queue);

        System.out.println(queue);

        //Thăm 1 phần tử của Queue - không loại khỏi Queue
        int phanDuocTham = queue.peek();

        System.out.println("Phần tử vừa được thăm "+phanDuocTham);

        System.out.println("Phần tử còn lại trong queue sau thăm"+queue);

        System.out.println(queue);


        //Cài đặt Linked List
            //Thêm 1 phần tử vào cuối
          //Lấy 1 phần tử ở đầu
          //xóa 1 phần tử ở đầu

        //Dùng Linked List để cài đặt cấu trúc Stack
        //Cài đặt Linked List
        //Thêm 1 phần từ vào cuối
        //Lấy 1 phần từ cuối
        //xoáy 1 phần tử ở cuối

    }
    
}
