/*
*   created date: Sep 20,2021
*    author: HaiAnh
*
*/
package vn.edu.giadinh.tuan03;

public class Cow {
    double weight;
    String breed;
    String color;
    
    //HÀM TẠO
    //developers tạo ra không để java compiler tạo ra
    Cow(){//HÀM TẠO MẶC ĐỊNH DO developer tạo ra

    }
    Cow(double w){
       weight=w;
    }
    Cow(double w, String br, String cl){
        weight = w;
        breed = br;
        color = cl;


    }
    
}
