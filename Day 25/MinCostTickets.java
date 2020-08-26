package august2020;

import java.util.*;
import java.util.stream.Collectors;

public class MinCostTickets {
	
	public int mincostTickets(int[] days, int[] costs) {
        Set<Integer> set = Arrays.stream(days).boxed().collect(Collectors.toSet());
        int lastDay = days[days.length - 1];
        int[] dp = new int[lastDay + 1];
        for (int i = 1; i <= lastDay; i++) {
            if (!set.contains(i)) 
				dp[i] = dp[i - 1];
            else 
				dp[i] = Math.min(dp[Math.max(0, i - 1)] + costs[0], Math.min(dp[Math.max(0, i - 7)] + costs[1], dp[Math.max(0, i - 30)] + costs[2]));
        }

        return dp[lastDay];
    }

}
