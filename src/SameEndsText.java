public class SameEndsText {
    public static String sameEnds(String enteredText) {
        String matchingPart = "";
        int maxLength = enteredText.length() / 2;

        for (int length = 1; length <= maxLength; length++) {
            String startPart = enteredText.substring(0, length);
            String endPart = enteredText.substring(enteredText.length() - length);

            if (startPart.equals(endPart)) {
                matchingPart = startPart;
            }

        }
        return matchingPart;
    }
    public static void main (String[] args){

    }
}
