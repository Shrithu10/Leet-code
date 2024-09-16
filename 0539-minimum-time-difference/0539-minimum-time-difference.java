import java.time.LocalTime;
import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int findMinDifference(List<String> timePoints) {
        List<LocalTime> times = new ArrayList<>();
        for (String time : timePoints) {
            times.add(LocalTime.parse(time));
        }
        
        Collections.sort(times);
        
        int minDifference = Integer.MAX_VALUE;
        
        for (int i = 0; i < times.size(); i++) {
            LocalTime currentTime = times.get(i);
            LocalTime nextTime = times.get((i + 1) % times.size());
            
            long difference = Duration.between(currentTime, nextTime).toMinutes();
            if (difference < 0) {
                difference += 24 * 60;
            }
            
            minDifference = (int) Math.min(minDifference, difference);
        }
        
        return minDifference;
    }
}
