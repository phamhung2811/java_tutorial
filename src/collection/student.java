package collection;

import java.util.Objects;

public class student implements Comparable<student>{
    protected String hoVaTen;
    protected String masv;
    protected int namSinh;
    protected float diemTB;

    public student(String masv) {
        this.masv = masv;
    }

    public student(String hoVaTen, String masv, int namSinh, float diemTB) {
        this.hoVaTen = hoVaTen;
        this.masv = masv;
        this.namSinh = namSinh;
        this.diemTB = diemTB;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "student{" +
                "hoVaTen='" + hoVaTen + '\'' +
                ", masv='" + masv + '\'' +
                ", namSinh=" + namSinh +
                ", diemTB=" + diemTB +
                '}';
    }

    @Override
    public int compareTo(student o) {
        return this.masv.compareTo(o.masv);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return Objects.equals(masv, student.masv);
    }

}
