class Solution {
    public String addStrings(String num1, String num2) {
        String answer = "";
        int carry = 0;
        int sum = 0;
        for(int i = num1.length()-1, j = num2.length()-1; i>=0 || j>=0; i--, j--) {
            sum = Character.getNumericValue((i<0)? '0' : num1.charAt(i)) + Character.getNumericValue((j<0)? '0' : num2.charAt(j)) + carry;
            carry = 0;
            if (sum > 9) {
                carry = 1;
                sum = sum % 10;
            }
            answer = "" + sum + answer;
        }
        return carry == 1 ? carry + answer : answer;
    }
}