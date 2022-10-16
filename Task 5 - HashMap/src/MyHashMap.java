public class MyHashMap<K, V> {
    private Entry<K,V>[] table;
    private int capacity = 5;

    private int size;

    static class Entry<K, V> {
        K key;
        V value;
        Entry<K,V> next;

        public Entry(K key, V value, Entry<K,V> next){
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
    @SuppressWarnings("unchecked")
    public MyHashMap(){
        table = new Entry[capacity];
        size = 0;
    }
    public void put(K key, V value){
        if(key==null) {
            return;
        }
        int hash=hash(key);
        Entry<K,V> newEntry = new Entry<K,V>(key, value, null);
        if(table[hash] == null){
            table[hash] = newEntry;
        }else{
            Entry<K,V> previous = null;
            Entry<K,V> current = table[hash];

            while(current != null) {
                if(current.key.equals(key)) {
                    if(previous==null) {
                        newEntry.next=current.next;
                        table[hash]=newEntry;
                        return;
                    }
                    else {
                        newEntry.next=current.next;
                        previous.next=newEntry;
                        return;
                    }
                }
                previous=current;
                current = current.next;
            }
            previous.next = newEntry;
        }
        size++;
    }
    public V get(K key){
        int hash = hash(key);
        if(table[hash] == null){
            return null;
        }else{
            Entry<K,V> temp = table[hash];
            while(temp!= null){
                if(temp.key.equals(key))
                    return temp.value;
                temp = temp.next; //return value corresponding to key.
            }
            return null;   //returns null if key is not found.
        }
    }
    public boolean remove(K key){
        size--;
        int hash=hash(key);
        if(table[hash] == null){
            return false;
        }else{
            Entry<K,V> previous = null;
            Entry<K,V> current = table[hash];
            while(current != null) {
                if(current.key.equals(key)){
                    if(previous==null) {
                        table[hash]=table[hash].next;
                        return true;
                    }
                    else
                    {
                        previous.next=current.next;
                        return true;
                    }
                }
                previous=current;
                current = current.next;
            }
            return false;
        }
    }
    public void display(){

        for(int i=0;i<capacity;i++){
            if(table[i]!=null){
                Entry<K, V> entry=table[i];
                while(entry!=null){
                    System.out.print("[ "+entry.key+" = "+entry.value+" ]" +" ");
                    entry=entry.next;
                }
            }
        }

    }
    public int size() {
        return size;
    }
    public void clear() {
        Entry[] tab = table;
        for (int i = 0; i < tab.length; i++) {
            tab[i] = null;
        }
        size = 0;
        System.out.println("It's clear!");
    }
    private int hash(K key){
        return Math.abs(key.hashCode()) % capacity;
    }

}


