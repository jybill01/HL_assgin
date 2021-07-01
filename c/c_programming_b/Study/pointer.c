#include<stdio.h>
#include<stdlib.h>
#include<string.h>

/*void ex01(){
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

void ex09(){
    char sa[50], sb[50], *a, *b;
    printf("문자열 입력 : ");
    gets(sa);
    printf("문자열 입력 : ");
    gets(sb);

    a = sa;
    b = sb;

    while(*a && *b){
        if (*a != *b)break;
        a++;
        b++;
    }
    if(*a == '\0' && *b == '\0')
        printf("%s, %s, 같음.\n\n", sa, sb);
    else
        printf("%s, %s, 다름.\n\n", sa, sb);
}*/

void test(){
    char a[50];
    scanf("%s", a);
    printf("%s", a);

}

int main(){
    test();
    return 0;
}