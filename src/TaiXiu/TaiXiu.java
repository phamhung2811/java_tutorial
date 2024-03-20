package TaiXiu;

import javax.swing.text.NumberFormatter;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TaiXiu {
    public static void main(String[] args) {


        double wallet = 5000000;
        Scanner sc = new Scanner(System.in);
        Locale lc=new Locale("us","US");
//        NumberFormat numf=NumberFormat.getInstance(lc);
        NumberFormat numf=NumberFormat.getCurrencyInstance(lc);
        int luaChon = 0;
        System.out.println("chào mừng bạn đến với trò chơi tài xỉu bay nhà của chúng tôi");
        System.out.println("Hãy nhập tên của bạn");
        String userName = sc.nextLine();
        do {
            System.out.println("================Mời bạn lựa chon==================");
            System.out.println("chọn 1 để tiếp tục chơi");
            System.out.println("nhấn phím bất kì dể kết thúc");
            luaChon = sc.nextInt();
            if (luaChon == 1) {
                if (wallet > 0) {
                    System.out.println("**********bắt đầu chơi:*********");
                    System.out.println("Tài khoản người dùng " + userName + " có số tiền trong ví bằng " + numf.format(wallet));
                    double bet;
                    do {
                        System.out.println("nhập số tiền cược (0<số tiền cược< số tiền trong ví");
                        bet = sc.nextDouble();
                    } while (0 > bet || bet > wallet);
                    int optionBet = 1;
                    do {
                        System.out.println("nhập số 1 để đạt tài và số 2 để chọn xỉu");
                        optionBet = sc.nextInt();
                    } while (optionBet != 1 && optionBet != 2);

//                Random xx1=new Random();
//                Random xx2=new Random();
//                Random xx3=new Random();
//
//                int gt1=xx1.nextInt(6)+1;
//                int gt2=xx2.nextInt(6)+1;
//                int gt3=xx3.nextInt(6)+1;
//                int result=gt1+gt2+gt3;
                    int result = 0;
                    for (int i = 0; i < 3; i++) {
                        Random xx = new Random();
                        int gt = xx.nextInt(5) + 1;
                        result = result + gt;
                    }
                    System.out.println(result);
                    if (result == 3 || result == 18) {
                        System.out.println("kết quả là : " + result + " nhà cái xin nhẹ ");
                        wallet = wallet - bet;
                        System.out.println("ví của bạn là: " + numf.format(wallet));
                    } else if (result >= 4 && result <= 10) {
                        if (optionBet == 2) {
                            System.out.println("kết quả là : " + result + " xỉu chúc mừng bạn đã nhận được số tiền :" + bet * 1.75);
                            wallet = wallet + bet * 1.75;
                        } else {
                            System.out.println("bạn đã chọn sai ");
                            wallet = wallet - bet;
                        }

                        System.out.println("ví của bạn là: " + numf.format(wallet));
                    } else if (result >= 11 && result <= 18) {
                        if (optionBet == 1) {
                            System.out.println("kết quả là : " + result + " tài chúc mừng bạn đã nhận được số tiền :" + bet * 1.75);
                            wallet = wallet + bet * 1.75;
                        } else {
                            System.out.println("bạn đã chọn sai ");
                            wallet = wallet - bet;
                        }
                        System.out.println("ví của bạn là: " + numf.format(wallet));
                    }
                } else if (wallet <= 0) {
                    System.out.println("bạn đã hết tiền");
                    break;
                }
            }


        } while (luaChon == 1);

    }
}
