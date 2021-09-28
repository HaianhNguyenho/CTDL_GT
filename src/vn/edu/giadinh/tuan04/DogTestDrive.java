package vn.edu.giadinh.tuan04;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog[] danhSachDog = new Dog[7];
        Dog dog0 = new Dog(10,"Đen ","Fido");
        Dog dog1 = new Dog(7,"Vàng ","La La");
        Dog dog2 = new Dog(25,"Đen trắng ","Lulu");
        Dog dog3 = new Dog(11,"Nâu ","Kiki");
        Dog dog4 = new Dog(20,"Nâu đen ","Hoho");
        Dog dog5 = new Dog(19,"Đốm ","Haha");
        Dog dog6 = new Dog(4, "Đen thui ","Hihi");

        danhSachDog[0] = dog0;
        danhSachDog[1] = dog1;
        danhSachDog[2] = dog2;
        danhSachDog[3] = dog3;
        danhSachDog[4] = dog4;
        danhSachDog[5] = dog5;
        danhSachDog[6] = dog6;

        for(int i= 0; i<danhSachDog.length; i++ ){
            danhSachDog[i].inThongTin();
        }
    }
    
}
