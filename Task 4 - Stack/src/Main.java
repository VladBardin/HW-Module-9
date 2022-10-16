public class Main {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println("My Stack: " + stack + "; size: " + stack.size());

        System.out.println("Return first element in queue: ");
        System.out.println(stack.peek());
        System.out.println(stack + "; size: " + stack.size());

        System.out.println("Return first element and delete them: ");
        System.out.println(stack.pop());
        System.out.println(stack + "; size: " + stack.size());

        System.out.println("Delete element with index 2: ");
        stack.remove(2);
        System.out.println(stack + "; size: " + stack.size());

        System.out.println("Clear queue: ");
        stack.clear();
        System.out.println(stack + "; size: " + stack.size());
        System.out.println("Queue is clear!");
    }
}
