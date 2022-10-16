public class MyQueue<E> {
    private Node<E> first;
    private Node<E> last;
    private int size;

    private static class Node<E> {
        private Node<E> prev;
        private Node<E> next;
        E value;

        public Node(Node<E> prev, Node<E> next, E value) {
            this.prev = prev;
            this.next = next;
            this.value = value;
        }
    }

    private String outOfBoundsMsg(int index) {
        return ("Index: " + index + " Size: " + size);
    }

    private void outOfBound (int index) {
        boolean isElementIndex = (index >= 0 && index < size);
        if (!isElementIndex) {
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        }
    }

    Node<E> findNode (int index) {
        outOfBound(index);
        Node<E> temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public int size() {
        return  size;
    }

    public E peek() {
        Node<E> temp = first;
        return temp != null ? temp.value : null;
    }

    public E poll() {
        E value = null;
        if (first != null) {
            value = first.value;
            first = first.next;
            if (first != null) {
                first.prev = null;
            }
            size--;
        }
        return value;
    }

    public void add(E value) {
        Node<E> tempLast = last;
        Node<E> newNode = new Node<>(tempLast, null, value);
        last = newNode;
        if (tempLast == null) {
            first = newNode;
        }
        else {
            tempLast.next = newNode;
        }
        size++;
    }
    public void remove(int index) {
        Node<E> temp = findNode(index);
        Node<E> next = temp.next;
        Node<E> prev = temp.prev;
        if (prev == null) {
            first = next;
        }
        else {
            prev.next = next;
            temp.next = null;
        }
        if (next == null) {
            last = prev;
        }
        else {
            next.prev = prev;
            temp.next = null;
        }
        size--;
    }

    public void clear() {
        for (Node<E> temp = first; temp != null;) {
            Node<E> next = temp.next;
            temp.value = null;
            temp.next = null;
            temp.prev = null;
            temp = next;
        }
        first = last = null;
        size = 0;
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
