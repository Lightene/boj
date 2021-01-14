#include<iostream>
#include<vector>
#include<algorithm>


using namespace std;


int main(){

    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);

    int N, M;

    vector<int> N_list;
    vector<int> M_list;

    cin >> N;

    for(int i = 0; i < N; i++){
        int temp;
        cin >> temp;
        N_list.push_back(temp);
    }

    sort(N_list.begin, N_list.end);

    cin >> M;

    for(int i = 0; i < M; i++){
        int temp;
        cin >> temp;
        if(binary_search(N_list.begin, N_list.end, temp)){
            cout << "1 ";
        }else{
            cout << "0 ";
        }
    }
    
    return 0;
}