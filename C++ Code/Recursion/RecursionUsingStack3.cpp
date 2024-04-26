#include<iostream>
using namespace std;

void nonRecursiveReverse() {
    char ch;
    cin.get(ch);
    while(ch != '\n') {
        st.push(ch);
        cin.get(ch);
    }
    while(!st.empty())
        cout.put(st.pop());
}

void main() {
    nomRecursiveReverse();
}
