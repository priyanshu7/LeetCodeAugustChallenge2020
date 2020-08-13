package august2020;

public class ExcelSheetColNumber {
	
	public int titleToNumber(String s) {
        int ans = 0, p = 0;
        for(int i = s.length()-1; i>=0; i--){
            int alpha = s.charAt(i) - 'A';
            alpha++;
            ans += alpha*Math.pow(26,p);
            p++;
        }
        return ans;
    }

}
