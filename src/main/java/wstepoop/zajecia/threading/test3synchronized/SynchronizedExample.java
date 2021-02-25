package wstepoop.zajecia.threading.test3synchronized;

public class SynchronizedExample {

    public static void main(String[] args) {

        Value value = new Value(0);
        Thread t1 = new Thread(new Incrementer(value));
        Thread t2 = new Thread(new Incrementer(value));

        t1.start();
        t2.start();

    }

}

class Incrementer implements Runnable {

    private final Value value;

    public Incrementer(Value value) {
        this.value = value;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1500; i++) {
            value.increaseValue();
        }
        System.out.println(value.getSomeValue());
    }

}

class Value {
    private Integer someValue;

    public Value(Integer someValue) {
        this.someValue = someValue;
    }

    public void increaseValue() {

        synchronized (this) {
            someValue++;
        }
    }

    public Integer getSomeValue() {
        return someValue;
    }
}
