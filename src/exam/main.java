package exam;

import java.util.Arrays;

public class main {
    public static int[] reverse(int[] x){
        int[] rs=new int[x.length];
        int index=0;
        for (int i = rs.length-1; i >=0; i--) {
            rs[index]=x[i];
            index++;
        }
        return rs;
    }
    public static void main(String[] args) {
        students st1=new students(123,"hung1","lop1",7.8);
        students st2=new students(1212,"Tran thi kim dung","lop2",7.9);
        students st3=new students(1212,"pham van hung","lop2",7.9);
//        System.out.println(st2.compareTo(st3));


//        int[] a={1,2,3,4,7,5,6};
//        int[] b=new int[15];
//        Arrays.sort(a);
//        //tìm kiếm
//        int result1= Arrays.binarySearch(a,4);
//        int result2= Arrays.binarySearch(a,-1);
//        System.out.println(result1);
//        System.out.println(result2);
//        System.out.println(Arrays.toString(a));
//
//        //hàm điền giá trị
//        Arrays.fill(b,5);
//        System.out.println(Arrays.toString(b));
//        a=main.reverse(a);
//        System.out.println(Arrays.toString(a));

//        students[] a_st=new students[]{st1,st2,st3};
//        System.out.println(Arrays.toString(a_st));
//        Arrays.sort(a_st);
//        System.out.println(Arrays.toString(a_st));
//
//        //tìm kiếm
//        System.out.println(Arrays.binarySearch(a_st,st2));

        //hàm cắt chuỗi thành mảng

        String s1="Xin chào các bạn, tôi là hùng";
        String[] a=s1.split(" ");

        System.out.println(Arrays.toString(a));
        String[] b=s1.split(",");
        System.out.println(Arrays.toString(b));
        String s2="Xin chào các bạn,tôi là hùng.Chúc mừng bạn đã có được tôi'hehe";
        String[] c=s2.split(",");
        System.out.println(Arrays.toString(c));
    }
}
