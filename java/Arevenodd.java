public class Arevenodd {
    public static void main(String[] args) {
        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int evenCount = 0;
        int oddCount = 0;
        int largestEven = Integer.MIN_VALUE;
        int largestOdd = Integer.MIN_VALUE;

        for (int[] row : numbers) {
            for (int num : row) {
                if (num % 2 == 0) { // Even number
                    evenCount++;
                    if (num > largestEven) {
                        largestEven = num;
                    }
                } else { // Odd number
                    oddCount++;
                    if (num > largestOdd) {
                        largestOdd = num;
                    }
                }
            }
        }

        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
        System.out.println("Largest even number: " + (largestEven == Integer.MIN_VALUE ? "No even numbers found" : largestEven));
        System.out.println("Largest odd number: " + (largestOdd == Integer.MIN_VALUE ? "No odd numbers found" : largestOdd));
    }
}
