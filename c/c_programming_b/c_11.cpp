#include<stdio.h>

void mystrcat(char *a, char *b, char *p){
    while(*a){
        *p = *a;
        p++;
        a++;
    }
    while(*b){
        *p = *b;
        p++;
        b++;
    }
    *p = '\0';
}

int main(int argc, char *argv[]){
    printf("이름 : 신준용, 학번 : 20205195 \n");
    char *stra = argv[1], *strb = argv[2], plus[50];
    mystrcat(stra, strb, plus);
    printf("plus = %s\n", plus);
    return 0;
}