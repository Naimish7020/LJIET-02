import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(2, 40);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (int element : list) {
            System.out.println(element);
        }
        list.remove(2);
        list.set(2, 30);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list1.add("naimish");
        list1.add("Krutika");
        list1.add("Gelani");
        list1.add("ladani");
        for (String element1 : list1) {
            System.out.println(element1);
        }
    }
}
