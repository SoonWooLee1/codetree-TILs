#include <stdio.h>

int main() { 
    int n = 0;
    scanf("%d", &n);
    for(int i=1; i<=n; i++){
        if(i%2==0 || i%3==0){
            printf("%d ", 1);
        }
        else{
            printf("%d ", 0);
        }
    }
    return 0;
}