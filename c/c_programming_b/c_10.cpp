#include<stdio.h>
#include<string.h>
int main(){
    printf("이름 : 신준용, 학번 : 20205195 \n");
    char arr[30];
    char *p;
    printf("문자열 입력 : ");
    gets(arr);
    p = arr;
    for(int i = strlen(p) - 1; i >= 0; i--){
        printf("%c", p[i]);
    }
}