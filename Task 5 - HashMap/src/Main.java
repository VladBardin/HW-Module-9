public class Main {
    public static void main(String[] args) {
        MyHashMap<String, Integer> hashmap = new MyHashMap<>();

        hashmap.put("One", 1);
        hashmap.put("Two", 2);
        hashmap.put("Three", 3);
        hashmap.put("Four", 4);
        hashmap.put("Five", 5);

        System.out.print("Display HashMap: ");
        hashmap.display();
        System.out.println("Size is " + hashmap.size());

        System.out.println("Value that corresponding to key Two = " + hashmap.get("Two"));
        System.out.println("Value that corresponding to key Four = " + hashmap.get("Four"));

        System.out.println("Value that corresponding to key Two removed: " + hashmap.remove("Two"));
        System.out.println("Value that corresponding to key Four removed: " + hashmap.remove("Four"));

        System.out.print("Display HashMap: ");
        hashmap.display();
        System.out.println("Size is " + hashmap.size());

        System.out.print("Lets clear HashMap: ");
        hashmap.clear();

        System.out.print("Display HashMap: ");
        hashmap.display();
        System.out.println("Size is " + hashmap.size());
    }
}
