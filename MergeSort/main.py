import random as r

def mergeSort(arr: list):
    size = len(arr)
    if(size == 1): return

    middle = size // 2
    larr = arr[:middle]
    rarr = arr[middle:]

    mergeSort(larr)
    mergeSort(rarr)
    merge(larr,rarr,arr)

def merge(larr: list, rarr: list, arr: list):
    i = r = l = 0
    lsize = len(larr)
    rsize = len(rarr)

    while(r < rsize and l < lsize):
        if(larr[l] < rarr[r]):
            arr[i] = larr[l]
            l += 1
        else:
            arr[i] = rarr[r]
            r += 1
        i += 1

    while(r < rsize):
        arr[i] = rarr[r]
        r += 1
        i += 1
    while(l < lsize):
        arr[i] = larr[l]
        l += 1
        i += 1

def randomArray(size: int):
    return [r.randint(0,100) for i in range(size)]

print("Enter a size value")
size = int(input())

arr = randomArray(size)
print(f"Your array: {arr}")

mergeSort(arr)
print(f"Sorted array: {arr}")

