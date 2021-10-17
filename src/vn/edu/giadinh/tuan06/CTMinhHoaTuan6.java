package vn.edu.giadinh.tuan06;

public class CTMinhHoaTuan6 {

    public static void main(String[] args) {
       So so1, so2;
       
       so1 = new So(5);

       so2 = new So(10);
       System.out.println("Số 1: "+ so1.number);
       System.out.println("Số 2: "+so2.number);

       swap(so1, so2);

       System.out.println("Số 1: "+ so1.number);
       System.out.println("Số 2: "+so2.number);

    }

   static void swap(So a, So b){
        int temp;
        temp = a.number;
        a.number = b.number;

        b.number = temp;
        
    }
    
}
