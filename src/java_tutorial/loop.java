package java_tutorial;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for (int i=2;i<=9;i++){
            for(int j=1;j<=10;j++){
                System.out.println(i+" x " +j +" = " +(j*i) );
            }
            System.out.println("-------------");
        }
        int x=1;
        while (x!=0){
            System.out.println("nhập x =0 dể thoát ; nhập ký tự khác để tiếp tục");
            x=sc.nextInt();
        }
    }
}
