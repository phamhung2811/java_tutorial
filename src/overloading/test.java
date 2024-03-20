package overloading;

public class test {
    public static void main(String[] args) {
        myMath mm= new myMath();
        System.out.println(mm.timMin(1,3));
        System.out.println(mm.timMin(1.2,2.1));
        double arr[]=new double[] {1,23,4,5};
        System.out.println(mm.tinhTong(arr));
        System.out.println(mm.tinhTong(1,2));
    }
}
