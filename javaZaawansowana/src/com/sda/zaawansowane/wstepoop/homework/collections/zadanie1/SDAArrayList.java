package com.sda.zaawansowane.wstepoop.homework.collections.zadanie1;

import java.util.Arrays;

public class SDAArrayList<T> {

    private T[] items;
    int itemsCount;

    public SDAArrayList() {
        this(8);
    }

    public SDAArrayList(int capacity) {
        items = (T[]) new Object[capacity];
        itemsCount=0;
    }

    public void add(T element){
        if (itemsCount==items.length){
            T[] tempArray = Arrays.copyOf(items,items.length*2);
            items=tempArray;
        }
        items[itemsCount++]=element;
    }

    public boolean remove(T element){
        int foundIndex = -1;
        for (int i = 0; i < itemsCount; i++) {
            if (element.equals(items[i])){
                foundIndex=i;
                break;
            }
        }

        if (foundIndex==-1){
            return false;
        }else {
            for (int i = foundIndex; i < itemsCount-1; i++) {
                items[i]=items[i+1];
            }
            itemsCount--;
            return true;
        }
    }

    public boolean remove(int index){
        if (index<itemsCount){
            for (int i = index; i < itemsCount-1; i++) {
                items[i]=items[i+1];
            }
            itemsCount--;
            return true;
        }else {
            return false;
        }
    }

    public T get(int index){
        if (index<itemsCount){
            return items[index];
        }else {
            return null;
        }
    }

    public void display(){

        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < itemsCount; i++) {
            sb.append(items[i]);
            if (i!=itemsCount-1){
                sb.append(", ");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    public int size(){
        return itemsCount;
    }
}
