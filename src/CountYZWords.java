import java.util.Locale;

public class CountYZWords {
    public static int countYZ(String enteredText){
        int endingCount = 0;
        String lowerText = enteredText.toLowerCase();

        for (int num = 0; num < lowerText.length(); num++) {
            char currentCharacter = lowerText.charAt(num);
            if (currentCharacter == 'y' || currentCharacter == 'z') {
                if (num == lowerText.length() - 1 || !Character.isLetter(lowerText.charAt(num + 1))) {
                    endingCount++;
                }
            }
        }
        return endingCount;
    }
    public static void main (String[] args){

    }
}
