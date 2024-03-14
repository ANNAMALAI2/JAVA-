public class EvilNumberChecker {

    public static boolean isEvil(int num) {
        String binaryString = Integer.toBinaryString(num);
        int countOnes = 0;
        for (char c : binaryString.toCharArray()) {
            if (c == '1') {
                countOnes++;
            }
        }
        return countOnes % 2 == 0;
    }

    public static void main(String[] args) {
        int num = 23;
        if (isEvil(num)) {
            System.out.println(num + " is an evil number.");
        } else {
            System.out.println(num + " is not an evil number.");
        }
    }
}
