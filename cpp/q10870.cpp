#include <iostream>

// #define MAX 20

using namespace std;

int fibo(int N){
    if(N == 0) return N;
    if(N == 1) return N;
    return fibo(N - 1) + fibo(N - 2);
}

int main () {
    // int q[MAX];
    int N = 0;

    cin >> N;

    cout << fibo(N);

    return 0;
}