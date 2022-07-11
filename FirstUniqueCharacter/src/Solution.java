import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public static void main(String [] args) {
        System.out.println(findCharFrquencies("dddccdbba"));
    }
    public static int findCharFrquencies(String x) {
        LinkedHashMap<Character, Integer> h = new LinkedHashMap<>();
        for(int i = 0; i < x.length(); i++) {
            char currentChar = x.charAt(i);
            if (!h.containsKey(currentChar))
                h.put(currentChar, 0);
            int charFrequency = h.get(currentChar);
            h.put(currentChar, ++charFrequency);
        }
        int mapIterator = 0;
        char answer = '1';
        for (Map.Entry entry : h.entrySet()) {
            if ((int) entry.getValue() == 1) {
                answer = (char) entry.getKey();
                break;
            }
            mapIterator++;
        }
        return (mapIterator == h.size() ? -1 : x.indexOf(answer));
    }
}