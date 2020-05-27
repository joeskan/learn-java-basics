package com.example.arrays;

public class CompareArrays {
    public static void main(String[] args) {
        int [] nums1 = {2,4,6,8,10};
        int [] nums2 = {2,4,6,8,10};

        // cannot do simple nums1 == nums2 comparison as they point to different memory locations

        /*
        if (nums1 == nums2){
            System.out.println("They are the same");
        }
        else{
            System.out.println("They are not the same!");
        }

         */

        boolean arraysEqual = true;
        int i = 0;

        if (nums1.length != nums2.length){
            arraysEqual = false;
        }

        while (arraysEqual && i < nums1.length){
            if (nums1[i] != nums2[i]){
                arraysEqual = false;
            }
            i++;
        }

        if (arraysEqual){
            System.out.println("They are the same!");
        }
        else{
            System.out.println("They are not the same!");
        }


    }
}
