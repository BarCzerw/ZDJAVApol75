package wstepoop.homework.multithreading.zadanie5;

public class Node<T> {

    private Node previous;
    private Node next;
    private T value;

    public Node(T value) {
        this.previous = null;
        this.next = null;
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrevious(Node prev) {
        this.previous = prev;
    }

    public Node getPrevious() {
        return previous;
    }

    public Node getNext() {
        return next;
    }

    public T getValue() {
        return value;
    }
}
