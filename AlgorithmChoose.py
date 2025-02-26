import random as r  

leetcode = ["Binary Search","Bubble Sort","Insertion Sort","Merge Sort",
            "Recursion", "Selection Sort","Quick Sort"]
lang = ["Java","Python","Rust","C"]
r.shuffle(leetcode)
r.shuffle(lang)

idx = r.randint(0,len(leetcode)-1)
idx2 = r.randint(0,len(lang)-1)

print(f"You are going to code the '{leetcode[idx]}' algorithm in '{lang[idx2]}' language")