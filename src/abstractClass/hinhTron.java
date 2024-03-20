package abstractClass;

public class hinhTron extends hinh{
    private double r;

    public hinhTron(ToaDo toaDo, double r) {
        super(toaDo);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI*Math.pow(r,2);
    }
}
