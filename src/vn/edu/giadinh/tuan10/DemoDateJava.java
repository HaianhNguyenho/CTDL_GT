package vn.edu.giadinh.tuan10;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DemoDateJava {
    public static void main(String[] args) throws ParseException {
        //Khai bao bien kieu ngay
        Date ngaySinh;
        String strNgaySinh = "20/12/2021";

        ngaySinh = chuyenChuoiSangNgay(strNgaySinh);
        System.out.println(ngaySinh);

        String str = chuyenNgaySangChuoi(ngaySinh);
        System.out.println(str);
    }
    /** đổi chuỗi (theo chuẩn ngày Việt Nam) sang ngày java*/
    public static Date chuyenChuoiSangNgay(String chuoiNgay) throws ParseException{
        //ngày việt nam
        Date date;
        /**
         * dd: ngày
         * mm: tháng
         * yyyy: năm
         */
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/mm/yyyy");
        date = simpleDateFormat.parse(chuoiNgay);
        return date;
    }
    //Đổi ngày java sang kiểu ngày việt dd/mm/yyyy
    public static String chuyenNgaySangChuoi(Date date){
        String chuoiNgayViet = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        chuoiNgayViet = simpleDateFormat.format(date);
        return chuoiNgayViet;
    }
    
}
