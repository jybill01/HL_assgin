#include<stdio.h>
int main(){
    char A[20], *p;
    int len = 0;
    printf("�̸� : ���ؿ�, �й� : 20205195 \n");
    printf("���ڿ� �Է� : ");
    gets(A);
    p = A;
    while(*p){
        len++;
        p++;
    }
    printf("�Էµ� ���ڿ��� ���� = %d", len);
}