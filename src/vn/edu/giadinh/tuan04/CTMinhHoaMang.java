package vn.edu.giadinh.tuan04;

import java.util.Arrays;
public class CTMinhHoaMang {
    public static void main(String[] args) {
        //cú pháp khai báo mảng
        int[] mangSoNguyen;//chưa chỉ định số phần tử

        mangSoNguyen = new int [5];

        double mangSoThuc[] = new  double[10];// toán tử new dùng để tạo đối tượng mới trong vùng nhơ nhớ Heap
        //=> mảng trong java là 1 kiểu tham chiếu

        // trước khi dùng thì phải xác định số phần tử của mảng
        mangSoNguyen [0] = 2;

        //Khai báo có khởi tạo giá trị cho mảng
        double diemMonHoc [] = new double[]{10.5,5.5,3.0,4.5};
        diemMonHoc [0] = diemMonHoc[1];
        //5.5,5.5,4.5
        System.out.println("Mảng điểm môn học: "+Arrays.toString(diemMonHoc));
        System.out.println("Số phần tử của mảng điểm môn học: "+diemMonHoc.length);
        //System.out.println("Mảng diểm môn hoc: "+diemMonHoc.toString());

        //cách 2
        String dsTenSinhVien[] = {"Tèo","Tý","Tùng"};

        //dùng vòng lặp đẻ duyệt mảng
        System.out.println("==========DUYỆT MẢNG ==========");
        
        for(int i = 0; i<diemMonHoc.length; i++){
            System.out.println(diemMonHoc[i]);
        }
        System.out.println("==========For-each==========");
        //FOR - EACH
        for(double diem : diemMonHoc){
            System.out.println(diem);


        }
        //Mảng có kiểu dữ liệu tham chiếu đối tượng
        
    }
    
}
