import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String [] args) {
        System.out.println(isAnagram("rat", "car"));
    }
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sFrequencies = new HashMap<>(), tFrequencies = new HashMap<>();
        if (s.length() != t.length())
            return false;
        else {
            for (int i = 0; i < s.length(); i++) {
                char sChar = s.charAt(i);
                char tChar = t.charAt(i);
                if (!sFrequencies.containsKey(sChar)) {
                    sFrequencies.put(sChar, 0);
                }
                if (!tFrequencies.containsKey(tChar)) {
                    tFrequencies.put(tChar, 0);
                }
                int tempFreq = sFrequencies.get(sChar);
                sFrequencies.put(sChar, ++tempFreq);
                tempFreq = tFrequencies.get(tChar);
                tFrequencies.put(tChar, ++tempFreq);
            }
            return sFrequencies.entrySet().stream().allMatch(e -> e.getValue().equals(tFrequencies.get(e.getKey())));
        }
    }
}