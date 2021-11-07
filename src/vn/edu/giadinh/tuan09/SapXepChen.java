package vn.edu.giadinh.tuan09;

public class SapXepChen {
    public static void main(String[] args) {
        int [] a = {5,1,12,3,16,2,12,14};
        sort (a);
        }
   public static void sort(int a[]){
         int n= a.length;
         for(int i = 1; i<n; i++){
             int key = a[i];
             int j = i -1;
             while (j>=0&&a[j]>key){
                 a[j + 1] =a[j];
                 j = j-1;
             } 
             a[j+1] = key;
         }
         System.out.println("Phần tử chèn: ");
         for(int i =0; i<8; i++){
            System.out.println(a[i]);
        }
     }   
    

}
