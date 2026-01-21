package array;

import java.util.ArrayList;
import java.util.List;

import static array.Basic.*;

public class Main {

  public static void printArr(int []arr){
    for(int j : arr){
      System.out.print(j + " ");
    }
    System.out.println();
  }

  public static void main(String []args){
//    System.out.println(secondLargestBruteForce(new int[]{2,3,1,5,4}));
//    System.out.println(secondLargestBetter(new int[]{2,3,1,5,4}));
//    System.out.println(secondLargestOptimal(new int[]{2,3,1,5,4}));
//    System.out.println(isSorted(new int[]{1,2,3,4,5}));
//    System.out.println(removeDuplicatesInPlaceFromSortedArrayBF(new int[]{1,1,2,2,3,4,4,5}));
//    System.out.println(removeDuplicatesInPlaceFromSortedArrayOptimal(new int[]{1,1,2,2,3,4,4,5}));
//    printArr(leftRotateByDPlacesBF(new int[]{1,2,3,4,5}, 2));
//    printArr(leftRotateByDPlacesOptimal(new int[]{1,2,3,4,5},4));
//    ArrayList<Integer> arr = new ArrayList<>(List.of(1,2,0,3,0,4,5));
//    moveZerosToEndBF(arr);
//    System.out.println(linearSearch(arr, 4));
//    moveZerosToEndOptimal(arr);
//    System.out.println(arr);
//    ArrayList<Integer> arr1 = new ArrayList<>(List.of(1,2,4,5));
//    ArrayList<Integer> arr2 = new ArrayList<>(List.of(1,2,3,3,6,7,9,10));
//    System.out.println(UnionOfTwoSortedArraysBF(arr1,arr2));
//    System.out.println(UnionOfTwoSortedArraysOptimal(arr1,arr2));
//    System.out.println(IntersectionOfTwoSortedArraysBF(new int[]{1,2,2,3,4}, new int[]{2,2,3,5}));
//    System.out.println(IntersectionOfTwoSortedArraysOptimal(new int[]{1,2,2,3,4}, new int[]{2,2,3,5}));
//    System.out.println(missingNumberBetter(new int[]{1,3,4}, 4));
//    System.out.println(missingNumberOptimal(new int[]{1,3,4}, 4));
//    System.out.println(maximumConsecutiveOnes(new int[]{1,1,0,0,1,1,1,1,0,1,1,0}));
//    System.out.println(numberAppearOnceOptimal(new int[]{1,2,2,3,4,3,1}));
//    printSubarray(new int[]{1,2,3,4,5});
//    System.out.println(longestSubarraySumKBF(new int[]{1,2,3,4,5},6));
//    System.out.println(longestSubarraySumKBetter(new int[]{4,3,3,1,1,1,2,1,3,4,5},6));
    System.out.println(longestSubarraySumKOptimal(new int[]{4,3,3,1,1,1,2,1,3,4,5},6));
  }
}
