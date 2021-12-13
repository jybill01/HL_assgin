#include<iostream>
#include<string>

using namespace std;

int main(){
    int num;
    string a;
    cout << "10진수 입력  : ";
    cin >> num;
    cout << "\n여러 진법으로 출력 하기 \n" << "oct(8), hex(16), digit(10)\n";
    cout << "해당 진법 입력 : ";
    cin >> a;
    if(a == "oct" || a == "8")cout << "8진법 : " << oct << num;
    else if(a == "hex" || a == "16")cout << "16진법 : " << hex << num;
    else if(a == "digit" || a == "10")cout << "10진법 : " << num;
    cout << endl;
}