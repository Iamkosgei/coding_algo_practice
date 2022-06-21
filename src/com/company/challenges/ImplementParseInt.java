package com.company.challenges;

public class ImplementParseInt {
    public static int parseIntCustomImpl(String num){
        int result =0;
        for (int i=0; i<num.length(); i++){
             char currentChar = num.charAt(i);
            if (Character.isDigit(currentChar)){
                result += getNumFromChar(currentChar) *  Math.pow(10,(num.length()-1) - i);
            }
        }
        return  result;
    }
    public static int getNumFromChar(char n){
        return switch (n) {
            case '1' -> 1;
            case '2' -> 2;
            case '3' -> 3;
            case '4' -> 4;
            case '5' -> 5;
            case '6' -> 6;
            case '7' -> 7;
            case '8' -> 8;
            case '9' -> 9;
            default -> 0;
        };
    }
}
