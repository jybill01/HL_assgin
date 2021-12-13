#include<iostream>
using namespace std;

class Power { //에너지를 표현하는 파워 클래스
    int kick; //발로 차는 힘
    int punch; //주먹으로 치는 힘
public:
    Power(int kick=0, int punch=0) {
    this->kick = kick;
    this->punch = punch;
    }
    void show(string obj);
    Power operator* (const Power &b);
    friend Power operator* (const Power &a, const Power &b);
};

Power Power::operator* (const Power &b){
    Power tmp;
    tmp.kick = this -> kick * b.kick;
    tmp.punch = this -> punch * b.punch;
    return tmp;
}

void Power::show(string obj) {
    cout << obj << ") kick=" << kick << ',' << "punch=" << punch << endl;
}

Power operator* (const Power& a, const Power& b){
    Power tmp;
    tmp.kick = a.kick * b.kick;
    tmp.punch = a.punch * b.punch;
    return tmp;
}

int main(){
    Power a(3,5), b(4,6), c;
    c = a * b;
    a.show("a");
    b.show("b");
    c.show("c");
}