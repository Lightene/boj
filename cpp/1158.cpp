#include<iostream>

#include<algorithm>
#include<queue>
#include<vector>

using namespace std;

// push , pop , front, back, empty, size

int main(){

    int N, K;
    queue<int> q;

    cin >> N >> K;

    for(int i = 1; i <= N; i++)
        q.push(i);

    cout << "<";

    for(int i=1; i <= N-1; i++){
        for(int j=1; j <= K-1; j++){
            q.push(q.front());
            q.pop();
        }
        cout<<q.front()<<", ";
        q.pop();
    }

    cout << q.front() << ">";

    return 0;
}