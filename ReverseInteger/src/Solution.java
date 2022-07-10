public class Solution {
    public static void main(String [] args) {
        System.out.println(reverse(1534236469));
    }
    public static int reverse(int x) {
        long result = 0;
        boolean flag = true;
        while(x != 0) {
            result = 10 * result + x%10;
            x /= 10;
            if(result < Math.pow(-2, 31) || result > Math.pow(2, 31) -1) {
                flag = false;
                break;
            }
        }
        return flag ? (int) result : 0;
    }
}