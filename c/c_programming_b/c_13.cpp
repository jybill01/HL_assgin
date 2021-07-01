#include<stdio.h>
#include<time.h>
#include <cstdlib>

struct date{
    int year;
    int month;
    int day;
};
typedef struct date date;

struct fruit{
    char name[15];
    int price;
    date expire;
    char thorw;
};
typedef struct fruit fruit;

int main(){
    printf("이름 : 신준용, 학번 : 20205195 \n");
    fruit store[5] = {
            "apple", 500, 2021, 9, 1, 'n',
            "banana", 500, 2020, 7, 3, 'n',
            "orange", 500, 2020, 8, 1, 'n',
            "melon", 500, 2021, 11, 11, 'n',
            "mango", 500, 2021, 12, 25, 'n'
    };

    int size = sizeof(store) / sizeof(store[0]);
    fruit *p;
    p = store;

    time_t now = time(NULL);
    struct tm *today = localtime(&now);

    char exp[10] = {'\0',};
    char day[10] = {'\0',};

    for(int i = 0; i < size; i++){
        sprintf(exp, "%04d%02d%02d", (p + i) -> expire.year, (p + i) -> expire.month, (p + i) -> expire.day);
        sprintf(day, "%04d%02d%02d",  today -> tm_year + 1900, today -> tm_mon + 1, today -> tm_mday);

        if(atoi(exp) <= atoi(day)){
            (p + i) -> thorw = 'y';
        }
    }

    /*for(int i = 0; i < size; i++){
        printf("%d) name = %s, price = %d, year = %d, month = %d, day = %d, thorw = %c \n",
               i, (p + i) -> name, (p + i) -> price,  (p + i) -> expire.year,
               (p + i) -> expire.month, (p + i) -> expire.day, (p + i) -> thorw);
    }*/

    printf("\n 오늘의 날짜 : %d년 %d월 %d일 입니다. \n\n",
           today -> tm_year + 1900, today -> tm_mon + 1, today -> tm_mday);

    int sum = 0;
    for(int i = 0; i < size; i++){
        if((p + i) -> thorw == 'y'){
            sum += (p + i) -> price;
        }
    }

    printf("폐기 되는 항목들의 총액은 %d입니다.", sum);

}