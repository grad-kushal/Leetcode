import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String [] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1,2,3,4,4,9,56,90}, 8)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        //List<Integer> nums = Arrays.stream(numbers).boxed().toList();
        int[] answer = new int[2];
        for(int i = 0; i < numbers.length; i++) {
            int searchTarget = target - numbers[i];
            //List<Integer> sublist = nums.subList(i + 1 , nums.size());
            int found = binarySearch(numbers, i+1, numbers.length-1, searchTarget);
            if (found > 0) {
                answer = new int[]{i + 1, found + 1};
                break;
            }
        }
        return answer;
    }

    static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }

//    private static int findSmallestGreaterThanTarget(int[] numbers, int targetSum) {
//        int length = numbers.length;
//        int max = numbers[length - 1];
//        int num = numbers[0];
//        int i = 0, left = 0, right = length -1;
//        int result = 0;
//        while(num < targetSum) {
//            int index = length/2;
//            if(numbers[index] >= targetSum) {
//                right = index - 1;
//                max = numbers[right];
//                result = index;
//                num = numbers[index];
//            } else {
//                right = right;
//                left = index + 1;
//                num = numbers[left];
//            }
//        }
//        return result;
//    }
}