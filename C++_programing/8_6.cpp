#include<iostream>
#include<string>
using namespace std;

class Book {
    string title;
    int price;
public:
    Book(string title = "", int price = 0);
    Book& operator += (int won);
    Book& operator -= (int won);
    bool operator == (int a);
    bool operator == (string a);
    bool operator == (const Book& a);
    void show(string obj);
    string getTitle(); //title 반환
};

Book& Book::operator += (int won){
    this -> price += won;
    return *this;
}

Book& Book::operator -= (int won){
    this -> price -= won;
    return *this;
}

bool Book::operator == (int a){
    if(this -> price == a)return true;
    else false;
}

bool Book::operator == (string a){
    if(this -> title == a)return true;
    else false;
}

bool Book::operator == (const Book& a){
    if(this -> title == a.title && this -> price == a.price)return true;
    else false;
}

int main() {
    Book a("청춘", 20000), b("미래", 30000);

    a += 500; //책 a의 가격 500원 증가
    b -= 500; //책 b의 가격 500원 감소
    a.show("a");
    b.show("b");

    Book c("명품 C++", 30000), d("고품 C++", 30000);
    if (c == 30000) cout << "명품 C++ 정가 30000원" << endl; //price 비교
    if (c == "명품 C++") cout << "명품 C++ 입니다." << endl; //책 title 비교
    if (c == d) cout << "두 책이 같은 책입니다." << endl; // title, price 모두 비교
    else cout << "두 책이 다른 책입니다." << endl;
}