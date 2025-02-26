import random as r

def BubbleSort(arr: list):
    length = len(arr)
    
    for i in range(length):
        for idx in range(length - i - 1):
            if arr[idx] > arr[idx+1]:
                arr[idx+1], arr[idx] = arr[idx], arr[idx+1]
                

size = int(input("Enter a list size: "))
arr = [r.randint(0,100) for _ in range(size)]
print(f"\nArray before sort: {arr}")

BubbleSort(arr);

print("Sorted List:", arr)