class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> tm1 = new HashMap<>();
        HashMap<String, Character> tm2 = new HashMap<>();
        String[] strings = s.split(" ");
        boolean result = false;
        if(pattern.length() == strings.length) {
            for(int i = 0; i < pattern.length(); i++) {
                if(!tm1.containsKey(pattern.charAt(i)))
                    tm1.put(pattern.charAt(i), strings[i]);
                if(!tm2.containsKey(strings[i]))
                    tm2.put(strings[i], pattern.charAt(i));
            }
            String newString = "";
            for(int i = 0; i < pattern.length(); i++) {
                newString += tm1.get(pattern.charAt(i));
                newString += " ";
            }
            newString = newString.strip();
            if(tm1.size() == tm2.size()) {
                if (s.equals(newString))
                    result = true;
            } 
        }
        return result;
    }
}