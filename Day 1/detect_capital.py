def detectCapitalUse(self, word: str) -> bool:
        caps = 0
        for c in word:
            if c >='A' and c <= 'Z':
                caps = caps + 1
        if caps == 0 or caps == len(word):
            return True
        return caps == 1 and word[0].isupper()
