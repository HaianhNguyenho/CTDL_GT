package vn.edu.giadinh.tuan09;

public class SapXepNoiBot {
    public static void main(String[] args) {
       int [] arr = {5,1,12,3,16,2,12,14};
       bubbleSort(arr);
    }
    static void bubbleSort(int[] arr){
        int n = arr.length;
        int temp = 0;
        for(int i =0; i<n;i++){
            for(int j =1; j< (n-i);j++){
                if(arr[j-1]>arr[i]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
            
                }
            }
        }
        System.out.println("Sắp xếp");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
   
    
}
