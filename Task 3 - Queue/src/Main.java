public class Main {
    public static void main (String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();

        queue.add(0);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println("My queue: " + queue + "; size: " + queue.size());

        System.out.println("Return first element in queue: ");
        System.out.println(queue.peek());
        System.out.println(queue + "; size: " + queue.size());

        System.out.println("Return first element and delete them: ");
        System.out.println(queue.poll());
        System.out.println(queue + "; size: " + queue.size());

        System.out.println("Delete element with index 2: ");
        queue.remove(2);
        System.out.println(queue + "; size: " + queue.size());

        System.out.println("Clear queue: ");
        queue.clear();
        System.out.println(queue + "; size: " + queue.size());
        System.out.println("Queue is clear!");
    }
}
