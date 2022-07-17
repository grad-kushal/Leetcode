import java.util.HashSet;
import java.util.Set;

class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        boolean flag = false;
        int answer = 0;
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                flag = true;
                answer = i;
                break;
            }
        }
        return flag ? answer : nums.length+1;
    }
}