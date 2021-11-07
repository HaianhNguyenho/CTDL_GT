package vn.edu.giadinh.tuan09;

public class PhienBanSapXepChen {
    public static void main(String[] args) {
        int[] a = {10,9,7,101,23,44,12,78,34,23};
        for(int k=1; k<10;k++){
            int temp = a[k];
            int j = k-1;
            while(j>=0 && temp <= a[j]){
                a[j+1] = a[j];
                j=j-1;
            }
            a[j+1] = temp;
        }
        System.out.println("printing so ted elements....");
        for(int i=0;i<10;i++){
            System.out.println(a[i]);
        }

    }
    
}
