#include<iostream>
#include<string>
using namespace std;

class SortedArray {
    int size; //현재 배열의 크기
    int *p; //정수 배열에 대한 포인터
    void sort(); //정수 배열을 오름차순으로 정렬
public:
    SortedArray(); //p는 nullptr로 size는 0으로 초기화
    SortedArray(SortedArray &arr); //복사 생성자
    SortedArray(int arr[], int size); //생성자. 정수 배열과 크기를 전달받아 p에 저장 후 sort() 호출
    ~SortedArray(); //소멸자
    SortedArray operator+(SortedArray &b);
    SortedArray &operator=(const SortedArray &b); //현재 배열에 b 배열을 복사
    void show(string name); //배열의 원소 출력
};
void SortedArray::sort() { //오름차순 버블 정렬
    if (p == nullptr || size == 0)
        return;
    for (int i = 0; i < size - 1; i++) {
        for (int j = i; j < size - 1; j++) {
            if (p[j] > p[j + 1]) {
                int temp = p[j];
                p[j] = p[j + 1];
                p[j + 1] = temp;
            }
        }
    }
}

SortedArray::SortedArray(){
    p = nullptr;
    size = 0;
}

SortedArray::SortedArray(SortedArray &arr){
    size = arr.size;
    p = arr.p;
}

SortedArray::SortedArray(int arr[], int size){
    this -> size = size;
    this -> p = new int[size];
    for(int i = 0; i < size; i++){
        this -> p[i] = arr[i];
    }
    sort();
}

SortedArray::~SortedArray(){
    if(p != nullptr) delete [] p;
}

SortedArray SortedArray::operator+(SortedArray &b){
    SortedArray tmp;
    tmp.size = size + b.size;
    tmp.p = new int [tmp.size];
    for(int i = 0; i < size; i++){
        tmp.p[i] = p[i];
    }
    for(int i = 0; i < b.size; i++){
        tmp.p[i + size] = b.p[i];
    }
    tmp.sort();
    return tmp;
}
SortedArray& SortedArray::operator=(const SortedArray &b){
    size = b.size;
    p = new int [size];
    for(int i = 0; i < size; i++){
        p[i] = b.p[i];
    }
    return *this;
}

void SortedArray::show(string name){
    cout << name << " = { ";
    for(auto i = 0; i < size; i++){
        cout << p[i] << " ";
    }
    cout << "}" << endl;
}


int main() {
    int n[] = {2, 20, 6};
    int m[] = {10, 7, 8, 30};
    SortedArray a(n, 3), b(m, 4), c;
    c = a + b;
    a.show("a");
    b.show("b");
    c.show("c");
}