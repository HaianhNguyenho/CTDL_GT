package vn.edu.giadinh.tuan08;

import java.util.Stack;

import com.anhnhh2008110020.tuan04.Student;

public class StackDemoProgram {
    public static void main(String[] args) {

        Stack<String> stack;

        //thêm phần tử vào stack
        stack = new Stack<>(); //khởi tạo đối tượng Stack trong vùng nhớ Heap
        stack.push("Hải");
        stack.push("Anh");
        stack.push("Nguyễn Hồ");

        System.out.println(stack);


        //Lấy ra 1 phần tử định stack(xóa phần tử khỏi stack()
       String poped = stack.pop();

       System.out.println("Đã lấy ra từ danh sách stack là: "+poped);

        System.out.println("Phần tử còn lại của stack:");
        System.out.println(stack);

        //thăm nút đỉnh // không loại khỏi danh sách
        String phanTuDuocThem = stack.peek();
        System.out.println("Thêm phần tử đỉnh: "+phanTuDuocThem);

        //Sau khi thêm
        System.out.println(stack);

        Stack<Student> stack2; 
    }
    
}
