#include <iostream>
#include <string>
#include <vector>
using namespace std;


vector<int> v;

void push_front(int in) {
    v.insert(v.begin(), in);
}

void push_back(int in) {
    v.push_back(in);
}

void pop_front() {
    if (v.size() < 1) {
        cout << -1 << "\n";

        return;
    }
    cout << v[0] << "\n";
    v.erase(v.begin());
}

void pop_back() {
    if (v.size() < 1) {
        cout << -1 << "\n";
        return;
    }
    cout << v.back() << "\n";
    v.erase(v.begin() + v.size() - 1);
}

void size() {
    cout << v.size() << "\n";
}

void empty() {
    if (v.size() == 0) {
        cout << "1\n";
    }
    else {
        cout << "0\n";
    }
}

void front() {
    if (v.size() < 1) {
        cout << -1 << "\n";
        return;
    }
    cout << v[0] << "\n";
}

void back() {
    if (v.size() < 1) {
        cout << -1 << "\n";
        return;
    }
    cout << v.back() << "\n";
}

int main() {

    int cmd;

    cin >> cmd;

    for (int i = 0; i < cmd; i++) {
        string str;
        cin >> str;
        if (str == "push_front") {
            int in;
            cin >> in;
            push_front(in);
            continue;
        }
        if (str == "push_back") {
            int in;
            cin >> in;
            push_back(in);
            continue;
        }
        if (str == "pop_front") {
            pop_front();
            continue;
        }
        if (str == "pop_back") {
            pop_back();
            continue;
        }
        if (str == "size") {
            size();
            continue;
        }
        if (str == "empty") {
            empty();
            continue;
        }
        if (str == "front") {
            front();
            continue;
        }
        if (str == "back") {
            back();
            continue;
        }
    }


    return 0;
}