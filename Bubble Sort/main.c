#include <stdio.h>
#include <stdlib.h>

#define MIN 0
#define MAX 100

void bubbleSort(int arr[],int size){
    int temp;
    
    for(int i = 0; i < size - 1; i++){
        for(int j = 0; j < size - 1 - i; j++){
            if(arr[j] > arr[j+1]){
                temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
        }
    }
    
}

void randomArray(int arr[], int size){
    int i = 0;
    
    while(i < size){
        arr[i++] = MIN + rand() % (MAX - MIN + 1);
    }
}
void printArray(int arr[], int size){
    int i = 0;
    
    printf("[");
    while(i < size){
        if(i + 1 == size){
            printf("%d",arr[i]);
            break;
        }
        printf("%d,",arr[i++]);
    }
    printf("]");
}

int main(){
    int size;
    
    printf("Enter a size value for array: ");
    scanf("%d",&size);
    int arr[size];
    
    randomArray(arr,size);
    printf("\nArray: ");
    printArray(arr,size);
    
    printf("\nSorted array: ");
    bubbleSort(arr,size);
    printArray(arr,size);
}
