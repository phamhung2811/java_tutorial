package java_tutorial;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {

//        double a,b;
//        Scanner sc= new Scanner(System.in);
//        System.out.print("nhập vào số a:");
//        a=sc.nextDouble();
//        System.out.print("nhập vào số b:");
//        b=sc.nextDouble();
//
//        System.out.println("|a|:"+Math.abs(a));
//
//        System.out.println("min "+ Math.min(a,b));
//        System.out.println("max "+ Math.max(a,b));
//        System.out.println("ceil(a):" + Math.ceil(a));
//        System.out.println("floor(a):" +Math.floor(a));
//        System.out.println("sqrt(a):" +Math.sqrt(a));
//        System.out.println("a^b:" +Math.pow(a,b));

        double r,dienTich,chuVi;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập bán kính:" );
        r=sc.nextDouble();

        //chu vi
        chuVi=2*r*Math.PI;
        System.out.println("chu vi :" +chuVi);

        //dientich
        dienTich=Math.PI * Math.pow(r,2);
        System.out.println("dien tich :" +dienTich);
    }
}
