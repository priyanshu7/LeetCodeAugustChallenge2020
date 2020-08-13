package august2020;

import java.util.Arrays;

public class HIndex {
	
	public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        for (int i = 0; i < n; i++) {
            if (n - i <= citations[i]) {
                return n - i;
            }
        }
        return 0;
    }

}
