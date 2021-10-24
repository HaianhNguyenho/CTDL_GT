package com.anhnhh2008110020.tuan07;

public class MyLinkedList {
    public static void inDanhSach(Node head){
        if(head == null){
            System.out.println("Danh sách rỗng");   
        }
        else{
            Node temp = head;
            while(temp != null){
                System.out.print(temp.value);
                temp=temp.next;
                
            }
        }
    }
    public static Node themPTDau(Node headNode, int value){
        Node newNode = new Node(value);
        if(headNode != null){
            newNode.next = headNode;

        }
        
            return newNode;
        }
    public static Node themPTCuoi(Node headNode, int value){
        Node newNode =new Node(value);

        if(headNode == null){
            return newNode;
        }
        else{
            //B1.Xác định last Node
            Node lastNode = headNode;
            while(lastNode.next != null){
                lastNode = lastNode.next;
            }
            //B2.gan next cho lastNode
            lastNode.next = newNode;
        }
        return headNode;
    }


    public static void main(String[] args) {
        Node n2 = new Node(2);
        Node n3 =new Node(3);
        Node n4 = new Node(4);
        n2.next = n3;
        n3.next = n4;

        System.out.print("In Linked-List: ");
        inDanhSach(n2);
        inDanhSach(n3);
        inDanhSach(n4);
        System.out.println();


        System.out.print("Thêm phần tử vào đầu Linked-List: ");
        inDanhSach(n2);
        Node danhSachMoi = themPTDau(n2,1);
        inDanhSach(danhSachMoi);
        System.out.println();
       
        System.out.print("Thêm phần tử vào cuối Linked-List: ");
        inDanhSach(n2);
        n2 = themPTCuoi(n2,1);
        inDanhSach(n2);
     }
    
}


