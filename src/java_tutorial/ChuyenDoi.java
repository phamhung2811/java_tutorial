package java_tutorial;

import java.util.Scanner;

public class ChuyenDoi {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n;
//        System.out.println("nhập vào số nguyên n>0:");
//        n= sc.nextInt();
//        String nhiPhan="";
//        while (n>0){
//            nhiPhan=(n%2)+nhiPhan;
//            n=n/2;
//        }
//        System.out.println("hệ nhỉ phân là :" +nhiPhan);
        int out, in = 0, b = 0;
        dio:
        for (out = 0; out < 10; out++) {
            for (b = 0; b < 15; b++) {
                for (in = 0; in < 20; in++) {
                    if (in > 10)
                        break dio;
                }
            }
            System.out.println("benh trong vong lap out:" + out + "in:" + in);
        }
        System.out.println("so cua b:" + b);
        System.out.println("ben ngoai vong lap out:" + out + "in:" + in);
    }
}

