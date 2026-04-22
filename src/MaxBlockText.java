public class MaxBlockText {
    public static int maxBlock(String enteredText) {
        if (enteredText.length() == 0) {
            return 0;
        }
        int largestBlock = 1;
        int currentBlock = 1;
        for (int num = 1; num < enteredText.length(); num++) {
            if (enteredText.charAt(num) == enteredText.charAt(num - 1)) {
                currentBlock++;
            } else {
                currentBlock = 1;
            }
            if (currentBlock > largestBlock) {
                largestBlock = currentBlock;
            }
        }
        return largestBlock;
    }
    public static void main (String[] args){
        System.out.println(maxBlock("hoopla"));
        System.out.println(maxBlock("abbCCCddBBBxx"));
        System.out.println(maxBlock(""));
    }
}
