import java.util.*;
public class Solution {
    public String reverseVowels(String s) {
        String answer = "";
        ArrayList<Character> stack = getVowelStack(s);
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                answer += stack.remove(stack.size() - 1);
            } else {
                answer += s.charAt(i);
            }
        }
        return answer;
    }

    private ArrayList<Character> getVowelStack (String s) {
        ArrayList<Character> stack = new ArrayList();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                stack.add(s.charAt(i));
            }
        }
        return stack;
    }
}