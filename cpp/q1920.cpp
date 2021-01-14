#include<iostream>
#include<string.h>

#define CMD_MAX 500000
#define STR_MAX 100000

using namespace std;

int main() {

    char text[STR_MAX];
    int cnt = 0;
    int cursor = 0;

    cin >> text;
    cin >> cnt;

    cout << text;

    
        for(int i = 0; i < cnt; i++){
            char cmd, word;
            cin >> cmd;
            cin >> word;

            switch (cmd)
            {
            case 'L':
                if(cursor > 0){
                    cursor--;
                }
                break;
            case 'D':
                if(cursor < text.length())
                break;
            case 'B':

                break;
            case 'P':

                break;
            }

        }
        cout << text;
    

    return 0;
}