import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a base: ");
        int b = in.nextInt();
        
        int result = factorial(b);
        System.out.printf("%d! = %d",b,result);
    }
    public static int factorial(int b){
        if(b == 0){ return 1;}
        
        return factorial(b-1) * b;
    }
}