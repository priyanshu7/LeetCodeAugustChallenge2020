class Solution:
    def toGoatLatin(self, S: str) -> str:
        W = S.split(" ")
        out = ''
        for i, s in enumerate(W):
            if s[0].lower()  in ['a', 'e', 'i', 'o', 'u']:
                s = s + "ma"
            else:
                s = s[1:] + s[0]
                s = s + "ma"
                
            while(i>=0):
                s = s + 'a'
                i = i-1    
            out = out + s + " "   
        return out[0:len(out)-1]