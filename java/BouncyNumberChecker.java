public class BouncyNumberChecker {

    public static boolean isBouncy(int num) {
        return !isIncreasing(num) && !isDecreasing(num);
    }

    private static boolean isIncreasing(int num) {
        String numStr = String.valueOf(num);
        for (int i = 1; i < numStr.length(); i++) {
            if (numStr.charAt(i) < numStr.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isDecreasing(int num) {
        String numStr = String.valueOf(num);
        for (int i = 1; i < numStr.length(); i++) {
            if (numStr.charAt(i) > numStr.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 123456;
        if (isBouncy(num)) {
            System.out.println(num + " is a bouncy number.");
        } else {
            System.out.println(num + " is not a bouncy number.");
        }
    }
}
