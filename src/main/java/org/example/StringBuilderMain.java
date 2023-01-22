package org.example;

public class StringBuilderMain {

    public static void main(String[] args) {

        String palindrome = "abcdba";

        System.out.println(StringBuilderMain.isPalindrome(palindrome));

    }

    public static boolean isPalindrome(String str) {

        str = str.toLowerCase();

        int halfWay = str.length() / 2;
        int endCursor;
        for (int startCursor = 0; startCursor < halfWay; startCursor++) {
            endCursor = str.length() - startCursor - 1;
            if (str.charAt(endCursor) != str.charAt(startCursor)) {
                return false;
            }
        }
        return true;
    }
}
