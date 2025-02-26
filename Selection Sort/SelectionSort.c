#include <stdio.h>
#include <stdlib.h>

#define MAX 100
#define MIN 0

void SelectionSort(int arr[], int size){
	int min, temp;

	for(int i = 0; i < size; i++){
		min = i;
		for(int j = i + 1; j < size; j++){
			if(arr[j] < arr[min]){
				min = j;
			}
		}
		temp = arr[i];
		arr[i] = arr[min];
		arr[min] = temp;
	}
}
void printArray(int arr[], int size){
	printf("[");
	for(int i = 0; i < size; i++){
		if(i + 1 == size){
			printf("%d",arr[i]);
			break;
		}
		printf("%d,",arr[i]);
	}
	printf("]");
}
void randomArray(int arr[], int size){
	for(int i = 0; i < size; i++){
		arr[i] = MIN + rand() % (MAX - MIN + 1);
	}
}
int main(){
	int size;

	printf("Enter a size value: ");
	scanf("%d",size);
	int arr[size];
	
	randomArray(arr,size);
	printf("Array: ");
	printArray(arr,size);
	
	SelectionSort(arr,size);
	printf("Sorted Array: ");
	printArray(arr,size);
}

