#include <stdio.h>

int main() {
    int h,m;
    char t;
    scanf("%d%c%d", &h, &t, &m);
    printf("%d:%d", h+1,m);
    return 0;
}