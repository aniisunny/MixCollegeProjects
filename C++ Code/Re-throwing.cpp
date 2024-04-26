#include<iostream>
using namespace std;
class Re
{
    public:
    void show(int x,int y)
    {
        try{
        if(x==0)
            throw x;
        else
            cout<<"Subtraction is:"<<x-y;
        }
        catch(int b)
        {
            cout<<"Exception occurs on "<<b<<endl;
            throw;
        }
    }
};
int main()
{
    Re obj;
    try{
    obj.show(30,10);
    obj.show(0,10);
    }
    catch(int n)
    {
        cout<<"Re-throwing at"<<n;
    }
}
