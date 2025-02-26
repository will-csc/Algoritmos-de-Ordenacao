import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a size value: ");
		int size = in.nextInt();

		int[] arr = random_array(size);
		System.out.print("Array: ");
		print_array(arr);

		System.out.print("\nSorted Array: ");
		quick_sort(arr,0,size-1);
		print_array(arr);
	}
	public static int[] random_array(int size){
		Random random = new Random();

		int[] arr = new int[size];
		for(int i = 0; i < size; i ++){
			arr[i] = random.nextInt(100);
		}
		return arr;
	}
	public static void print_array(int[] arr){
		int size = arr.length;

		System.out.print("[");
		for(int i = 0; i < size; i++){
			if(i + 1 == size){
				System.out.printf("%d",arr[i]);
				break;
			}
			System.out.printf("%d,",arr[i]);
		}
		System.out.print("]");
	}
	public static void quick_sort(int[] arr, int left, int right){
		if(left < right){
			int pi = partition(arr,left,right);
			quick_sort(arr,left,pi-1);
			quick_sort(arr,pi+1,right);
		}
	}
	public static int partition(int[] arr, int left, int right){
		int temp;
		int i = left - 1;
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
}
	




