package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class listStudent {
private ArrayList<student> danhSach;

    public listStudent(ArrayList<student> danhSach) {
        this.danhSach = danhSach;
    }

    public listStudent() {
        this.danhSach=new ArrayList<student>();
    }

    public ArrayList<student> getDanhSach() {
        return danhSach;
    }

    public void setDanhSach(ArrayList<student> danhSach) {
        this.danhSach = danhSach;
    }
    public void addStudent( student sv){
        this.danhSach.add(sv);
    }
    public void fetchAll(){
        for (student student: danhSach) {
            System.out.println(student.toString());
        }
    }
    public boolean checkEmpty(){
        return this.danhSach.isEmpty();
    }
    public void laySoLuongSV(){
        System.out.println(this.danhSach.size());
    }
    public void lamRong(){
        this.danhSach.removeAll(danhSach);
    }
    public boolean checkStudent(student sv){
        return this.danhSach.contains(sv);
    }
    public boolean removeStudent(student sv){

        return this.danhSach.remove(sv);
    }
    public void searchStudent(String ten){
        for(student student:danhSach){
            if(student.getHoVaTen().indexOf(ten)>=0){
                System.out.println(student);
            }
        }
    }
    public void sapXepDiemTBCaoDenThap(){
        Collections.sort(this.danhSach, new Comparator<student>() {

            @Override
            public int compare(student sv1, student sv2) {
                if(sv1.getDiemTB()< sv2.getDiemTB()){
                    return -1;
                }else if(sv1.getDiemTB()> sv2.getDiemTB()){
                    return 1;
                }else{
                    return 0;
                }
            }
        });
    }
}
