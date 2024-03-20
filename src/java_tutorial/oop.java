package java_tutorial;

import javax.crypto.spec.PSource;

public class oop {

    public static void main(String[] args) {
        myDate md1= new myDate(2,3,2024);
        myDate md2= new myDate(2,3,2024);
        myDate md3= new myDate(3,3,2024);
        System.out.println(md1.toString());
        System.out.println(md2.toString());
        coffe cf=new coffe("hungbrew",430000.0, 1.5);
        System.out.println("giá của cà phê: "+cf.sumPrice());
        System.out.println("Kiểm tra khối lượng: "+cf.checkWeight(1));
        System.out.println("kiểm tra tổng tiền >500k: " +cf.checkSum());
        System.out.println("số tiền giảm giá: "+cf.discount(15));
        System.out.println("số tiền sau khi giảm giá: "+cf.bill(15));
        System.out.println(md1.equals(md3));
        System.out.println(md2.hashCode());
    }
}
