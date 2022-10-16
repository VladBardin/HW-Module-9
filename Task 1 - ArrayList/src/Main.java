public class Main {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        list.printArr(list.array);

        System.out.println("Size of list: " + list.size());

        System.out.println("Get element: " + list.get(2) + " of index 2");

        System.out.println("Remove element with index 2: ");

        list.printArr(list.remove(2));

        System.out.println("New size of list: " + list.size());

        System.out.println("Clear list: ");

        list.clear();

        System.out.println("Everything is clear");
    }
}
