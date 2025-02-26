import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a size value: ");
        int size = in.nextInt();
        
        int arr[] = randomArray(size);
        System.out.print("Array: ");
        printArray(arr);
        
        mergeSort(arr);
        System.out.print("Sorted Array: ");
        printArray(arr);
    }
    public static int[] randomArray(int size){
        Random r = new Random();
        int[] arr = new int[size];
        
        for(int i = 0; i < size; i++){
            arr[i] = r.nextInt(100);
        }
        return arr;
    }
    public static void printArray(int[] arr){
        int size = arr.length;
        System.out.print("[");
        
        for(int i = 0; i < size; i++){
            if(i + 1 == size){
                System.out.printf("%d",arr[i]);
                break;
            }
            System.out.printf("%d,",arr[i]);
        }
        System.out.print("]\n");
    }
    public static void mergeSort(int[] arr){
        int size = arr.length;
        if(size == 1){ return; }
        
        int middle = size / 2;
        int[] larr = new int[middle];
        int[] rarr = new int[size - middle];
        
        for(int i = 0; i < middle; i++){
            larr[i] = arr[i];
        }
        for(int i = 0; i < rarr.length; i++){
            rarr[i] = arr[i+middle];
        }
        
        mergeSort(larr);
        mergeSort(rarr);
        merge(larr,rarr,arr);
    }
    public static void merge(int[] larr, int[] rarr, int[] arr){
        int i = 0, l = 0, r = 0;
        int rsize = rarr.length;
        int lsize = larr.length;
        
        while(r < rsize && l < lsize){
            if(larr[l] < rarr[r]){
                arr[i] = larr[l];
                l++;
            }else{
                arr[i] = rarr[r];
                r++;
            }
            i++;
        }
        while(r < rsize){
            arr[i] = rarr[r];
            r++;
            i++;
        }
        while(l < lsize){
            arr[i] = larr[l];
            l++;
            i++;
        }
    }
}