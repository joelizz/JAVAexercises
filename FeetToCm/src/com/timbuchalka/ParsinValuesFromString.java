package com.timbuchalka;

public class ParsinValuesFromString {

    public static void main(String[] args) {
        String numberAsString = "2020";
        System.out.println("numberAsString=" + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number=" + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString");
    }

}
