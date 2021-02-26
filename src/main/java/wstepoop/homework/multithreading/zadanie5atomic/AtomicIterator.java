package wstepoop.homework.multithreading.zadanie5atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIterator<T> {

    private AtomicInteger index;
    private T[] data;

    public AtomicIterator(T[] data) {
        this.index = new AtomicInteger(0);
        this.data = data;
    }

    public T next() {
        if (index.get() < data.length) {
            return data[index.getAndIncrement()];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public T previous() {
        if (index.get() > 0 && index.get() < data.length) {
            return data[index.getAndDecrement()];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
