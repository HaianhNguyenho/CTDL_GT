package vn.edu.giadinh.tuan07;

public class Node {

    //Nội dung
    int data;//Khai báo biến số nguyên

    //Liên kết đến nút tiếp theo

    //Tham chiếu
    Node next;//biến tham chiêú kiểu Node

    public Node(){}//Hàm tạo mặc định

    public Node(int d){
        data =d;
    }
    public Node(int d, Node n){
        data = d;
        next = n;
    }

    
}
