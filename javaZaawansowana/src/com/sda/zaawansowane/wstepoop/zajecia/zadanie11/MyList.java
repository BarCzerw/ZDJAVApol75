package com.sda.zaawansowane.wstepoop.zajecia.zadanie11;

public class MyList<E> {

    private int itemsCount;
    private E[] items;

    public MyList(int maxItems) {
        items = (E[])new Object[maxItems];
        itemsCount = 0;
    }

    public boolean contains(E element) {
        for (int i = 0; i < itemsCount; i++) {
            if (element.equals(items[i])) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return itemsCount;
    }

    public boolean addItem(E element) {
        if (itemsCount < items.length) {
            items[itemsCount++] = element;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder("[");
        for (int i = 0; i < itemsCount; i++) {
            text.append(items[i]);
            if (i!=itemsCount-1){
                text.append(", ");
            }
        }
        text.append("]");
        return text.toString();
    }
}
