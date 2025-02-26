#include <stdio.h>

int powerof(int b,int p){
    if(p == 1) {return b;}
    
    int t = powerof(b,p/2) * powerof(b,p/2);
    
    if(p % 2 == 0){
        return t;
    }
    return t * b;
}

int main(){
    int b,p;
    
    printf("Enter a base: ");
    scanf("%d",&b);
    printf("Enter a power: ");
    scanf("%d",&p);
    
    int result = powerof(b,p);
    printf("\n%d^%d = %d",b,p,result);
}