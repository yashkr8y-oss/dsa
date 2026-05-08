text = "programming"

seen = set()
duplicates = set()

for char in text:
    if char in seen:
        duplicates.add(char)
    else:
        seen.add(char)
print (duplicates)