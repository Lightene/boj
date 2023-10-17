#include <iostream>

#include <algorithm>

#include <vector>

using namespace std;

int main() {

    int N, M, temp;

    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);

    cin >> N;

    vector < int > arrTemp;

    for (int i = 0; i < N; i++) {
        cin >> temp;
        arrTemp.push_back(temp);
    }

    sort(arrTemp.begin(), arrTemp.end());

    for(int i : arrTemp){
        cout << i << "\n";
    }

    return 0;
}