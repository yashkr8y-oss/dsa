#return true if the given strings are same and false when they are not same false
"""def is_anagram(a,b):
    return sorted(a) == sorted(b)

print(is_anagram("listen", "silent"))"""


# Method 2
'''def is_anagram(a, b):
    if len(a) != len(b):
        return False
    count = {}
    for ch in a: 
        count[ch] = count.get(ch, 0)+1
    for ch in b:
            if ch not in count.values():
                 return False
            count [ch] -= 1
    for v in count.values():
         if v != 0:
              return False
    return True
print(is_anagram("listen", "silent"))'''
student = {"name": "yash", "age" : 24}
print(student.get("name"))
