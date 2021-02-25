package wstepoop.homework.multithreading.zadanie5;

public class TreeStructure<T> {

    private Node<T> first;
    private Node<T> current;
    private Node<T> last;

    public TreeStructure() {
        first = null;
        current = null;
        last = null;
    }

    public void add(T value) {
        if (first == null) {
            first = new Node<T>(value);
            current = last = first;
        } else {
            Node<T> currentLast = last;
            Node<T> newNode = new Node<T>(value);
            last.setNext(newNode);
            newNode.setPrevious(last);
            last = newNode;
        }
    }

    public T getNext() {
        Node next = current.getNext();
        if (next == null) {
            return null;
        } else {
            current = current.getNext();
            return current.getValue();
        }
    }

    public T getPrevious() {
        Node prev = current.getPrevious();
        if (prev == null) {
            return null;
        } else {
            current = current.getPrevious();
            return current.getValue();
        }
    }

    public T get() {
        return current.getValue();
    }

    public void remove() {
        current.getPrevious().setNext(current.getNext());
        current.getNext().setPrevious(current.getPrevious());
        current = current.getPrevious();
    }


}
