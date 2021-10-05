package vn.edu.giadinh.tuan05;

import java.util.ArrayList;

public class CTMinhHoaArrayList {
    public static void main(String[] args) {

        ArrayList a = new ArrayList();
        
        a.add("HaiAnh");
        a.add(true);
        a.add(1);
        a.add(2.5);
        
        Integer x = (Integer)a.get(2);
        for (Object object : a) {
            System.out.println(a);
        }
        
    }
    
}
