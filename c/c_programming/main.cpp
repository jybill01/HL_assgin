#include<stdio.h>
#include<string.h>
int main(){
    char s1[100], s2[20][20];
    int s = 0, k = 0;
    fgets(s1,100,stdin);
    for(int i = 0; i < strlen(s1); i++){
        printf("%c\n", s1[i]);
        if(s1[i] == ' '){
            for(int j = s; j < i; j++){
                s2[k][j - s] = s1[j];
            }
            s = i + 1;
            k = k + 1;
        }
    }
    for(int i = 0; i <= k; i++){
        printf("%d, %s\n", i, s2[i]);
    }
}