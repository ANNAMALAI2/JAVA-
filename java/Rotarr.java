import java.util.ArrayList;
import java.util.Collections;
public class Rotarr {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        rotate(arrayList);
        rotate(arrayList);
        rotate(arrayList);
        System.out.println("Rotated Array: " + arrayList);
    }
    public static void rotate(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return; 
        }
        /*Integer last = list.remove(list.size() - 1);
        list.add(0, last);
        System.out.println(list);*/ //using method 1 to rotate by index change
        Collections.reverse(list);
        Collections.reverse(list.subList(0, list.size() - 1));
        Collections.reverse(list.subList(list.size() - 1, list.size()));//using reverse operation for 1st and last element method 2 
    }
}
