#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;


int main() {

    int cnt = 0;

    cin >> cnt;

    vector<int> arr;

    for (int i = 0; cnt > i; i++) {
        int in;
        cin >> in;
        arr.push_back(in);
    }

    sort(arr.begin(), arr.end());
       
    arr.erase(unique(arr.begin(), arr.end()), arr.end());

    for (int i = 0; arr.size() > i; i++) {
        cout << arr[i] << " ";
    }
    return 0;
}