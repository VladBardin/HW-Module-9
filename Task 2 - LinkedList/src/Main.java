public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println("My LinkedList list: " + list + " Size: " + list.size);

        System.out.println("Get element: " + list.get(4) + " (Index is №4");
        System.out.println("Remove element" + list.get(4));
        list.remove(4);

        System.out.println("New LinkedList list: " + list + " Size: " + list.size);

        System.out.println("Lets clear LinkedList!");
        list.clear();
        System.out.println("Clear LinkedList list: " + list + " Size: " + list.size);
        System.out.println("Its clear!");

    }
}
