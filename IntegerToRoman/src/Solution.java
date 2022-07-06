import java.util.*;

public class Solution {
    public static void main(String [] args) {
        TreeMap<Integer, String> romans = new TreeMap<>(Collections.reverseOrder());
        romans.put(1, "I");
        romans.put(5, "V");
        romans.put(10, "X");
        romans.put(50, "L");
        romans.put(100, "C");
        romans.put(500, "D");
        romans.put(1000, "M");
        romans.put(900, "CM");
        romans.put(400, "CD");
        romans.put(90, "XC");
        romans.put(40, "XL");
        romans.put(9, "IX");
        romans.put(4, "IV");
        System.out.println(romans);
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(intToRoman(num, romans));
    }
    public static String intToRoman(int num, TreeMap<Integer, String> romans) {
        String result = "";
        for (Map.Entry entry : romans.entrySet()) {
            while (num >= (int) entry.getKey()) {
                result += entry.getValue();
                num = num - (int) entry.getKey();
            }
        }
        return result;
    }
}
