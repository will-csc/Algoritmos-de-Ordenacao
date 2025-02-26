#include <stdio.h>
#include <stdlib.h>

#define MIN 0
#define MAX 100

void InsertionSort(int arr[], int size){
    int temp, j;
    
    for(int i = 1; i < size; i++){
        temp = arr[i];
        j = i - 1;
        
        while(j >= 0 && arr[j] > temp){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = temp;
    }
}

void printArray(int arr[], int size){
    printf("[");
    for(int i = 0; i < size; i++){
        if(i + 1 == size){
            printf("%d",arr[i]);
            exit;
        }
        printf("%d,",arr[i]);
    }
    printf("]\n");
}
    
void randomArray(int arr[], int size){
    for(int i = 0; i < size; i++){
        arr[i] = MIN + rand() % (MAX - MIN + 1);
    }
}
int main(){
    int size;
    
    printf("Enter a size value: ");
    scanf("%d",&size);
    
    int arr[size];
    randomArray(arr,size);
    printf("Array: ");
    printArray(arr,size);
    
    InsertionSort(arr,size);
    printf("Sorted Array: ");
    printArray(arr,size);
}