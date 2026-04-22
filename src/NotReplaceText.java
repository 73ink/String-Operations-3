public class NotReplaceText {
    public static String notReplace(String enteredText) {
        String updatedText = "";
        for (int num = 0; num < enteredText.length(); num++) {
            if (num <= enteredText.length() - 2 && enteredText.substring(num, num + 2).equals("is")) {
                boolean noLetterBefore = num == 0 || !Character.isLetter(enteredText.charAt(num - 1));
                boolean noLetterAfter = num + 2 >= enteredText.length() || !Character.isLetter(enteredText.charAt(num + 2));

                if (noLetterBefore && noLetterAfter) {
                    updatedText += "is not";
                    num++;
                } else {
                    updatedText += enteredText.charAt(num);
                }
            } else {
                updatedText += enteredText.charAt(num);
            }
        }
        return updatedText;
    }
    public static void main(String[] args){

    }
}
