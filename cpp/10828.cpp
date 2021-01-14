#include<iostream>
#include<vector>


#define MAX 10001
#define p -1;

using namespace std;

vector<int> stack;

void push(int put){
    stack.push_back(put); // stack[p++]
}

void pop(){
    if(stack.size() > 0)  // p > 0
    {
        stack.erase(stack.end()); // cout << stack[p] >> "\n"; stack[p--] = 0;
    }else{
        cout << "-1\n";
    }
}

void top(){
    if(stack.size() > 0) cout << stack[stack.size()-1] << "\n";
    else cout << "-1\n";
}

void empty(){
    if(stack.size() > 0)
        cout << "0\n";
    else{
        cout << "1\n";
    }
}

void size(){
    cout << stack.size() << "\n";
}



int main(){

    int cnt;
    
    cin >> cnt;
    
    for(int i = 1; i <= cnt; i++){
        string str;
        cin >> str;
        switch (str[0])
        {
        case 'p':
            if(str[1] == 'u'){  // push
                push(stoi(str.substr(5)));
            }else{ // pop
                pop();
            }
            break;
        case 's':
            size();
            break;
        case 'e':
            empty();
            break;
        case 't':
            top();
            break;
        }
    }

    return 0;
}