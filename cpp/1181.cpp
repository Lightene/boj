
#include <iostream>
#include <string>
#include <algorithm>
#include <cstring>

using namespace std;

struct InputString{
    int length;
    char word[51];
};


bool compare(InputString &str1, InputString &str2){
    if(str1.length == str2.length){
        for(int i = 0; i < str1.length; i++){
            if(str1.word[i] == str2.word[i]) continue;
            else if(str1.word[i] < str2.word[i]) return true;
            else return false;
        }
    }
    return str1.length < str2.length;
}


int main(){

    int cnt;

    cin >> cnt;
    
    InputString* str = new InputString[cnt];
    
    for(int i = 0; i < cnt; i++)
    {
        cin >> str[i].word;
        str[i].length = strlen(str[i].word);
    }

    sort(str,str+cnt,compare);

    for(int i=0; i < cnt; i++){
        if(i!=0){
            if(!strcmp(str[i].word, str[i-1].word)){
                continue;
            }
        }
        cout << str[i].length << "\n";
    }


    delete [] str;

    return 0;
}