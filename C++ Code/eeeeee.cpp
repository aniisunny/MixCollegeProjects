#include<iostream>
using namespace std;
class A
{
public:
    int l,b;
    void setdata(int l,int b)
    {
        this->l=l;
        this->b=b;
    }
    void area()
    {
        cout<<l*b<<endl;
    }
};
int main()
{
    A a;
    a.setdata(5,6);
    a.area();
    return 0;
}
