package Generic;

public class text {
    public static void main(String[] args) {
        box box=new box(15);
        System.out.println(box.toString());
        box2<String> box2=new box2<String>("hello");
        System.out.println(box2.toString());
    }
}
