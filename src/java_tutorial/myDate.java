package java_tutorial;

import java.util.Objects;

public class myDate {
//    public int day, month, year;
//
//    public myDate(int day, int month, int year) {
//        this.day = day;
//        this.month = month;
//        this.year = year;
//    }
//
//    public void printDay() {
//        System.out.println("ngày:" + this.day);
//    }
//
//    public void printMonth() {
//        System.out.println("tháng:" + this.month);
//    }
//
//    public void printYear() {
//        System.out.println("năm:" + this.year);
//    }
//
//    public void printAll() {
//        System.out.println("ngày:" + this.day + " tháng: " + this.month + " năm: " + this.year);
//    }

    private int day;
    private int month;
    private int year;

    public myDate(int day, int month, int year) {
        if (day > 1 && day < 31) {
            this.day = day;
        } else {
            this.day = 1;
        }
        if (day >= 1 && month <= 12) {
            this.month = month;
        } else {
            this.month = 1;
        }
        if (year >= 1) {
            this.year = year;
        } else {
            this.year = 1;
        }

    }

    @Override
    public String toString() {
        return this.day+"/"+this.month+"/"+this.year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        myDate myDate = (myDate) o;
        return day == myDate.day && month == myDate.month && year == myDate.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }
}
