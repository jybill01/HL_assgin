#include<stdio.h>

typedef struct abc {
    int a;
    char b;
}abc;

int main(){
    abc a = {1, 'a'};
    printf("%d, %c", a.a, a.b);
}