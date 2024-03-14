import java.util.ArrayList;
import java.util.Iterator;

public class Collection {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println("Original ArrayList:");
        System.out.println(numbers);
        int numberToRemove = 30;
        removeNumber(numbers, numberToRemove);
        System.out.println("\nArrayList after removing " + numberToRemove + ":");
        System.out.println(numbers);
    }
    public static void removeNumber(ArrayList<Integer> numbers, int numberToRemove) {
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num == numberToRemove) {
                iterator.remove();
            }
        }
    }
}
