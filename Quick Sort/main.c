#include <stdio.h>
#include <stdlib.h>

#define MAX 100
#define MIN 0

void random_array(int arr[], int size){
	for(int i = 0; i < size; i++){
		arr[i] = MIN + rand() % (MAX - MIN + 1);
	}
}
void print_array(int arr[], int size){
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
int partition(int arr[], int left, int right){
	int i = left - 1;
	int temp;
	int pivot = arr[right];

	for(int j = left; j < right; j++){
		if(arr[j] < pivot){
			i++;
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	i++;
	temp = arr[i];
	arr[i] = arr[right];
	arr[right] = temp;

	return i;
}
void quick_sort(int arr[], int left, int right){
	if(left < right){
		int pi = partition(arr,left,right);
		quick_sort(arr,left,pi-1);
		quick_sort(arr,pi+1,right);
	}
}

int main(void){
	int size;
	printf("Enter a size value: ");
	scanf("%d",&size);

	int arr[size];
	random_array(arr,size);
	printf("Array: ");
	print_array(arr,size);

	quick_sort(arr,0,size-1);
	printf("\nSorted Array: ");
	print_array(arr,size);
}
	
