#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;


int lowerBinarySearch(vector<int> arr, int item, int size) {
    
    int first = 0, end = size;

    while (first < end) {
        int pivot = (first + end) / 2;
        if (arr[pivot] >= item) end = pivot;
        else first = pivot + 1;
    }

    return end;
}

int upperBinarySearch(vector<int> arr, int item, int size) {
    int first = 0, end = size;

    while (first < end) {
        int pivot = (first + end) / 2;
        if (arr[pivot] > item) end = pivot;
        else first = pivot + 1;
    }

    return end;
}


int main() {

    int cnt = 0;
    
    cin >> cnt;

    vector<int> vecPn;  //  양수
    vector<int> vecN;   //  음수

    for (int i = 0; i < cnt; i++) {
        int input;
        cin >> input;
        if (input >= 0) vecPn.push_back(input);
        else vecN.push_back(input);
    }

    sort(vecPn.begin(), vecPn.end());
    sort(vecN.begin(), vecN.end());

    for (int i = 0; i < cnt; i++) {
        int input, pr = 0;

        cin >> input;

        if (input >= 0) {
            int lower = lowerBinarySearch(vecPn, input, vecPn.size());
            int upper = upperBinarySearch(vecPn, input, vecPn.size());

            if (upper == cnt - 1 && vecPn[cnt - 1] == input)
                upper++;

            pr = upper - lower;
        }
        else {
            int lower = lowerBinarySearch(vecN, input, vecN.size());
            int upper = upperBinarySearch(vecN, input, vecN.size());

            if (upper == cnt - 1 && vecN[cnt - 1] == input)
                upper++;

            pr = upper - lower;
        };

        cout << pr << " ";
    }

    return 0;
}




// #include<iostream>
// #include<vector>
// #include<algorithm>

// using namespace std;


// int main () {

//     int cnt = 0;

//     cin >> cnt;

//     vector<int> vec;

//     for(int i = 0; i < cnt; i++){
//         int input;
//         cin >> input;
//         vec.push_back(input);
//     }

//     sort(vec.begin(), vec.end());

//     cin >> cnt;
    
//     for(int i = 0; i < cnt; i++){
//         int input, elements = 0;
//         cin >> input;
        
//         for(int j = 0; j < vec.size(); j++){
//             if(vec[j] < input) continue;
//             else if(vec[j] > input) break;
//             else{
//                 elements += 1;
//             }
//         }

//         cout << elements << " ";
//     }

//     return 0;
// }