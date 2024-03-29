/*-Write a program to perform following operations on user entered
strings and a character –
i) Change the case of the string
ii) Reverse the string
iii) Compare two strings
iv) Insert one string into another string
v) Convert the string to upper case and lower case
vi) Check whether the character is present in the string and at which position
vii) Check whether the string is palindrome or not.
viii) Check the number of word, vowel and consonant in the string*/

package lab6;

import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str1 = scanner.nextLine();

        System.out.println("Enter another string:");
        String str2 = scanner.nextLine();

        System.out.println("Enter a character:");
        char ch = scanner.next().charAt(0);

        System.out.println("String 1 in upper case: " + str1.toUpperCase());
        System.out.println("String 2 in lower case: " + str2.toLowerCase());

        System.out.println("Reverse of String 1: " + reverseString(str1));

        if (str1.equals(str2)) {
            System.out.println("String 1 and String 2 are equal.");
        } else {
            System.out.println("String 1 and String 2 are not equal.");
        }

        System.out.println("String 2 inserted into String 1: " + insertString(str1, str2, 3));

        int position = str1.indexOf(ch);
        if (position != -1) {
            System.out.println("Character " + ch + " found at position " + (position + 1) + " in String 1.");
        } else {
            System.out.println("Character " + ch + " not found in String 1.");
        }


        if (isPalindrome(str1)) {
            System.out.println("String 1 is a palindrome.");
        } else {
            System.out.println("String 1 is not a palindrome.");
        }

        int wordCount = countWords(str1);
        int vowelCount = countVowels(str1);
        int consonantCount = countConsonants(str1);

        System.out.println("Number of words in String 1: " + wordCount);
        System.out.println("Number of vowels in String 1: " + vowelCount);
        System.out.println("Number of consonants in String 1: " + consonantCount);
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static String insertString(String original, String insert, int position) {
        StringBuilder sb = new StringBuilder(original);
        sb.insert(position, insert);
        return sb.toString();
    }

    public static boolean isPalindrome(String str) {
        String reversed = reverseString(str);
        return str.equals(reversed);
    }

    public static int countWords(String str) {
        String[] words = str.split("\\s+");
        return words.length;
    }
    public static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (char ch : str.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
    public static int countConsonants(String str) {
        int count = 0;
        String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";

        for (char ch : str.toCharArray()) {
            if (consonants.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
}
