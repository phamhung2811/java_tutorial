package abstractClass;

public class run {
    public static void main(String[] args) {
        ToaDo td1 = new ToaDo(5, 4);
        ToaDo td2 = new ToaDo(11, 21);
        ToaDo td3 = new ToaDo(7, 9);
        hinh h1 = new diem(td1);
        hinh h2=new hinhTron(td2,10);
        hinh h3=new hinhChuNhat(td3,5,3);
        System.out.println(h2.tinhDienTich());
        System.out.println(h3.tinhDienTich());
    }
}

