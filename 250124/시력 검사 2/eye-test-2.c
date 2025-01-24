#include <stdio.h>

int main() {
    double a;
    scanf("%lf", &a);
    if(a>= 1.0){
        printf("High");
    }else if(0.5<=a){
        printf("Middle");
    }else if(a<0.5){
        printf("Low");
    }
    return 0;
}