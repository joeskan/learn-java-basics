package com.example.arrays;

public class Arrays {

    public static void main(String[] args) {
        int [] nums = new int[10];

        nums[0] = 10;
        nums[1] = 15;
        nums[2] = 20;
        nums[3] = 25;
        nums[4] = 30;
        nums[5] = 35;

        int[] nums2 = {10, 15, 20, 25};


        // access nums
        System.out.println(nums[0]);
        System.out.println(nums[1]);

        // access num2
        System.out.println(nums2[0]);
        System.out.println(nums2[1]);

        // use for loop to access index values
        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

        // enhanced for loop
        for (int mynum : nums){
            System.out.println(mynum);
        }

    }
}
