import java.util.ArrayList;
import java.util.HashSet;
public class Duparr {
    public static void main(String[] args) {
        ArrayList<Integer> array= new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(2);
        array.add(4);
        array.add(1); 
        ArrayList<Integer> listWithDuplicates = removeDuplicates(array);
        System.out.println("ArrayList without duplicates: " + array);
    }
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> listWithDuplicates) {
        HashSet<T> set = new HashSet<>(listWithDuplicates);
        return new ArrayList<>(set);
    }
}

