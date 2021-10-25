package com.anhnhh2008110020.kiemtragiuaky;

public class Node {
    //Nội dung
   private Apple a;//Khai báo biến số nguyên

    //Liên kết đến nút tiếp theo

    //Tham chiếu
    Node next;//biến tham chiêú kiểu Node

    public Node(){}//Hàm tạo mặc định

    public Node(Apple a, Node next) {
        this.a = a;
        this.next = next;
    }

    

}
