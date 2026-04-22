public class EqualIsNot {
    public static boolean equalIsNot(String enteredText) {
        int isCount = 0;
        int notCount = 0;
        for (int num = 0; num < enteredText.length() - 1; num++) {
            if (enteredText.substring(num, num + 2).equals("is")) {
                isCount++;
            }
        }
        for (int num = 0; num < enteredText.length() - 2; num++) {
            if (enteredText.substring(num, num + 3).equals("not")) {
                notCount++;
            }
        }

        return isCount == notCount;
    }
    public static void main(String[] args){
        System.out.println(equalIsNot("This is not"));
        System.out.println(equalIsNot("This is notnot"));
        System.out.println(equalIsNot("noisxxnotyynotxisi"));
    }
}
