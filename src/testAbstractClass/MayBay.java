package testAbstractClass;

public class MayBay extends phuongTienDiChuyen {
    protected String loaiNhienLieu;

    public MayBay( testAbstractClass.hangSanXuat hangSanXuat, String loaiNhienLieu) {
        super("máy bay",hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public void catCanh() {
        System.out.println("cất cánh");
    }

    public void haCanh() {
        System.out.println("hạ cánh");
    }

    @Override
    public double layVanToc() {
        return 500;
    }
}
