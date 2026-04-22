public class MirrorEndsText {
    public static String mirrorEnds(String enteredText) {
        String mirrorPart = "";
        for (int num = 0; num < enteredText.length(); num++) {
            if (enteredText.charAt(num) == enteredText.charAt(enteredText.length() - 1 - num)) {
                mirrorPart += enteredText.charAt(num);
            } else {
                break;
            }
        }
        return mirrorPart;
    }
    public static void main (String [] args){
        System.out.println(mirrorEnds("abXYZba"));
        System.out.println(mirrorEnds("abca"));
        System.out.println(mirrorEnds("aba"));
    }
}
