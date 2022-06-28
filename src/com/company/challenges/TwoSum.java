package com.company.challenges;
import java.util.*;
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            hash.put(nums[i], i);
        }
        for (int j=0; j<nums.length; j++){
            int difference = target-nums[j];
            if(hash.containsKey(difference) && hash.get(difference) != j ){
                return new int[]{j, hash.get(difference)};
            }
        }
        return new int[]{};
    }
}
