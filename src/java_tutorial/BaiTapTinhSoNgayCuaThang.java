package java_tutorial;

import java.util.Scanner;

public class BaiTapTinhSoNgayCuaThang {
    public static void main(String[] args) {
        int m,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào tháng");
        m = sc.nextInt();
        System.out.println("nhập vào năm");
        y = sc.nextInt();
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Có 31 ngày");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Có 30 ngày");
                break;
            case 2:
                if((y%4==0 && y%100 !=0)|| (y%400==0)){
                    System.out.println("có 29 ngày");
            }else {
                    System.out.println("có 28 ngày");
                }

                break;
            default:

                break;
        }
    }
}
