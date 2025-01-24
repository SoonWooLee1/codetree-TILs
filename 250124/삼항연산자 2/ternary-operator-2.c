#include <stdio.h>
#include <string.h>
int main() {
    int a;
    scanf("%d", &a);
    char b[10];
    if(a!=1){
        strcpy(b, "f");
    }else{
        strcpy(b,"t");
    }printf("%s", b);
    return 0;
}