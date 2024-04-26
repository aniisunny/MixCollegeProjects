URL CODE=cpp.sh/32lgrq

// Detail of Employee
#include <iostream>
#include<stdio.h>
#include<string.h>
using namespace std;

class employee
{
    string name;
    public:
    void input();
    void output();
};

class department:public employee
{
    string dep;
    public:
    void get();
    void put();
};

class provident_fund:public employee //pension fund
{
    long pf;
    public:
    void in();
    void out();
};

void employee::input()
{
    cout<<"Enter the name of employee:-";
    cin>>name;
}

void department::get()
{
    input();
    cout<<"Enter the department of employee:-";
    cin>>dep;
}

void provident_fund::in()
{
    cout<<"Enter the provident fund of employee:-";
    cin>>pf;
}

void employee::output()
{
    cout<<"\nNAME:-"<<name;
}

void department::put()
{
    output();
    cout<<"\nDEPARTMENT:-"<<dep;
}

void provident_fund::out()
{
    cout<<"\nProvident Fund:-"<<pf;
}

int main()
{
    department d;
    provident_fund p;
    d.get();
    p.in();
    d.put();
    p.out();
    return 0;
}