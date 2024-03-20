package testAbstractClass;

public class run {
    public static void main(String[] args) {
        hangSanXuat h1=new hangSanXuat("air bird","USA");
        hangSanXuat h2=new hangSanXuat("honda","JAPAN");
        hangSanXuat h3=new hangSanXuat("hung luxury","JAPAN");

        phuongTienDiChuyen pt1=new XeDap(h3);
        MayBay pt2=new MayBay(h1,"xăng");
        phuongTienDiChuyen pt3=new XeOto(h2,"dầu");

        System.out.println(pt1.layVanToc());
        System.out.println(pt2.layVanToc());
        System.out.println(pt3.layVanToc());
        pt2.catCanh();
    }
}
