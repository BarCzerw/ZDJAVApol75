package com.sda.programowanie.zestawtrudniejszychzadan.typygeneryczne.zadanie3;

public class Pair<T1,T2> {

    private T1 left;
    private T2 right;

    public Pair() {
        this.left = null;
        this.right = null;
    }

    public T1 getLeft() {
        return left;
    }

    public T2 getRight() {
        return right;
    }

    public void setLeft(T1 left) {
        this.left = left;
    }

    public void setRight(T2 right) {
        this.right = right;
    }

    public Pair(T1 left, T2 right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "left=" + left.toString() +
                ", right=" + right.toString() +
                '}';
    }
}
