#include<stdio.h>

int main(){
    printf("�̸� : ���ؿ�, �й� : 20205195 \n");
    int a, b, x, y;
    printf("ù ��° ���ڸ� �Է��ϼ��� : ");
    a = getchar();
    getchar();
    printf("�� ��° ���ڸ� �Է��ϼ��� : ");
    b = getchar();
    (48 <= a && a <= 57) ? x = a - 48 : x = 1;
    (48 <= b && a <= 57) ? y = b - 48 : y = 1;
    printf("�� ���� ���� = %d", x * y);
}