#include <iostream>
#include <stack>
#include <vector>

using namespace std;

int main() {

	stack<int> stack;
	vector<int> v;
	vector<string> r;

	int count, len = 0;

	cin >> count;

	for (int i = 0; i < count; i++) {
		int s = 0;
		cin >> s;
		v.push_back(s);
	}
	
	for (int i = 1; i <= count; i++)
	{
		stack.push(i);
		r.push_back("+\n");

		while (!stack.empty() && stack.top() == v[len]) {
			len++;
			stack.pop();
			r.push_back("-\n");
		}
	}

	if (!stack.empty()) cout << "NO\n";
	else for (auto re : r) cout << re;

	return 0;
}

