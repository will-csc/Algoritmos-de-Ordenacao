import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a base: ");
        int b = in.nextInt();
        System.out.println("Enter a power: ");
        int p = in.nextInt();
        
        int result = power(b,p);
        System.out.printf("%d^%d = %d",b,p,result);
    }
    public static int power(int b, int p){
        if(p == 1){return b;}
        
        int t = power(b,p/2) * power(b,p/2);
        
        if(p % 2 == 0){
            return t;
        }
        return t * b;
    }
}