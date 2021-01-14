#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

#define MAX 100000

using namespace std;

int arr[MAX];

int f, b;

void push(int input) {
    b++;
    arr[b] = input;
}

void pop() {
    if (f > b)
        cout << "-1\n";
    else {
        cout << arr[f] << "\n";
        f++;
    }
}

void size() {
    if (b - f < -1)
        cout << 0 << "\n";
    else
        cout << (b - f) + 1 << "\n";
}

void empty() {
    if (b - f > -1)
        cout << 0 << "\n";
    else
        cout << 1 << "\n";
}

void front() {
    if (b >= f)
        cout << arr[f] << "\n";
    else
        cout << -1 << "\n";
}

void back() {
    if (b >= f)
        cout << arr[b] << "\n";
    else
        cout << -1 << "\n";
}

int main() {
    int cnt;

    f = 0;
    b = -1;

    cin >> cnt;

    for (int i = 1; i <= cnt; i++) {
        string cmd;
        cin >> cmd;

        if (cmd == "push") {
            int tmp;
            cin >> tmp;
            push(tmp);
            continue;
        }
        if (cmd == "pop") {
            pop();
            continue;
        }
        if (cmd == "empty") {
            empty();
            continue;
        }
        if (cmd == "size") {
            size();
            continue;
        }
        if (cmd == "front") {
            front();
            continue;
        }
        if (cmd == "back") {
            back();
            continue;
        }

    }


    return 0;
}