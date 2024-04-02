package MAP;

import java.util.*;

public class main {
//    private Map<String, String > duLieu=new TreeMap<String, String>();
    private Map<String, String > duLieu=new HashMap<String, String>();
    public String themTu(String tuKhoa,String yNghia){
        return this.duLieu.put(tuKhoa,yNghia);
    }
    public String xoaTu(String tuKhoa){
        return this.duLieu.remove(tuKhoa);
    }
    public String traTu(String tuKhoa){
        String yNghia=this.duLieu.get(tuKhoa);
        return yNghia;
    }
    public void inRa(){
        Set<String> tapHopTuKhoa=this.duLieu.keySet();
        System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
    }
    public void xoaHet(){
        this.duLieu.clear();
    }
    public void soLuong(){
        System.out.println(this.duLieu.size());
    }
    public static void main(String[] args) {
        main tuDien=new main();
        int luaChon=0;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("--------------menu---------------");
            luaChon=sc.nextInt();
            sc.nextLine();
            if(luaChon==1){
                String tuKhoa=sc.nextLine();
                String yNghia=sc.nextLine();
                tuDien.themTu(tuKhoa,yNghia);
            }else if(luaChon==2||luaChon==3){
                String tuKhoa=sc.nextLine();
                if (luaChon == 2) {
                    System.out.println(tuDien.xoaTu(tuKhoa));
                }else{
                    System.out.println(tuDien.traTu(tuKhoa));
                }
            } else if (luaChon==4) {
                tuDien.inRa();
            } else if (luaChon==6) {
                tuDien.xoaHet();
            } else if (luaChon==5) {
                tuDien.soLuong();
            }
        }while (luaChon!=0);
    }
}
