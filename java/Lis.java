import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Lis {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Printing the ArrayList
        System.out.println("Initial ArrayList: " + fruits);

        // Adding elements at specific index
        fruits.add(1, "Mango");
        System.out.println("After adding 'Mango' at index 1: " + fruits);

        // Removing element by index
        fruits.remove(0);
        System.out.println("After removing element at index 0: " + fruits);

        // Retrieving index of element
        int indexOfBanana = fruits.indexOf("Banana");
        System.out.println("Index of 'Banana': " + indexOfBanana);

        // Checking if the ArrayList contains all elements from another list
        ArrayList<String> otherFruits = new ArrayList<>();
        otherFruits.add("Banana");
        otherFruits.add("Orange");
        System.out.println("Does ArrayList contain all elements of 'otherFruits'? " + fruits.containsAll(otherFruits));
        fruits.addAll(otherFruits);
        System.out.println("After adding all elements of 'otherFruits': " + fruits);
        fruits.addAll(2, otherFruits);
        System.out.println("After adding all elements of 'otherFruits' at index 2: " + fruits);
        fruits.removeAll(otherFruits);
        System.out.println("After removing all elements of 'otherFruits': " + fruits);
        fruits.retainAll(otherFruits);
        System.out.println("After retaining only elements present in 'otherFruits': " + fruits);
        System.out.println("Iterating through ArrayList using Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("Iterating through ArrayList using ListIterator:");
        ListIterator<String> listIterator = fruits.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("Iterating through ArrayList in reverse using ListIterator:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        ArrayList<String> copy = (ArrayList<String>) fruits.clone();
        System.out.println("Shallow copy of ArrayList: " + copy);
        String[] fruitsArray = fruits.toArray(new String[0]);
        System.out.print("Array generated from ArrayList: ");
        for (String fruit : fruitsArray) {
            System.out.print(fruit + " ");
        }
        System.out.println();
        fruits.clear();
        System.out.println("ArrayList after clearing: " + fruits);
        System.out.println("Is ArrayList empty? " + fruits.isEmpty());
    }
}

