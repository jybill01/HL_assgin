#include<stdio.h>
#include<string.h>
int main(){
    printf("�̸� : ���ؿ�, �й� : 20205195 \n");
    char arr[30];
    char *p;
    printf("���ڿ� �Է� : ");
    gets(arr);
    p = arr;
    for(int i = strlen(p) - 1; i >= 0; i--){
        printf("%c", p[i]);
    }
}