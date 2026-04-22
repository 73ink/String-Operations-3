public class EqualIsNot {
    public static boolean equalIsNot(String enteredText) {
        int isCount = 0;
        int notCount = 0;
        for (int num = 0; num < enteredText.length() - 1; num++) {
            if (enteredText.substring(num, num + 2).equals("is")) {
                isCount++;
            }
        }
        return isCount == notCount;
    }
    public static void main(String[] args){

    }
}
