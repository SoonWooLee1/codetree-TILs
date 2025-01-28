#include <stdio.h>

int main() {
    int a;
    int b;
    int c;
    scanf("%d", &a);
    if(a%2==0){
        b = a/2;
        if(b%2!=0){
            c=(b+1)/2;
        }else{
            c=b;
        }
    }else if(a%2!=0){
        b=(a+1)/2;
        c=b;
    }
    printf("%d", c);
    return 0;
}