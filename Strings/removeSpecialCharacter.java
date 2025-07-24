package Strings;

public class removeSpecialCharacter {
    public static void main(String[] args) {
        String str = "h4ai.12'4=a.ll7";
        StringBuilder letters = new StringBuilder();
        int totalCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                letters.append(ch);
            } else if (ch == '.') {
                letters.append(' ');
            } else if (Character.isDigit(ch)) {
                if (i + 1 < str.length() && Character.isDigit(str.charAt(i + 1))) {
                    int num1 = Character.getNumericValue(ch);
                    int num2 = Character.getNumericValue(str.charAt(i + 1));
                    totalCount += (num1 + num2);
                    i++; 
                }
            }
        }

        System.out.println(letters + " " + totalCount);
    }
}
