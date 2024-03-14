import java.util.ArrayList;
public class Removearr {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(7);
        numbers.add(50);
        System.out.println("Original ArrayList:");
        System.out.println(numbers);
        int Remove = 7;
        removeNum(numbers, Remove);
        System.out.println("\nArrayList after removing " + Remove + ":");
        System.out.println(numbers);
    }
    public static void removeNum(ArrayList<Integer> numbers, int Remove) {
        
}
}