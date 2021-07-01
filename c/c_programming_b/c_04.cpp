#include<stdio.h>

int main(){
    printf("이름 : 신준용, 학번 : 20205195 \n");
    int a, b, x, y;
    printf("첫 번째 숫자를 입력하세요 : ");
    a = getchar();
    getchar();
    printf("두 번째 숫자를 입력하세요 : ");
    b = getchar();
    (48 <= a && a <= 57) ? x = a - 48 : x = 1;
    (48 <= b && a <= 57) ? y = b - 48 : y = 1;
    printf("두 수의 곱은 = %d", x * y);
}