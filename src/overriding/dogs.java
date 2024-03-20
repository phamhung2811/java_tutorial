package overriding;

public class dogs extends animals {
    public dogs(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("xương");    }

    @Override
    public void makeSound() {
        System.out.println("gâu gâu");
    }
}
