import java.util.List;
import java.util.TreeSet;

class Solution {

    public int findMinDifference(List<String> timePoints) {
        int min = Integer.MAX_VALUE;
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0; i < timePoints.size(); i++) {
            int timeInMinutes = getTimeInMinutes(timePoints.get(i));
            if (!set.contains(timeInMinutes))
                set.add(timeInMinutes);
            else {
                min = 0;
                break;
            }
        }
        int cur = set.pollFirst();
        int first = cur;
        if(min != 0) {
            while(!set.isEmpty()) {
                int nxt = set.pollFirst();
                min = (min > nxt - cur) ? nxt - cur : min;
                cur = nxt;
            }
        }
        return min > (1440 - cur + first) ? 1440 - cur + first : min;
    }

    public int getTimeInMinutes(String t) {
        int timeInMinutes = -1;
        String [] components = t.split(":");
        timeInMinutes = Integer.parseInt(components[0]) * 60 + Integer.parseInt(components[1]);
        return timeInMinutes;
    }
}