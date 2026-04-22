public class SumNumbersText {
    public static int sumNumbers(String enteredText) {
        int totalNumbers = 0;
        String currentNumber = "";

        for (int num = 0; num < enteredText.length(); num++) {
            char currentCharacter = enteredText.charAt(num);

            if (Character.isDigit(currentCharacter)) {
                currentNumber += currentCharacter;
            } else {
                if (!currentNumber.equals("")) {
                    totalNumbers += Integer.parseInt(currentNumber);
                    currentNumber = "";
                }
            }
        }

        if (!currentNumber.equals("")) {
            totalNumbers += Integer.parseInt(currentNumber);
        }
        return totalNumbers;
    }

    public static void main(String[] args){

    }
}
