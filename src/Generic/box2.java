package Generic;

public class box2<T> {
    private T value;

    public box2(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "box2{" +
                "value=" + value +
                '}';
    }
}
