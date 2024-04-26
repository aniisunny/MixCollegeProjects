#include <iostream>
using namespace std;

int main ()
{
    int a = -5;

    if (a < 5 )
        cout << "Reading\n";
    if ( a != -5 )
        cout << "Watching\n";
    if ( a >= -10 )
        cout << "Playing\n";
    else
        cout << "Dancing\n";
    return 0;
}
