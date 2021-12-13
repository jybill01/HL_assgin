#include<iostream>
using namespace std;

class BaseArray {
    int capacity; //동적 할당된 메모리의 총 용량
    int *mem; //동적 할당된 메모리
protected:
    BaseArray(int capacity = 100) {
        this->capacity = capacity;
        mem = new int[capacity];
    }
    ~BaseArray() { delete[] mem; }
    void put(int index, int val) { mem[index] = val; }
    int get(int index) { return mem[index]; }
    int getCapacity() { return capacity; }
};
class MyQueue : public BaseArray {
    int head; //데이터를 넣을 위치는 head
    int tail; //데이터 꺼내는 위치는 tail+1
    int size; //현재 큐 안에 있는 데이터의 개수
public:
    MyQueue(int capacity); //capacity만큼 BaseArray 생성, head, tail, size 초기화
    void enqueue(int n); //큐의 head 위치에 데이터 넣기
    int dequeue(); //큐의 tail+1 위치에서 데이터를 꺼내서 리턴
    int capacity(); //큐의 총 용량 리턴
    int length(); //큐에 있는 데이터의 개수 리턴
};
int main() {
    int capa;
    cout << "큐의 전체 용량은? ";
    cin >> capa;
    MyQueue mq(capa);
    int cnt, n;
    cout << "큐에 저장할 정수 개수는? ";
    cin >> cnt;
    for (int i = 0; i < cnt; i++) {
        cout << i << ") ";
        cin >> n;
        mq.enqueue(n); //큐에 데이터 넣기
    }
    cout << "큐의 용량 = " << mq.capacity() << endl;
    cout << "큐의 현재 크기 = " << mq.length() << endl;
    cout << "큐의 원소를 순서대로 꺼내 출력 하면...";
    while (mq.length() != 0) {
        cout << mq.dequeue() << ' '; //큐에서 꺼내 출력
    }
    cout << endl;
    cout << "큐의 용량 = " << mq.capacity() << endl;
    cout << "큐의 현재 크기 = " << mq.length() << endl;
}