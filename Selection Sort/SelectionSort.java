import java.util.Scanner;
import java.util.Random;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a size value: ");
		int size = in.nextInt();

		int arr[] = randomArray(size);
		System.out.print("\nArray: ");
		printArray(arr);

		SelectionSort(arr);
		System.out.print("Sorted Array: ");
		printArray(arr);
	}
	public static int[] randomArray(int size){
		Random random = new Random();
		
		int arr[] = new int[size];
		for(int i = 0; i < size; i++){
			arr[i] = random.nextInt(100);
		}
		return arr;
	}
	public static void SelectionSort(int arr[]){
		int temp, min, idx = 0;

		for(int i = 0; i < arr.length; i++){
			min = arr[i];
			for(int j = i + 1; j < arr.length; j++){
				if (arr[j] < min){
					min = arr[j];
					idx = j;
				}
			}
			if(min != arr[i]){
				temp = arr[i];
				arr[i] = min;
				arr[idx] = temp;
			}
		}
	}
	public static void printArray(int[] arr){
		System.out.print("[");
		for(int value : arr){
			System.out.printf("%d,",value);
		}
		System.out.println("]");
	}
}

