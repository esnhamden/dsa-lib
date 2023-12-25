package LinkedList;

public class SLList<T> {
    private Node<T> sentinel;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    /** Creates empty linked list. */
    public SLList() {
        sentinel = new Node<>(null, null);
        size = 0;
    }

    /** Creates linked list with one node. */
    public SLList(T data) {
        sentinel = new Node<>(null, null);
        sentinel.next = new Node<>(data, null);
        size += 1;
    }

    /** Returns number of nodes in linked list. */
    public int size() {
        return size;
    }

    /** Returns true if linked list is empty. */
    public boolean isEmpty() {
        return size == 0;
    }

    /** Creates and inserts node at specified index. */
    public void insertAtIndex(T data, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds.");
        } else {
            Node<T> p = getNode(index - 1);
            p.next = new Node<>(data, p.next);
            size += 1;
        }
    }

    /** Creates and inserts node at start of linked list. */
    public void insertFirst(T data) {
        insertAtIndex(data, 0);
    }

    /** Creates and inserts node at end of linked list. */
    public void insertLast(T data) {
        insertAtIndex(data, size);
    }

    /** Returns data in node at specified index. */
    public T getAtIndex(int index) {
        T nodeData;
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds.");
        } else {
            Node<T> p = getNode(index - 1);
            nodeData = p.next.data;
        }
        return nodeData;
    }

    /** Returns data in first node. */
    public T getFirst() {
        return getAtIndex(0);
    }

    /** Returns data in last node. */
    public T getLast() {
        return getAtIndex(size - 1);
    }

    /** Returns node at specified index. */
    private Node<T> getNode(int index) {
        Node<T> p = sentinel;
        while (index >= 0) {
            p = p.next;
            index -= 1;
        }
        return p;
    }

    /** Deletes node at specified index and returns data in deleted node. */
    public T deleteAtIndex(int index) {
        T nodeData;
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds.");
        } else {
            Node<T> p = getNode(index - 1);
            nodeData = p.next.data;
            p.next = p.next.next;
            size -= 1;
        }
        return nodeData;
    }

    /** Deletes node at start of linked list and returns data in deleted node. */
    public T deleteFirst() {
        return deleteAtIndex(0);
    }

    /** Deletes node at end of linked list and returns data in deleted node. */
    public T deleteLast() {
        return deleteAtIndex(size - 1);
    }

    /** Returns string representation of linked list. */
    @Override
    public String toString() {
        String str = "<";
        Node<T> p = sentinel.next;
        while (p != null) {
            str += " " + p.data.toString();
            p = p.next;
        }
        return str + " >";
    }
}