package vn.edu.giadinh.tuan07;



public class MyLinkedList {
    Node head = null;
    Node tail = null;

    public MyLinkedList(){}

    void add(int data){
        //Tạo 1 node mới
        Node newNode = new Node(data);
    if(head == null){
        head =newNode;
        tail = newNode;
    }else{
        tail.next = newNode;
        tail =newNode;
    }       

    }
    void remove(){

    }
    void print(){
        Node current =head;

        if(head==null){
            System.out.println("Danh sách rỗng!!");
            return;
        }
        System.out.println("Các nút trong danh sách:");
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }


    }
    
}
