#include <stdio.h>

int factorial(int b){
    if(b == 0){ return 1;}
    return factorial(b-1) * b;
}

int main(){
    int b;
    
    printf("Enter a base: ");
    scanf("%d",&b);
    
    int result = factorial(b);
    printf("\n%d!= %d",b,result);
}