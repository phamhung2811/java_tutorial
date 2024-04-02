package collection;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        listStudent ls = new listStudent();
        int luaChon=0;
        do {
            System.out.println("--------------Menu-------------- -");
            System.out.println(
                    "1.Thêm sinh viên"
                    +"2.in ra danh sách sinh viên\n"
                    +"3.kiểm tra danh sách có rỗng hay không\n"
                    +"4.lẩy ra số lượng sinh viên co tro ng danh sách\n"
                    +"5.làm rỗng danh sách sinh viên\n"
                    +"6.Kieemr tra sinh viên có tôn tại trong danh sách sinh viên hay không\n"
                    +"7.xóa mô sinh viên\n"
                    +"8.tìm kểm tất cả sinh viên dựa trên Tên được nhập từ bàn phím\n"
                    +"9.xuất ra danh sách sinh viên vó điểm từ cao đến thấp"
                    +"0. thoát khỏi trung chình"
            );
            System.out.println("vui lòng lựa chọn chức năng");
            luaChon=sc.nextInt();
            sc.nextLine();
            switch (luaChon){
                case 1:{
                    System.out.println("nhập mã sinh viên");
                    String masv=sc.nextLine();
                    System.out.println("nhập h và tên");
                    String hoVaTen=sc.nextLine();
                    System.out.println("nhập năm sinh");
                    int namSinh=sc.nextInt();
                    System.out.println("nhập điểm tb");
                    float diemTB=sc.nextFloat();
                    student st=new student(hoVaTen,masv,namSinh,diemTB);
                    ls.addStudent(st);
                    break;
                }
                case 2:{
                    ls.fetchAll();
                    break;
                }
                case 3:{
                    System.out.println(ls.checkEmpty());
                    break;
                }case 4:{
                    ls.laySoLuongSV();
                    break;
                }case 5:{
                    ls.lamRong();
                    break;
                }case 6:{
                    System.out.println("điền mã sinh viên bạn cần tìm");
                    String newMassv=sc.nextLine();
                    student nst=new student(newMassv);
                    System.out.println(ls.checkStudent(nst));
                    break;
                }case 7:{
                    System.out.println("điền mã sinh viên bạn cần xoa");
                    String newMassv=sc.nextLine();
                    student nst=new student(newMassv);
                    ls.removeStudent(nst);
                    break;
                }case 8:{
                    System.out.println("điền mã sinh viên bạn cần tim");
                    String ten=sc.nextLine();
                    ls.searchStudent(ten);
                    break;
                }case 9:{
                    ls.sapXepDiemTBCaoDenThap();
                    ls.fetchAll();
                    break;
                }case 0:{

                    break;
                }
            }
        } while (luaChon !=0);
    }
}
