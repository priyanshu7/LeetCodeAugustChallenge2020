package august2020;

import java.util.*;


public class PascalTriangle2 {
	
	public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> result = new ArrayList<>();

        long c = 1;
        for (int j = 0; j <= rowIndex; j++) {
        result.add((int) c);
        c *= rowIndex - j;
        c /= j + 1;
        }
        return result;
    }

}
