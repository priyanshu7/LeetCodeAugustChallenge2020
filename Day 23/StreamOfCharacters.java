package august2020;

public class StreamOfCharacters {
	
	class StreamChecker {

	    TrieNode root = new TrieNode();
	    StringBuilder sb = new StringBuilder();
	    
	    class TrieNode {
	        TrieNode[] children = new TrieNode[26];
	        boolean isWord = false;
	    }
	    
	    public void addWord(String str) {
	        TrieNode current = root;
	        for(int i = str.length() - 1; i >= 0; i--) {
	            if(current.children[str.charAt(i) - 'a'] == null)
	                current.children[str.charAt(i) - 'a'] = new TrieNode();
	            current = current.children[str.charAt(i) - 'a'];
	        }
	        current.isWord = true;
	    }
	    
	    
	    public StreamChecker(String[] words) {
	        for(String word : words) {
	            addWord(word);
	        }
	    }
	    
	    public boolean query(char letter) {
	        sb.append(letter);
	        TrieNode current = root;
	        for(int i = sb.length() - 1; i >= 0 && current != null; i--) {
	            current = current.children[sb.charAt(i) - 'a'];
	            if(current != null && current.isWord) {
	                return true;
	            }
	        }
	        return false;
	    }
	}

}
