package Generic;

public class box {
    private  int value;

    public box(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "box{" +
                "value=" + value +
                '}';
    }
}
