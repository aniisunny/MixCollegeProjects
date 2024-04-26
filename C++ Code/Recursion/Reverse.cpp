#include<iostream>
using namespace std;

void reverse() {
    char ch;
    cin.get(ch);
    while(ch != '\n'){
        reverse();
        cout.put(ch);
    }
}

int main() {
    reverse();
    return 0;
}
