#include<stdio.h>
int main(){
    char A[20], *p;
    int len = 0;
    printf("이름 : 신준용, 학번 : 20205195 \n");
    printf("문자열 입력 : ");
    gets(A);
    p = A;
    while(*p){
        len++;
        p++;
    }
    printf("입력된 문자열의 길이 = %d", len);
}