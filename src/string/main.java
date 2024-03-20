package string;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
//        String s=new String();
//        Scanner sc=new Scanner(System.in);
//        System.out.println("nhập cào chuỗi:" );
//        s=sc.nextLine();
//        System.out.println(s);
//
//        // hàm length()
//        System.out.println(s.length());
//        //hàm charat()
//        for (int i = 0; i < s.length(); i++) {
//            System.out.println(s.charAt(i));
//        }
//        //hàm getChars()
//        char[] arr=new char[100];
//        s.getChars(0,2,arr,0);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        //getbyte()
//        byte[] arrGetByte=s.getBytes();
//        for (byte b: arrGetByte) {
//            System.out.println(b);
//        }


//        String s1="hungpham";
//        String s2="HUNGPHAM";
//        String s3="vanhung";
//        System.out.println(s1.equals(s3));
//        System.out.println(s1.equalsIgnoreCase(s2));
//        //hàm compareTo so sánh <>=
//        String sv1="nguyễn văn a";
//        String sv2="nguyễn văn b";
//        String sv3="nguyễn văn";
//        String sv4="nguyễn văn a";
//        System.out.println(sv1.compareTo(sv2));
//        System.out.println(sv1.compareTo(sv3));
//        System.out.println(sv1.compareTo(sv4));
//        // hàm compareToIgnoreCase
//        System.out.println(sv1.compareToIgnoreCase(sv2));
//        System.out.println(sv1.compareToIgnoreCase(sv3));
//        System.out.println(sv1.compareToIgnoreCase(sv4));
//        //hàm regionMatches
//        String r1="PHAMHUNG";
//        String r2="PHAM";
//        String r3="pham";
//        boolean check=r1.regionMatches(2,r2,2,2);
//        boolean check1=r1.regionMatches(true,2,r3,2,2);
//        System.out.println(check1);
//        //hàm startWith hàm kiểm tra chuỗi bắt đầu
//        String sdt="0373102559";
//        System.out.println(sdt.startsWith("037"));
//        System.out.println(sdt.endsWith("559"));
        String str1="Xin chào các bạn mình tên là Phạm Văn Hùng";
        String str2="Xin chào";
        String str3="Xin chào 123";
        char s1='P';
        char s2='p';
//
//        System.out.println(str1.indexOf(str2));
//        System.out.println(str1.indexOf(str3));
//
//        System.out.println(str2.indexOf(str1));
//        System.out.println(str1.indexOf(s1));

        System.out.println(str1.concat(str2));
        System.out.println(str1.replace(s1,s2));
        System.out.println(str2.replace("Xin","Đmm"));

        System.out.println(str1.toLowerCase());
        System.out.println(str2.toUpperCase());

        char[] arr=str2.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        String str4=str1.substring(10,20);
        System.out.println(str4);
    }
}
