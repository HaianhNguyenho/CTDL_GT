package vn.edu.giadinh.tuan10;

import java.util.Arrays;
import java.util.List;

public class DemoDebugProgram {
    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("Ty","Teo","Tung");

        int count =0;

        for (String string : list) {
            System.out.println(string);

            count++;
        }

    }
    
}
