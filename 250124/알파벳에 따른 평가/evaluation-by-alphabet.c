#include <stdio.h>
#include <string.h>
int main() {
    char a;
    char b[10];
    scanf("%c", &a);
    if(a=='S'){
        strcpy(b, "Superior");
    }else if(a=='A'){
        strcpy(b, "Excellent");
    }else if(a=='B'){
        strcpy(b, "Good");
    }
    else if(a=='C'){
        strcpy(b, "Usually");
    }else if(a=='D'){
        strcpy(b, "Effort");        
    }else{
        strcpy(b, "Failure");
    }printf("%s", b);
    return 0;
}