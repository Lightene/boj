#include<iostream>
#include<stack>


using namespace std;


string bracketIf(string bracket) {
    stack<char> stack;

    for (int i = 0; bracket.length() > i; i++) {
        if (bracket[i] == '(') stack.push(bracket[i]);
        else if (bracket[i] == ')' && !stack.empty()) stack.pop();
        else return "NO";
    }
    if (stack.empty()) {
        return "YES";
    }
    else {
        return "NO";
    }
}

int main() {

    int count;
    cin >> count;

    string* arr = new string [count];

    for (int i = 0; i < count; i++) {
        string bracket;
        cin >> bracket;

        cout << bracketIf(bracket) <<"\n";
    }

    return 0;
}