package array;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;



public class main {
    public static void main(String[] args) {
        int[] m1={1,2,3};
        int[]m2=m1;
        m2[1]=1;
        System.out.println(Arrays.toString(m1));
        System.out.println(Arrays.toString(m2));

        int[]m3=m1.clone();
        m3[1]=4;
        System.out.println(Arrays.toString(m3));

        int[] m4=new int[m1.length];
        System.arraycopy(m1,0,m4,0,m1.length);
        m4[1]=4;
        System.out.println(Arrays.toString(m4));
    }


}
