#include<stdio.h>
#include<string.h>
int main(){
    char A[10], B[10];
    printf("문자열입력 : ");
    scanf("%s", &A);
    printf("문자열입력 : ");
    scanf("%s", &B);
    if(strlen(A) != strlen(B))printf("다름");
    else{
        for(int i = 0; i < strlen(A); i++){
            if(A[i] != B[i]){
                printf("다름");
                break;
            }
        }
        printf("같음");
    }
}