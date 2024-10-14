#include <stdio.h>

int main() {
    int a=5; int b=6; int c=7; int temp1; int temp2;
    temp1 = a; temp2 = b; 
    a = c; 
    b = temp1; 
    c = temp2;
    printf("%d\n%d\n%d", a, b ,c);
    return 0;
}