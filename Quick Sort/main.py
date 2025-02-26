import random as r

def random_array(size: int):
    return [r.randint(0,100) for i in range(size)]

def quick_sort(arr: list,left: int, right: int):
    if left < right:
        pi = partition(arr,left,right)
        quick_sort(arr,left,pi-1)
        quick_sort(arr,pi+1,right)

def partition(arr: list, left: int, right: int):
    pivot = arr[right]
    i = left - 1

    for j in range(left,right):
        if(arr[j] < pivot):
            i += 1
            arr[j], arr[i] = arr[i], arr[j]
    i += 1
    arr[right], arr[i] = arr[i], arr[right]
    return i

size = int(input("Enter a size value: "))

arr = random_array(size)
print(f"Array: {arr}")

quick_sort(arr,0,size-1)
print(f"Sorted Array: {arr}")
