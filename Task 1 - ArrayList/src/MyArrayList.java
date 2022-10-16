public class MyArrayList {
    private static final int size = 10;
    public int length = 0;

    Object[] array = new Object[size];

    public int size() {
        return length;
    }

    private void resize(int tempLength) {
        Object[] newArray = new Object[tempLength];
        System.arraycopy(array, 0, newArray, 0, length);
        array = newArray;
    }

    public void add(Object value) {
        if (length > array.length - 1) {
            resize(array.length + 1);
        }
        array[length++] = value;
    }

    public Object[] remove(int index) {
        for (int i = index; i < length - 1; i++) {
            array[i] = array[i + 1];
        }
        length--;
        resize(array.length - 1);
        return array;
    }

    public Object get(int index) {
        if (array.length > index) {
            return array[index];
        }
        else {
            return "null";
        }
    }

    public void clear() {
        length = 0;
        resize(0);
        System.out.println("Clear!");
    }

    public void printArr(Object[] value) {
        for (Object list: value ) {
            System.out.println(list);
        }
    }

}