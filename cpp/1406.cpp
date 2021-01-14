#include<iostream>
#include<string.h>
#include <algorithm>

#define CMD_MAX 500000
#define STR_MAX 100000

using namespace std;

int main() {

    char text[STR_MAX] = {0};
    int cnt = 0;
    int cursor = 0;

    cin >> text;
    cin >> cnt;

    cursor = strlen(text);
    
    for (int i = 0; i < cnt; i++) {
        char cmd;
        cin >> cmd;

        switch (cmd)
        {
        case 'L':
            if (cursor > 0) {
                cursor--;
            }
            break;
        case 'D':
            if (cursor < strlen(text))
                cursor++;
            break;
        case 'B':
            if (cursor > 0) {
                memmove(text + cursor - 1, text + cursor, strlen(text) - cursor + 1);
                cursor--;
            }
            break;
        case 'P':
            char add;
            cin >> add;
            memmove(text + cursor+1,text + cursor, strlen(text) - cursor + 1);
            text[cursor] = add;
            cursor++;
            break;
        }
    }

    cout << text;


    return 0;
}