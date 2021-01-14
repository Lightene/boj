#include <iostream>
#include <vector> 

#define MAX 6

using namespace std;
 
void dfs(int _n, vector<int>& _num_vec, vector<int>& _one_answer, int _now_idx) {
    int answer_size = _one_answer.size();

    if (answer_size > MAX) return;
 
    if (answer_size == MAX) {
        for (int ans_idx = 0; ans_idx < MAX; ans_idx++)
            cout << _num_vec[_one_answer[ans_idx]] << " ";
        cout << "\n";
        return; 
    }
 
    for (int n_idx = _now_idx + 1; n_idx < _n; n_idx++) {
        if (answer_size + (_n - n_idx) < MAX) return;
 
        _one_answer.push_back(n_idx);
        dfs(_n, _num_vec, _one_answer, n_idx);
        _one_answer.pop_back();
    }
}
 
int main() {
    ios::sync_with_stdio(false);
    while (1) {
        int n;
        cin >> n; 
        if (n == 0) break;
        
        vector<int> num_vec(n, 0);
        vector<int> one_answer;
        for (int n_idx = 0; n_idx < n; n_idx++)
            cin >> num_vec.at(n_idx);
 
        for (int n_idx = 0; n_idx < n; n_idx++) {
            one_answer.push_back(n_idx);
            dfs(n, num_vec, one_answer, n_idx);
            one_answer.pop_back();
        }
    
        cout << "\n";
    }
    return 0; 
}