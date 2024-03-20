package java_tutorial;

public class coffe {
    public String name;
    public double price;
    public double weight;
    public coffe(String name,double price,double weight){
        this.name=name;
        this.price=price;
        this.weight=weight;
    }
    public double sumPrice(){
        double Sum=this.price * this.weight;
        return Sum;
    }
    public boolean checkWeight(double weight){
       return this.weight>weight;
    }
    public  boolean checkSum(){
        return this.sumPrice()>500000;
    }
    public double discount(double x){
        if(this.sumPrice()>500000){
            return this.sumPrice()*(x/100);
        }else{
            return 0;
        }
    }
    public double bill(double x){
        return this.sumPrice()-this.discount(x);
    }
}
