#include<stdio.h>
#include<stdlib.h>

void ex01(){
    double source [] = {1.21, 3.43, 5.65, 7.87, 8.98};
    double target[sizeof(source) / sizeof(double)];
    double *p;

     p = source;
     for(int i = 0; i < sizeof(source) / sizeof(double); i++){
         target[i] = *(p + i);
     }

     printf("source = ");
     for(int i = 0; i < sizeof(source) / sizeof(double); i++){
         printf("%.2lf ", source[i]);
     }

     printf("\ntarget = ");
     for(int i = 0; i < sizeof(source) / sizeof(double); i++){
        printf("%.2lf ", target[i]);
    }
}

void ex05(){
    char str[50], ch, *p;
    int count;

    while(1){
        printf("문자열 입력 : ");
        gets(str);

        if(*str == '\0')break;

        printf("문자 입력 : ");
        ch = getchar();

        count = 0;
        p = str;
        while(*p){
            if(*p == ch)count++;
            p++;
        }
        printf("%s에서 %c는 %d개.", str, ch, count);
    }
}

void ex07(){
    char stra[50], strb[50], *p, *q;
    print("문자열 입력 : ");
    gets(stra);

    p = stra;
    q = strb;
    while(*p){
        *q = toupper(*p);
        p++;
        q++;
    }
    *q = '\0';
    printf("stra = %s, strb = %s", stra, strb);
}

int main(){
    ex07();
    return 0;
}