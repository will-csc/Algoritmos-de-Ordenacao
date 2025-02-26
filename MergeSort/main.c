#include <stdio.h>
#include <stdlib.h>

#define MIN 0
#define MAX 100

void merge(int larr[], int rarr[], int arr[], int lsize, int rsize) {
    int i = 0, l = 0, r = 0;
    
    while (l < lsize && r < rsize) {
        arr[i++] = (larr[l] < rarr[r]) ? larr[l++] : rarr[r++];
    }

    while (l < lsize) arr[i++] = larr[l++];
    while (r < rsize) arr[i++] = rarr[r++];
}

void mergeSort(int arr[], int size) {
    if (size < 2) return;
    
    int middle = size / 2;
    int larr[middle], rarr[size - middle];

    for (int i = 0; i < middle; i++) larr[i] = arr[i];
    for (int i = middle; i < size; i++) rarr[i - middle] = arr[i];

    mergeSort(larr, middle);
    mergeSort(rarr, size - middle);
    merge(larr, rarr, arr, middle, size - middle);
}

void printArray(int arr[], int size) {
    printf("[");
    for (int i = 0; i < size; i++) {
        printf("%d", arr[i]);
        if (i < size - 1) printf(",");
    }
    printf("]\n");
}

void randomArray(int arr[], int size) {
    for (int i = 0; i < size; i++) {
        arr[i] = MIN + rand() % (MAX - MIN + 1);
    }
}

int main() {
    int size;
    
    printf("Enter a size value: ");
    scanf("%d", &size);
    
    int arr[size];

    randomArray(arr, size);
    printf("Array: ");
    printArray(arr, size);

    mergeSort(arr, size);
    printf("Sorted Array: ");
    printArray(arr, size);

    return 0;
}
