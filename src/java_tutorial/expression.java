package java_tutorial;

import java.util.Scanner;

public class expression {
    public static void main(String[] args) {
//        int n;

        Scanner sc=new Scanner(System.in);
//        System.out.println("nhập số nguyeen: " );
//        n=sc.nextInt();
//        if(n%2==0){
//            System.out.println(n+"là số chãn");
//        }else{
//            System.out.println(n+"là số lẻ");
//        }
        double a,b,x1,x2,c,delta;
        System.out.println("nhập a:");
        a=sc.nextDouble();
        System.out.println("nhập b:");
        b=sc.nextDouble();
        System.out.println("nhập c:");
        c=sc.nextDouble();
//        if(a==0){
//            System.out.println("phương trình vo nghiệm");
//        }else if(a==0 && b!=0) {
//            System.out.println("phương trình vo nghiệm");
//        }else if(b==0){
//            System.out.println("x có nghiệm bằng 0 ");
//        } else {
//            x=-b/a;
//            System.out.println("x có nghiệm bằng :" +x);
//        }
        delta=Math.pow(b,2) -4*a*c;
        if(delta<0){
            System.out.println("phương trình vô nghiệm");
        } else if (delta==0) {
            x1=(-b)/(2*a);
            x2=x1;
            System.out.println("phương trình có nghiệm kép : " +x1);
        }else{
            x1=(-b-Math.sqrt(delta))/(2*a);
            x2=(-b+Math.sqrt(delta))/(2*a);
            System.out.println("phương trình có nghiệm x1 : " +x1 );
            System.out.println("phương trình có nghiệm x2 : " +x2 );
        }
    }
}
