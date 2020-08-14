package august2020;

public class LongestPalindrome {
	
	public int longestPalindrome(String s) {
        int[] count = new int[128];
        int length = 0;
        for(char c: s.toCharArray()){
            if(++count[c] == 2){
                length += 2;
                count[c] = 0;
            }
        }
        return (length == s.length())? length: length+1;
    }

}
