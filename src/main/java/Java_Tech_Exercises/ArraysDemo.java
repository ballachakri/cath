package Java_Tech_Exercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArraysDemo {

    public static void main(String[] args) {

//// sorting an int array in ascending order
//        int[] sortedArray = sort();
//        for (int i : sortedArray) {
//            System.out.print(i + "");
//        }
//
//// find the maximum / minimum value from the int array.
//        int biggestNumber = max();
//        System.out.println("biggest number in array is : " + biggestNumber);
//
//// reverse of the char array
//        String reverseOfArray = rev();
//        System.out.println("Reverse of the char Array is : " + reverseOfArray);

// number of occurances of char in Char Array
        noOfOccurance();
    }

    /**
     * sorting the int array in ascending order
     */
    private static int[] sort() {
        int[] arr = {11, 9, 7, 14, 3, 4, 19, 5};
        Arrays.sort(arr);
        int[] temp = Arrays.copyOf(arr, arr.length);
        return temp;

    }

    /**
     * This method returns maximum value from the array.
     * The similar logic is used to find minimum value by changing to >= in if condition.
     *
     * @return
     */
    private static int max() {
        int[] arr = {11, 9, 7, 14, 3, 4, 19, 5};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max <= arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * This method returns the reverse of char Array;
     *
     * @return
     */
    private static String rev() {
        char[] chArr = {'L', 'O', 'N', 'D', 'O', 'N'};
        String revChar = "";

        for (int i = chArr.length - 1; i >= 0; i--) {
            revChar = revChar + chArr[i];
        }
        return revChar;
    }

    /**
     * This method checks for the number of occurances of character in char Array.
     */
    private static void noOfOccurance() {
        char[] chArr = {'L', 'O', 'N', 'D', 'O', 'N'};
        int count = 0;

      HashMap<Character,Integer> map=new HashMap<>();
      // checking each char of array
      for(char c:chArr) {
          if(map.containsKey(c)) {
            // if char is present, then increment it's count
              map.put(c,map.get(c)+1);
          }else {
              map.put(c,1);
          }
      }
      //  checking for repeated chars
        System.out.println(map);
    }

}
