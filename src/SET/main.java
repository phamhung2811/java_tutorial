package SET;

import java.util.*;

public class main {
    Set<String> thungPhieuDuThuong = new HashSet<String>();

    public main() {
    }

    public boolean themPhieu(String giaTri) {
        return this.thungPhieuDuThuong.add(giaTri);
    }

    public boolean xoaPhieu(String giaTri) {
        return this.thungPhieuDuThuong.remove(giaTri);
    }

    public boolean kiemTraTonTai(String giaTri) {
        return this.thungPhieuDuThuong.contains(giaTri);
    }

    public void xoaHet() {
        this.thungPhieuDuThuong.clear();
    }

    public int LaySoLuong() {
        return this.thungPhieuDuThuong.size();
    }

    public String rutMotPhieu() {
        String ketQua = "";
        Random rd = new Random();
        int viTri = rd.nextInt(this.thungPhieuDuThuong.size());
        ketQua = (String) this.thungPhieuDuThuong.toArray()[viTri];
        return ketQua;
    }
    public void inRaTatCa(){
        System.out.println(Arrays.toString(this.thungPhieuDuThuong.toArray()));
    }
    public static void main(String[] args) {


        int luaChon = 0;
        Scanner sc = new Scanner(System.in);
        main rt = new main();
        do {
            System.out.println("---------------------Menu--------------------");
            System.out.println("1.Thêm mã số dự thưởng");
            System.out.println("2.xóa mã số dự thưởng");
            System.out.println("3.kiêểm tra có tồn tại ko");
            System.out.println("4.xóa tất cả các phiếu");
            System.out.println("5.số lượng phiếu");
            System.out.println("6.rút thăm");
            System.out.println("7.tất cả các thăm");
            System.out.println("0.thoát khỏi trương trình");
            luaChon = sc.nextInt();
            sc.nextLine();
            if (luaChon == 1 || luaChon == 2 || luaChon == 3) {
                System.out.println("nhập lựa chọn");
                String giaTri=sc.nextLine();
                if (luaChon == 1) {
                    rt.themPhieu(giaTri);
                } else if (luaChon == 2) {
                    rt.xoaPhieu(giaTri);
                } else if (luaChon == 3) {
                    System.out.println(rt.kiemTraTonTai(giaTri));
                }
            } else if (luaChon == 4) {
                rt.xoaHet();
            } else if (luaChon == 5) {
                System.out.println(rt.LaySoLuong());
            } else if (luaChon == 6) {
                System.out.println(rt.rutMotPhieu());
            }else if(luaChon==7){
                rt.inRaTatCa();
            }
        } while (luaChon != 0);
    }
}
