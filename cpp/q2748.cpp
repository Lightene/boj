#include <iostream>
#include <stdio.h>

using namespace std;

#define MAX 90

int Fibo(int *F, int count, int N);

int main (){
    int F[MAX];
    int N = 0;
    int count = 0;

    cin >> N;

    for(int i = count; i <= N; i++){
        F[i] = i < 2 ? i : F[i-1] + F[i-2];
    }

    cout << F[N];

    return 0;
}

// &배열변수[IDX]  =>  해당 Value의 값이 들어가 있는 Address의 값을 return 함
// *변수  =>  Address의 값을 담는 변수
