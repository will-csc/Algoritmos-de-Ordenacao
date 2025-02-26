import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a size value for array: ");
        int size = in.nextInt();
        
        int arr[] = randomArray(size);
        System.out.print("Array: ");
        printArray(arr);
        
        InsertionSort(arr);
        System.out.print("\nSorted Array: ");
        printArray(arr);
    }
    public static int[] randomArray(int size){
        Random r = new Random();
        int arr[] = new int[size];
        
        for(int i = 0; i < size; i++){
            arr[i] = r.nextInt(100);
        }
        return arr;
    }
    public static void printArray(int[] arr){
        System.out.print("[");
        for(int value : arr){
            System.out.printf("%d,",value);
        }
        System.out.print("]");
    }
    public static void InsertionSort(int[] arr){
        int size = arr.length;
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
}