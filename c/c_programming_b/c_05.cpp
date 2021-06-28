#include<stdio.h>
#include<stdlib.h>
int main(){
    int n;
    scanf("%d", &n);
    for(int i = 0; i <= n; i++) {
        for(int j = i; j < n; j++) {
            printf(" ");
        }
        for(int j = -i; j <= i; j++){
            printf("%d", abs(j));
        }
        printf("\n");
    }
}