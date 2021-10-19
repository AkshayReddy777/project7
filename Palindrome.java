package com.company;

public class Palindrome {
    static void PalindromeWord() {
        String s = "racecar" ;
        char[] c = s.toCharArray();
        int length = s.length();
        boolean palindrome = true;
        for (int i = 0; i < length / 2; i++) {
            if (c[i] != c[(length-1)-i]) {
                palindrome = false;
                break;
            }
        }
        if (palindrome == true) {
            System.out.println("The given word " + s + " is a palindrome");
        } else {
            System.out.println("The given word " + s + " is not a palindrome");
        }
    }
    public static void main (String[] args) {
        PalindromeWord();

    }
}

