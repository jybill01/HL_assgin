#include<iostream>
#include<string>
using namespace std;

class Array {
    double *ptr;
    int size;
public:
    Array(int size);
    ~Array();
    void show(string name);
    //[] 연산자 중복
    double& operator[] (int index);
    //= 연산자 중복
    Array& operator= (const Array& a);
};

Array::Array(int s) : size(s){
    ptr = new double[size];
}

Array::~Array(){
    delete []ptr;
}

double& Array::operator[] (int index){
    if(index < 0 || index >= size){
        cout << "인덱스 범위 초과 오류" << endl;
        exit(1);
    }
    return ptr[index];
}

Array& Array::operator= (const Array& a){
    if(this == &a) return *this;
    delete ptr;
    ptr = nullptr;
    size = a.size;
    ptr = new double[size];
    for(auto i = 0; i < size; i++){
        ptr[i] = a.ptr[i];
    }
    return *this;
}
void Array::show(string name){
    cout << name << " = { ";
    for(auto i = 0; i < size; i++){
        cout << ptr[i] << " ";
    }
    cout << "}" << endl;
}

int main() {
    int size;
    cout << "array size ? ";
    cin >> size;
    Array arr(size), brr(size);

    for (int i = 0; i < size; i++) {
        cout << i << ") input>> ";
        cin >> arr[i];
    }
    arr.show("arr");

    brr = arr;
    brr.show("brr");

    brr[2] = 34.5;
    brr[4] = 56.3;
    arr.show("arr");
    brr.show("brr");
    
    return 0;
}