#include<iostream>
#include<string>
#include<cstring>
using namespace std;

class Person {
    char* name;
public:
    Person() = default;
    Person(const char *n);
    Person(const Person &person); //복사 생성자
    Person(Person&& p); //이동 생성자
    ~Person() { cout << "소멸자 실행" << endl; };;
    void show(string obj);
};
Person::Person(const char *n){
    cout << "생성자 실행" << endl;
    this -> name = new char [strlen(n) + 1];
    strcpy(this -> name, n);
}
Person::Person(const Person &person){
    cout << "복사 생성자 실행" << endl;
    this -> name = new char [strlen(person.name) + 1];
    strcpy(this -> name, person.name);
}
Person::Person(Person&& p){
    cout << "이동 생성자 실행" <<endl;
    this -> name = new char [strlen(p.name) + 1];
    strcpy(this -> name, p.name);
    p.name = nullptr;
}
void Person::show(string obj) {
    if(name)cout << obj << " name = " << name << endl; 
    else cout << obj << " name = " << endl;
}

int main() {
    cout << "-1----------" << endl;
    Person dan("daniel");
    Person ben = Person("benny");
    cout << "-2----------" << endl;
    Person mvdan = move(dan);

    cout << "-3----------" << endl;
    Person cpben = ben; //복사됨
    Person cpmvdan(mvdan); //위에서 생성된 객체롤 복사됨
    cout << "-4----------" << endl;
    dan.show("dan");
    ben.show("ben");
    mvdan.show("mvdan");
    cpben.show("cpben");
    cpmvdan.show("cpmvdan");
    return 0;
}