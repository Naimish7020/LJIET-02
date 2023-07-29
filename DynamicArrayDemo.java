
class DynamicArray {
    private int Array[];
    private int nextIndex;

    public DynamicArray() {
        Array = new int[5];
        nextIndex = 0;
    }

    public void add(int element) {
        if (nextIndex == Array.length) {
            restructure();
        }
        Array[nextIndex] = element;
        nextIndex++;
    }

    public int get(int index) {
        if (index >= nextIndex) {
            return -1;
        } else {
            return Array[index];
        }
    }

    public void set(int index, int element) {
        if (index > nextIndex) {
            return;
        } else if (index < nextIndex) {
            Array[index] = element;
        } else {
            add(element);
        }
    }

    private void restructure() {
        int temp[] = Array;
        Array = new int[Array.length * 2];
        for (int i = 0; i < temp.length; i++) {
            Array[i] = temp[i];
        }
    }

    public int size() {
        return nextIndex;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int removeLast() {
        if (size() == 0) {
            return -1;
        } else {
            int value = Array[nextIndex - 1];
            Array[nextIndex - 1] = 0;
            nextIndex--;
            return value;
        }
    }
}

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        for (int i = 0; i < 100; i++) {
            da.add(i + 10);
        }
        System.out.println(da.size());
        da.set(4, 10);
        System.out.println(da.get(3));
        System.out.println(da.get(4));
        while (!da.isEmpty()) {
            System.out.println(da.removeLast());
            System.out.println("size=" + da.size());
        }
    }
}
