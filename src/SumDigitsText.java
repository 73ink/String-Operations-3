public class SumDigitsText {
    public static int sumDigits(String enteredText){
        int digitTotal = 0;
        for (int num = 0; num < enteredText.length(); num++){
            char currentCharacter = enteredText.charAt(num);

            if (Character.isDigit(currentCharacter)) {
                digitTotal += Integer.parseInt(String.valueOf(currentCharacter));
            }
        }
        return digitTotal;
    }
    public static void main(String[] args){
        System.out.println(sumDigits("aa1bc2d3"));
        System.out.println(sumDigits("aa11b33"));
        System.out.println(sumDigits("Chocolate"));
    }
}
