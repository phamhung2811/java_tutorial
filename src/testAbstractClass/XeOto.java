package testAbstractClass;

public class XeOto extends phuongTienDiChuyen {
    protected String loaiNhienLieu;

    public XeOto( testAbstractClass.hangSanXuat hangSanXuat, String loaiNhienLieu) {
        super("xe oto", hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public double layVanToc() {
        return 100;
    }
}
