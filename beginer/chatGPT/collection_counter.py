from collections import Counter

text = "programming"

counts = Counter(text)
duplicates = [char for char, count in counts.items() if count > 1]
print (duplicates)