package com.timbuchalka;

public class palindromeee {
    public static void main(String[] args){

    }
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int lastDigit = 0;
        int originalNumber = number;

        while (number!=0) {
            lastDigit = number%10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }
        return (originalNumber == reverse);
    }
}
