public class MyStack<E> {
    private Node<E> first;
    private int size;

    private static class Node<E> {
        private Node<E> next;
        private E value;

        public Node(Node<E> next, E value) {
            this.next = next;
            this.value = value;
        }
    }

    public void push(E value) {
        first = new Node<E>(first, value);
        size++;
    }

    public E remove(int index) {
        Node<E> temp = first;
        if (index == 0) {
            --size;
        }
        first = first.next;
        size--;
        return temp.value;
    }

    public void clear() {
        first = null;
        size = 0;
    }

    public E peek() {
        return first.value;
    }

    public E pop() {
        E value = first.value;
        first = first.next;
        size--;
        return value;
    }

    public int size() {
        return size;
    }

    public String toString() {
        Node<E> current = first;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (current != null) {
            sb.append(current.value);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }

}
