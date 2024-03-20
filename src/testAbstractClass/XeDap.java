package testAbstractClass;

public class XeDap extends phuongTienDiChuyen{
    public XeDap(testAbstractClass.hangSanXuat hangSanXuat) {
        super("xe dạp", hangSanXuat);
    }

    @Override
    public double layVanToc() {
        return 40;
    }

}
