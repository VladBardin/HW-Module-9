public class MyLinkedList<E> {
    Node<E> first;
    Node<E> last;

    public int size = 0;

    private static class Node<E> {
        E data;
        Node<E> next;
        Node<E> prev;

        Node (E item, Node<E> next, Node<E> prev) {
            this.data = item;
            this.next = next;
            this.prev = prev;
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
        return size;
    }

    public Object get(int index) {
        return findNode(index).data;
    }

    public void add(E value) {
        Node<E> tempLast = last;
        Node<E> newNode = new Node<E>(value, null, tempLast);
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
            temp.data = null;
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
            sb.append(current.data);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }


}