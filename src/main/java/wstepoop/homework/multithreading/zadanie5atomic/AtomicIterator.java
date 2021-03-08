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

    public T prev() {
        if (index.get() > 0 && index.get() < data.length) {
            return data[index.getAndDecrement()];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public boolean hasNext() {
        synchronized (this) {
            return index.get() < data.length;
        }
    }

    public boolean hasPrev() {
        return index.get() > 0;
    }
}
