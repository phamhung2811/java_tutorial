package testEnum;

import java.time.MonthDay;
import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        ThoiKhoaBieu tkb1=new ThoiKhoaBieu(Day.Monday,"Toan");
        ThoiKhoaBieu tkb2=new ThoiKhoaBieu(Day.Thursday,"Văn");
        ThoiKhoaBieu tkb3=new ThoiKhoaBieu(Day.Wednesday,"Anh");
        System.out.println(tkb1.toString());
        System.out.println(tkb3.toString());
        System.out.println(tkb2.toString());
        ArrayList<String > num=new ArrayList<String>();
        num.add("hung");
        num.add("Văn");
        String[] nums={"hung","văn"};
        System.out.println(num);
        System.out.println(Arrays.toString(nums));
    }
}
