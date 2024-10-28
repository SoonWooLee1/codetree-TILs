#include <stdio.h>

int main() { 
    for(int n=1; n<=8; n++){
        if(n%2==0 || n%3==0){
            printf("%d ", 1);
        }
        else{
            printf("%d ", 0);
        }
    }
    return 0;
}