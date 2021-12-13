#include<iostream>
#include<string>
using namespace std;

class Person {
    string name;
public:
    Person() = default;
    Person(string n) : name {n} { cout << "생성자 실행" << endl; };
    Person(const Person &person); //복사 생성자
    Person(Person&& p); //이동 생성자
    ~Person() { cout << "소멸자 실행" << endl; };
    void show(string obj) { cout << obj << " name = "<< name << endl; }
};
Person::Person(const Person &person) : name{person.name}{
    cout << "복사 생성자 실행" << endl;
}
Person::Person(Person&& p){
    cout << "이동 생성자 실행" <<endl;
    this -> name = p.name;
    p.name.clear();
}

//복사 생성자와 이동 생성자를 구현하세요. //
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