#include <stdio.h>
#include <string.h>
int main() {
    int a;
    scanf("%d", &a);
    char b[10];
    if(a!=100){
        strcpy(b, "failure");
    }else{
        strcpy(b, "pass");
    }
    printf("%s", b);
    return 0;
}