#include<iostream>
#include<initializer_list>

using namespace std;

char list_exam(initializer_list<char> value, char a){
    int min = 100;
    char gv;
    for(char ch : value){
        if(ch < a){
            if(a - ch < min){
                min = a - ch;
                gv = ch;
            }
        }
        else{
            if(ch - a < min){
                min = ch - a;
                gv = ch;
            }
        }
    }

    return gv;
}

int main() {
    cout << "{ 'd', 'p', 'r', 'w', 'g', 'f' }문자 중 h와 가까운 문자는 : " ;
    cout << list_exam({ 'd', 'p', 'r', 'w', 'g', 'f' }, 'h') <<endl;
    cout << "{ 'k', 'q', 'b', 'r', 'a', 'e', 'v', 'z'}문자 중 w와 가까운 문자는 : ";
    cout << list_exam({ 'k', 'q', 'b', 'r', 'a', 'e', 'v', 'z'}, 'w') << endl;
}