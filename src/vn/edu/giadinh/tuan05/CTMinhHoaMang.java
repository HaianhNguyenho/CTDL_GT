package vn.edu.giadinh.tuan05;

public class CTMinhHoaMang {
    public static void main(String[] args) {
        int [] arr={3,5,7,9}; //n=4
        int newElement =8;//Phần tử cần thêm vào
        //Chiều dài của mảng cũ
        int n = arr.length;
        //Tạo mảng mới
        int [] newArr = new int[n+1];
        //Đổi dữ liệu của mảng cũ sang mảng mới
        for(int i = 0; i<n; i++){
            newArr[i] = arr[i];
        }
        System.out.println("In mảng cũ");
        for (int x : newArr) {
            System.out.println(x);
        }
        //Thêm phần tử mới vào mảng mới
        newArr[n] = newElement;
        System.out.println("In mảng mới");
        for (int x : newArr) {
            System.out.println(x);
        }


    }
    
}
