package MayTinhBoTui;

public class main {
    public static void main(String[] args) {
        System.out.println("test câu a");
        MayTinhCasioSX500 msx500=new MayTinhCasioSX500();
        MayTinhCasioFX570 mfx570=new MayTinhCasioFX570();

        System.out.println(mfx570.chia(3,4));
        System.out.println(mfx570.cong(3,4));
        System.out.println("test câu b0");
        double [] arr1=new double[] {1,23,4,5,6};
        double [] arr2=new double[] {1,23,42,52,6};
        SapXepChen sxc1=new SapXepChen();
        SapXepChon sxc2=new SapXepChon();
        System.out.println();
        sxc1.sapXepTang(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        sxc2.sapXepGiam(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}
