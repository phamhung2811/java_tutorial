package exam;

public class students implements Comparable<students> {
    private int masv;
    private String hoVaTen;
    private String tenLop;
    private double diemTrungBinh;

    public students(int masv, String hoVaTen, String tenLop, double diemTrungBinh) {
        this.masv = masv;
        this.hoVaTen = hoVaTen;
        this.tenLop = tenLop;
        this.diemTrungBinh = diemTrungBinh;
    }

    public int getMasv() {
        return masv;
    }

    public void setMasv(int masv) {
        this.masv = masv;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getTen() {
        String s = this.hoVaTen.trim();
        if (s.indexOf(" ") >= 0) {
            int vt = s.lastIndexOf(" ");
            return s.substring(vt + 1);
        } else {
            return s;
        }
    }

    @Override
    public String toString() {
        return "students{" +
                "masv=" + masv +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", tenLop='" + tenLop + '\'' +
                ", diemTrungBinh=" + diemTrungBinh +
                '}';
    }

    @Override
    public int compareTo(students o) {
        String tenThis = this.getTen();
        String tenO = o.getTen();
        System.out.println(tenO);
        return tenThis.compareTo(tenO);
    }
}
