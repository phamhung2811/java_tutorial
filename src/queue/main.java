package queue;

import java.util.*;

public class main {
    public static void main(String[] args) {
//        Queue<String> list=new LinkedList<String >();
//        list.offer("hung123");
//        list.offer("dung123");
//        list.offer("linh123");
//        while (true){
//            String ten=list.poll();//lấy ra và xóa
//            if(ten==null){
//                break;
//            }
//            System.out.println(ten);
//        }

        Deque<String> list=new ArrayDeque<String>();
        list.offer("hung123");
        list.offer("dung123");
        list.offerLast("aung123");
        list.offerFirst("linh123");

        while (true) {
            String ten=list.poll();//lấy ra và xóa
            if(ten==null){
                break;
            }
            System.out.println(ten);
        }
    }
}
