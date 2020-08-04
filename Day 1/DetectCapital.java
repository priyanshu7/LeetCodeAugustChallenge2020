package august2020;

public class DetectCapital {
	
	public boolean detectCapitalUse(String word) {
        int capsCount = 0;
        for(int i = 0; i < word.length(); i++){
            if(Character.isUpperCase(word.charAt(i)))
                capsCount++;
        }
        if(capsCount == word.length() || capsCount == 0) return true;
        return capsCount == 1 && Character.isUpperCase(word.charAt(0));
    }

}
