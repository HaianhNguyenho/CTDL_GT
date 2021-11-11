package vn.edu.giadinh.suabaikiemtragiuaky;

public class AppleLinkList {
    Node head = null;
    Node tail = null;
    public AppleLinkList(){

    }
    //them dau
    /**
     * true: empty
     * false: not empty
     **/
    boolean isEmpty(){
        boolean empty = true;
        if(head == null){
            empty = true;
        }else{
            empty = false;
        }
        return empty;
    }

    public void addFirst(Apple apple){
        Node newNode = new Node(apple);
        //kiểm tra danh sách có rỗng ko?
        if(isEmpty()){//Thêm đầu
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    //them cuoi
    public void addLast(Apple apple){

        Node newNode = new Node(apple);

        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    Node binarySearch(int id){
        Node node = null;

        //bản chất
        //giá trị các khóa được sắp xếp
        return null;
    }

    //tim kiem theo ma
    public Node findAppleById(int id){
        Node node = null;

        if(isEmpty()){
            System.out.println("List is empty");
        }else{
            Node current;
            current = head;
            while(current != null){
                if(current.data.id ==id){
                    node = current;
                }
                current = current.next;
            }
        }
        
        return node;
    }
    public void addPreNode(int id,Apple apple){
        Node Node = null;
        Node preNode;
        if(isEmpty()){
            System.out.println("List is empty!");
        }else{
            Node current;
            current = head;
            if(head.data.id == id){
                addFirst(apple);
            }
            while(current.next != null){
                preNode = current;
                //đang tìm
                if(current.data.id == id){
                   // node = current;
                    Node newNode = new Node(apple);//nút node
                    preNode.next = newNode;
                    newNode.next= current;
                }
                current = current.next;
            }
        }
    
    }
    void deleteLast(){
        if(isEmpty()){

        }
        Node temp;
        temp = head;

        while(temp != null){
            if(temp.next == tail){
                tail = temp;
                tail.next = null;
            }
            temp = temp.next;
        }
    }

}

    //in danh sach
    //thêm trước
    //them vao truoc nut tim duoc
  

    // xoa cuoi

