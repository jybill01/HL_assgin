#include<stdio.h>
#include<string.h>
int main(){
    char A[10], B[10];
    printf("���ڿ��Է� : ");
    scanf("%s", &A);
    printf("���ڿ��Է� : ");
    scanf("%s", &B);
    if(strlen(A) != strlen(B))printf("�ٸ�");
    else{
        for(int i = 0; i < strlen(A); i++){
            if(A[i] != B[i]){
                printf("�ٸ�");
                break;
            }
        }
        printf("����");
    }
}