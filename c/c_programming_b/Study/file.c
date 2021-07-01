#include<stdio.h>
int main(int argc, char *argv[]){
    FILE *fp;
    char ch[50];
    (*(argv + 1))[1]
    fp = fopen("output.txt", "w");
    while(1){
        gets(ch);
        if(ch == "break")break;
        fprintf(fp, "%s", ch);
    }
}