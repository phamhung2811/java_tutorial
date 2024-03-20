package testAbstractClass;

public abstract class phuongTienDiChuyen {
    protected String tenLoaiPhuongTien;
    protected hangSanXuat hangSanXuat;

    public phuongTienDiChuyen(String tenLoaiPhuongTien, testAbstractClass.hangSanXuat hangSanXuat) {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
        this.hangSanXuat = hangSanXuat;
    }

    public void batDau(){
        System.out.println("khởi động");
    }
    public void tangToc(){
        System.out.println("tăng tốc");
    }
    public void dungLai(){
        System.out.println("dừng lại");
    }
    public abstract double layVanToc();
}
