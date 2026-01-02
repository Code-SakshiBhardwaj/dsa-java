package array;

import java.util.Arrays;
import java.util.HashSet;

public class Basic {

  public static int secondLargestBruteForce(int []arr){
    Arrays.sort(arr);
    int largest = arr[arr.length -1];
    int secondLargest = Integer.MIN_VALUE;
    for(int i = arr.length-2; i >= 0; i--){
      if(arr[i] != largest){
        secondLargest = arr[i];
        return secondLargest;
      }
    }
    return secondLargest;
  }

  public static int secondLargestBetter(int []arr){
    int n = arr.length;
    int largest = arr[0];
    int secondLargest = Integer.MIN_VALUE;
    for(int i = 1; i < n; i++){
      if(arr[i] > largest){
        largest = arr[i];
      }
    }
    for (int j : arr) {
      if (j < largest && j > secondLargest) {
        secondLargest = j;
      }
    }
  return secondLargest;
  }

  public static int secondLargestOptimal(int []arr){
    int n = arr.length;
    int largest = arr[0];
    int secondLargest = Integer.MIN_VALUE;
    for (int i = 1; i < n; i++){
      if(arr[i] > largest){
        secondLargest = largest;
        largest = arr[i];
      }
      else if(arr[i] < largest && arr[i] > secondLargest){
        secondLargest = arr[i];
      }
    }
    return secondLargest;
  }

  public static boolean isSorted(int []arr){
    int n = arr.length;
    for(int i = 1; i < n; i++){
      if(arr[i] < arr[i-1]){
        return false;
      }
    }
    return true;
  }

  public static int removeDuplicatesInPlaceFromSortedArrayBF(int []arr){
    HashSet<Integer> s = new HashSet<>();
    for(int i: arr){
      s.add(i);
    }
    int index = 0;
    for(int i: s){
      arr[index++] = i;
    }
    return s.size();
  }

  public static int removeDuplicatesInPlaceFromSortedArrayOptimal(int []arr){
    int i = 0;
    int j = 1;
    for(; j <arr.length; j++){
      if(arr[i] != arr[j]){
        i++;
        arr[i] = arr[j];
      }
    }
    return i+1;
  }
}
