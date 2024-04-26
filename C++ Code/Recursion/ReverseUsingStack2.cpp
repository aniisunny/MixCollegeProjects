#include<iostream>
using namespace std;

void iterativeReverse() {
    char stack[80];
    register int top = 0;
    cin.get(stack[top]);
    while(stack[top] != '\n')
        cin.get(stack[++top]);
    for(top -= 2; top >= 0; cout.put(stack[top--]));
}

void main() {
    iterativeReverse();
}
