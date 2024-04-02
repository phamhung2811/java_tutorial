package stack;

import java.util.Scanner;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<String> stackChuoi=new Stack<String >();
//        stackChuoi.push("hung");
//        stackChuoi.pop();
//        stackChuoi.peek();
//        stackChuoi.clear();
//        stackChuoi.contains("hung");
//        System.out.println(stackChuoi);
        System.out.println("nhap vao mot chuoi");
        String s=sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            stackChuoi.push(s.charAt(i)+"");
        }
        System.out.println("chuỗi đảo ngược");
        for (int i = 0; i < s.length(); i++) {
            System.out.println(stackChuoi.pop());
        }
        Stack<Integer> stackSoDu=new Stack<Integer>();
        System.out.println("nhập số nguyên từ bàn phím");
        int x=sc.nextInt();
        while (x>0){
            int soDu=x%2;
            stackSoDu.push(soDu);
            x=x/2;
        }
        int n=stackSoDu.size();
        for (int i = 0; i < n; i++) {
            System.out.print(stackSoDu.pop());
        }
    }
}
