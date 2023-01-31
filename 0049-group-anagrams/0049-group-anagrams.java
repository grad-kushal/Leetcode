class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<Integer, List<String>> map = new HashMap<>();
        for(String s : strs) {
            Integer key = 0;
            char[] chars = s.toCharArray();
            Arrays.sort(chars); 
            String b = new String(chars);
            key = b.hashCode();
            if (!map.containsKey(key))
                map.put(key, new ArrayList<>());
            List<String> currList = map.get(key);
            currList.add(s);
        }
        for (Map.Entry<Integer, List<String>> e : map.entrySet()) {
            result.add(e.getValue());
        }
        return result;
    }
}