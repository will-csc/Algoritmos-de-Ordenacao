import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a size for array: ");
        int size = in.nextInt();
        
        int arr[] = newArray(size);
        System.out.println("\nArray:");
        printArray(arr);
        
        System.out.println("\nSorted array:");
        BubbleSort(arr);
        printArray(arr);
    }
    public static int[] newArray(int size){
        Random random = new Random();
        
        int i = 0;
        int arr[] = new int[size];
        
        while(i < size){
            arr[i] = random.nextInt(100);
            i++;
        }
        return arr;
    }
    public static void printArray(int arr[]){
        int i = 0;
        int length = arr.length;
        
        System.out.print("[");
        while(i < length){
            if(i + 1 == length){
                System.out.printf("%d",arr[i]);
                break;
            }
            System.out.printf("%d,",arr[i]);
            i++;
        }
        System.out.print("]");
    }
    public static void BubbleSort(int arr[]){
        int length = arr.length;
        int temp;
        
        for(int i = 0; i < length; i++){ //To iterate over the elements
            for(int j = 0; j < length - 1 - i; j++){ //To iterate over the index
                if(arr[j] > arr[j + 1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}