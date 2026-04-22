public class CountTriples {
    public static int countTriple(String enteredText) {
        int tripleCount = 0;
        for (int num = 0; num < enteredText.length() - 2; num++) {
            char firstCharacter = enteredText.charAt(num);
            char secondCharacter = enteredText.charAt(num + 1);
            char thirdCharacter = enteredText.charAt(num + 2);

            if (firstCharacter == secondCharacter && secondCharacter == thirdCharacter) {
                tripleCount++;
            }
        }
        return tripleCount;
    }
    public static void main(String[] args){
        System.out.println(countTriple("abcXXXabc"));
        System.out.println(countTriple("xxxabyyyycd"));
        System.out.println(countTriple("a"));
    }
}
