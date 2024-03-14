import java.util.ArrayList;
public class Revarr {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5); 
        System.out.println("Original list: " + list);
        reverse(list);
        System.out.println("Reversed list: " + list);
    }
    public static void reverse(ArrayList<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(size - i - 1));
            list.set(size - i - 1, temp);
        }
}
}
