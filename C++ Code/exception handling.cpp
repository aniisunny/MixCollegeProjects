#include<iostream>
using namespace std;
class divide
{
    int a,b,c;
public:
    void input()
    {
        cout<<"enter the values:";
        cin>>a>>b;
    }
    void div()
    {
        try
        {
            if(b==0)
            {
                throw(b);
            }
            else
            {
                c=a/b;
                show();
            }
        }
        catch(int p)
        {
            cout<<"exception occur "<<p<<" error"<<endl;
        }
    }
    void show()
    {
        cout<<"division is:"<<c;
    }
};
int main()
{
    divide ob;
    ob.input();
    ob.div();
    ob.input();
    ob.show();
    return 0;
}
