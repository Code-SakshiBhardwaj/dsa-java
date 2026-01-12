package array;

import java.util.*;

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

  public static int[] leftRotateByDPlacesBF(int []arr, int d){
    int n = arr.length;
    d = d % n;
    int []temp = new int[d];
    for(int i = 0; i < d; i++){
      temp[i] = arr[i];
    }

    for(int i = d; i < n; i++){
      arr[i-d] = arr[i];
    }

    for(int i = 0; i < d; i++){
      arr[n-d+i] = temp[i];
    }
    return arr;
  }

  public static int[] leftRotateByDPlacesOptimal(int []arr, int d){
    int n = arr.length;
    d = d % n;
    reverseArr(arr, 0, d-1);
    reverseArr(arr, d, n-1);
    reverseArr(arr, 0, n-1);
    return arr;
  }

  public static int[] reverseArr(int []arr, int start, int end){
    int m = start+(end-start+1)/2;
    while(start!= m){
      int temp = arr[start];
      arr[start] = arr[end-start];
      arr[end-start] = temp;
      start++;
    }
    return arr;
  }

  public static ArrayList<Integer> moveZerosToEndBF(ArrayList<Integer> arr){
    int n = arr.size();
    List<Integer> temp = new ArrayList<>();
    for(int i = 0; i < n; i++){
      if(arr.get(i) != 0){
        temp.add(arr.get(i));
      }
    }
    int m = temp.size();
    for(int i = 0; i < m; i++){
      arr.set(i,temp.get(i));
    }
    for(int i = m; i < n; i++){
      arr.set(i,0);
    }
    return arr;
  }

  public static ArrayList<Integer> moveZerosToEndOptimal(ArrayList<Integer> arr){
    int n = arr.size();
    int j = -1;
    for(int i = 0; i < n; i++){
      if(arr.get(i)==0){
        j = i;
        break;
      }
    }
    if(j==-1) return arr;

    for(int i = j+1; i < n; i++){
      if(arr.get(i) != 0){
        int temp = arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);
        j++;
      }
    }
    return arr;
  }

  public static int linearSearch(ArrayList<Integer> arr, int value){
    int n = arr.size();
    for(int i = 0; i < n; i++){
      if(arr.get(i) == value){
        return i;
      }
    }
    return -1;
  }

  public static ArrayList<Integer> UnionOfTwoSortedArraysBF(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
    HashSet<Integer> set = new HashSet<>();
    for(int i = 0; i < arr1.size(); i++){
      set.add(arr1.get(i));
    }
    for(int i = 0; i < arr2.size(); i++){
      set.add(arr2.get(i));
    }
    ArrayList<Integer> union = new ArrayList<>();
    for(int val:set){
      union.add(val);
    }
    return union;
  }

  public static ArrayList<Integer> UnionOfTwoSortedArraysOptimal(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
    int n = arr1.size();
    int m = arr2.size();
    int i = 0;
    int j = 0;
    ArrayList<Integer> union = new ArrayList<>();
    while (i < n && j < m) {
      if (arr1.get(i) <= arr2.get(j)) {
        if (union.size() == 0 || union.get(union.size() - 1) != arr1.get(i)) {
          union.add(arr1.get(i));
        }
        i++;
      } else {
        if (union.size() == 0 || union.get(union.size() - 1) != arr2.get(j)) {
          union.add(arr2.get(j));
        }
        j++;
      }
    }
    while(i < n){
      if (union.size() == 0 || union.get(union.size() - 1) != arr1.get(i)) {
        union.add(arr1.get(i));
      }
      i++;
    }
    while(j < m){
      if (union.size() == 0 || union.get(union.size() - 1) != arr2.get(j)) {
        union.add(arr2.get(j));
      }
      j++;
    }
    return union;
  }

  public static List<Integer> IntersectionOfTwoSortedArraysBF(int []arr1, int []arr2){
    int n1 = arr1.length;
    int n2 = arr2.length;
    List<Integer> intersection = new ArrayList<>();
    List<Integer> visited = new ArrayList<>(Collections.nCopies(n2,0));
    for(int i = 0; i < n1; i++){
      for(int j = 0; j < n2; j++){
        if(arr1[i] == arr2[j] && visited.get(j) == 0){
          intersection.add(arr2[j]);
          visited.set(j,1);
          break;
        }
        if(arr1[i]<arr2[j]){
          break;
        }
      }
    }
    return intersection;
  }

  public static List<Integer> IntersectionOfTwoSortedArraysOptimal(int []arr1, int []arr2){
    int n1 = arr1.length;
    int n2 = arr2.length;
    List<Integer> intersection = new ArrayList<>();
    int i = 0;
    int j = 0;
    while(i < n1 && j < n2){
      if(arr1[i] < arr2[j]){
        i++;
      }
      else if(arr1[i] > arr2[j]){
        j++;
      }
      else{
        intersection.add(arr1[i]);
        i++;
        j++;
      }
    }
    return intersection;
  }

  public static int missingNumberBF(int []arr, int n){
    for(int i = 1; i <= n; i++){
      boolean isPresent = false;
      for(int val : arr){
        if(val == i){
          isPresent = true;
          break;
        }
      }
      if(!isPresent){
        return i;
      }
    }
    return -1;
  }

  public static int missingNumberBetter(int []arr, int n){
    int []hasArr = new int[n+1];
    for(int i : arr){
      hasArr[i] = 1;
    }
    for(int i = 1; i <= n+1; i++){
      if(hasArr[i] == 0){
        return i;
      }
    }
    return -1;
  }

  public static int missingNumberOptimal(int []arr, int n){
    int xor = 0;
    for(int i = 0; i < arr.length; i++){
      xor ^= (arr[i] ^ (i+1));
    }
    xor = xor ^ n;
    return xor;
  }

  public static int maximumConsecutiveOnes(int []arr){
    int maxCount = 0;
    int count = 0;
    for(int i : arr){
      if(i == 1){
        count++;
        maxCount = Math.max(maxCount, count);
      }
      else{
        count = 0;
      }
    }
    return maxCount;
  }

  public static int numberAppearOnceBF(int []arr){
    for(int i : arr){
      int count = 0;
      for(int j : arr){
        if(j == i){
          count++;
        }

      }
      if(count == 1){
        return i;
      }
    }
    return -1;
  }

  public static int numberAppearOnceBetter(int []arr){
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i : arr){
      map.put(i,map.getOrDefault(i,0)+1);
    }

    System.out.println(map);

    for(int i: map.keySet()){
      if(map.get(i) == 1){
        return i;
      }
    }
    return -1;
  }

  public static int numberAppearOnceOptimal(int []arr){
    int xor = 0;
    for(int i : arr){
      xor ^= i;
    }
    return xor;
  }
}
