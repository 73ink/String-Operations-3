public class HappyGCheck {
    public static boolean gHappy(String enteredText) {
        for (int num = 0; num < enteredText.length(); num++) {
            if (enteredText.charAt(num) == 'g') {
                boolean hasLeftG = num > 0 && enteredText.charAt(num - 1) == 'g';
                boolean hasRightG = num < enteredText.length() - 1 && enteredText.charAt(num + 1) == 'g';

                if (!hasLeftG && !hasRightG) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
