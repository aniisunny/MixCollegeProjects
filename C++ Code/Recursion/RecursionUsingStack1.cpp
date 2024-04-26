#include<iostream>
using namespace std;

void simpleIterativeReverse() {
    char stack[80];
    register int top = 0;
    cin.getline(stack, 80);
    for(top = strlen(stack) - 1; top >= 0; cout.put(stack[top--]));
}

int main() {
    simpleIterativeReverse();
    return 0;
}
