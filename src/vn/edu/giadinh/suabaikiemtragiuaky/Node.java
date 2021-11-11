package vn.edu.giadinh.suabaikiemtragiuaky;

public class Node {

    // nội dung / dữ liệu
    Apple data;

    Node next;

    //Liên Kết
    public Node(){
        data = null;
        next = null;
    }
    public Node(Apple apple){
        data = apple;
        next = null;
    }

    public Node(Apple apple, Node node){
        data = apple;
        next = node;

    }
    
    
}
