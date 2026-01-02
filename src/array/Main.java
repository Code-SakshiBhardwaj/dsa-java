package array;

import java.util.ArrayList;

import static array.Basic.*;

public class Main {

  public static void main(String []args){
    System.out.println(secondLargestBruteForce(new int[]{2,3,1,5,4}));
    System.out.println(secondLargestBetter(new int[]{2,3,1,5,4}));
    System.out.println(secondLargestOptimal(new int[]{2,3,1,5,4}));
    System.out.println(isSorted(new int[]{1,2,3,4,5}));
    System.out.println(removeDuplicatesInPlaceFromSortedArrayBF(new int[]{1,1,2,2,3,4,4,5}));
    System.out.println(removeDuplicatesInPlaceFromSortedArrayOptimal(new int[]{1,1,2,2,3,4,4,5}));
  }
}
