#include <iostream>
#include <list>

using namespace std;

int Disassemble(int N) {
    int temp = 0, NR = 0;
    if (N >= 100000) {
        temp = N / 100000;
        NR += temp;
        N -= temp * 100000;
    }
    if (N >= 10000) {
        temp = N / 10000;
        NR += temp;
        N -= temp * 10000;
    }
    if (N >= 1000) {
        temp = N / 1000;
        NR += temp;
        N -= temp * 1000;
    }
    if (N >= 100) {
        temp = N / 100;
        NR += temp;
        N -= temp * 100;
    }
    if (N >= 10) {
        temp = N / 10;
        NR += temp;
        N -= temp * 10;
    }
    NR += N;
    return NR;
}

int main() {
    int N = 0;
    list<int> lst;

    cin >> N;

    if (N > 9) {
        for (int i = 1; i <= 54; i++) {
            int temp = N - i;
            if (N == Disassemble(temp)+temp){
                lst.push_front(temp);
            }
        }
        lst.sort();
        if(lst.empty()) cout<< 0;
        else cout << lst.front();
    } else cout << N;

    return 0;
}