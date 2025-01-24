#include <stdio.h>

int main() {
    int st;
    scanf("%d", &st);
    if(st==1){
        printf("John");
    }else if(st==2){
        printf("Tom");
    }else if(st==3){
        printf("Paul");
    }else{
        printf("Vacancy");
    }
    return 0;
}