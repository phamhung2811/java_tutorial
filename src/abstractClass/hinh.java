package abstractClass;

public abstract class hinh {
    protected ToaDo toaDo;

    public hinh(ToaDo toaDo) {
        this.toaDo = toaDo;
    }


    public ToaDo getToaDo() {
        return toaDo;
    }

    public void setToaDo(ToaDo toaDo) {
        this.toaDo = toaDo;
    }
    public abstract double tinhDienTich();
}
