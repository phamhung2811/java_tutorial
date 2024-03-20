package abstractClass;

public class hinhChuNhat extends hinh{
    private double chieuDai,chieuRong;

    public hinhChuNhat(ToaDo toaDo, double chieuDai, double chieuRong) {
        super(toaDo);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    @Override
    public double tinhDienTich() {
        return chieuDai*chieuRong;
    }
}
