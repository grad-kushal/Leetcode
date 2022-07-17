public class Solution {
    public static void main(String [] args) {
        System.out.println(longestCommonPrefix(new String[]{"ab","a"}));
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        int ans = -1; boolean flag = true;
        for (int j = 0; j < strs[0].length(); j++) {
            for (int i = 1; i < strs.length; i++) {
                if(j < strs[i].length()) {
                    if (strs[i].charAt(j) != strs[0].charAt(j)) {
                        flag = false;
                        break;
                    }
                } else {
                    flag = false;
                }            }
            if (flag == false) {
                break;
            } else {
                ans = j;
            }
        }
        return ans == -1 ? "" : strs[0].substring(0, ans+1);
    }
}