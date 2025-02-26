import random as r

def randomArray(size: int):
    return [r.randint(0,101) for i in range(size)]
    
def InsertionSort(arr: list):
    size = len(arr)
    for i in range(1,size):
        temp = arr[i]
        j = i - 1
        
        while(j >= 0 and arr[j] > temp):
            arr[j+1] = arr[j]
            j -= 1
        arr[j + 1] = temp
    
    return arr

print("Enter a size: ")
size = int(input())

arr = randomArray(size)
print(f"Array: {arr}")

InsertionSort(arr)
print(f"Sorted Array: {arr}")