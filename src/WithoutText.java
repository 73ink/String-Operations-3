public class WithoutText {
    public static String withoutString(String baseText, String removeText) {
        String resultText = "";
        String lowerBaseText = baseText.toLowerCase();
        String lowerRemoveText = removeText.toLowerCase();
        int num = 0;

        while (num < baseText.length()) {
            if (num <= baseText.length() - removeText.length()
                    && lowerBaseText.substring(num, num + removeText.length()).equals(lowerRemoveText)) {
                num += removeText.length();
            } else {
                resultText += baseText.charAt(num);
                num++;
            }

        }

        return resultText;
    }
    public static void main (String[] args){

    }
}
