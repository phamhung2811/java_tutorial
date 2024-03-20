package java_tutorial;

import java.util.Scanner;

public class SwithCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("nhập số nguyên từ 0 đến 8");
        a = sc.nextInt();
        switch (a) {
            case 2: {
                System.out.println("thứ 2");
                break;
            }
            case 3:{
                System.out.println("thứ 3");
                break;
            }
            case 4:{
                System.out.println("thứ 4");
                break;
            }
            case 5:{
                System.out.println("thứ 5");
                break;
            }
            case 6:{
                System.out.println("thứ 6");
                break;
            }
            case 7:{
                System.out.println("thứ 7");
                break;
            }
            default:
                System.out.println("nhập dữ liệu sai");
        }
    }
}