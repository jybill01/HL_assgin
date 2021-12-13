#include<iostream>
#include<string>
using namespace std;

void find2replace(string& fstr, string& fhas, string& frepalce, bool& fresult){
    while(fstr.find(fhas) != -1){
        fstr.replace(fstr.find(fhas), frepalce.length(), frepalce);
        fresult = true;
    }
    return;
}

int main() {
    string str = "C++ programming";
    string has = "+";
    string replace = "p";
    bool result = false;

    cout << "변경 전 문자열 = " << str << endl;
    find2replace(str, has, replace, result);

    if (result == true)
    cout << "변경 후 문자열 = " << str << endl;
    else
    cout << str << "에서 " << has << "를 발견하지 못함." << endl;
    return 0;
}
