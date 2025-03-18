/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)).
*/

import java.util.ArrayList;
import java.util.List;

public class MedianOfTwoSortedArrays {
    private static  double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0.0, sum = 0.0;
        List<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;
        int len1 = nums1.length, len2 = nums2.length;

        while (i < len1 && j < len2) {
            if (nums1[i] <= nums2[j]) {
                mergedList.add(nums1[i]);
                i++;
            } else {
                mergedList.add(nums2[j]);
                j++;
            }
        }
        while (i < len1) {
            mergedList.add(nums1[i]);
            i++;
        }
        while (j < len2) {
            mergedList.add(nums2[j]);
            j++;
        }
        int[] mergedArray = new int[mergedList.size()];
        int esq=0, dir=mergedArray.length-1;
        while(esq<dir)
        {
            sum += mergedArray[esq]+mergedArray[dir];
            esq++;
            dir--;
        }
        if (mergedArray.length % 2 == 1) 
        {
            sum += mergedArray[(mergedArray.length/2)+1];
        }
        median = sum/mergedArray.length;
        return median;
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3}, nums2 = {2,2,2};
        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println(median);
        }
}
