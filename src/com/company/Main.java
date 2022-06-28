package com.company;

import com.company.challenges.ImplementParseInt;
import com.company.challenges.TwoSum;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println( ImplementParseInt.parseIntCustomImpl("590"));

        System.out.println("Two sum "+ Arrays.toString(TwoSum.twoSum(new int[]{2, 7, 11, 15}, 9)));

        System.out.println("Two sum "+ Arrays.toString(TwoSum.twoSum(new int[]{3,2,4}, 6)));
    }

}
