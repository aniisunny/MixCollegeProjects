#include<iostream>
#include<stdlib.h>
using namespace std;

class Stack
{
    int stack[50];
    int top;
    public:
    Stack()
    {
        top=-1;
    }
void push()
{
    int push;
    cout<<"\nEnter the push elements in stack:-";
    cin>>push;
    if(top==49)
        cout<<"\nOverflow stack"<<endl<<endl<<endl;
    else
    {
        ++top;
        stack[top]=push;
        cout<<push<<" pushed"<<endl<<endl<<endl;
    }
}

void pop()
{
    if(top==-1)
        cout<<"\nUnderflow stack"<<endl<<endl<<endl;
    else
    {
        cout<<stack[top]<<" popped"<<endl<<endl<<endl;
        top--;
    }
}

void search()
{
    int i,s,counter=0;;
    cout<<"\nEnter the search element:-";
    cin>>s;
    for(i=0;i<=top;i++)
    {
        if(stack[i]==s)
        {
            cout<<s<<" is found at "<<i+1<<" position";
            counter++;
        }
    }
    if(counter==0)
        cout<<"\nSearched elements is not found"<<endl<<endl<<endl;
    else
        cout<<endl<<endl<<endl;
}

void display()
{
    if(top==-1)
        cout<<"\nEmpty Stack";
    else
    {
        int i;
        cout<<"\nStack Elements:-";
        for(i=0;i<=top;i++)
            cout<<stack[i]<<" ";
    }
    cout<<endl<<endl<<endl;
}
};

int main()
{
    int ch=0;
    Stack st;
    while(ch!=5)
    {
       cout<<"**********Operation on Stack**********";
       cout<<"\n1.Push\n2.Pop\n3.Search\n4.Display\n5.Exit";
       cout<<"\n\nEnter the choice:-";
       cin>>ch;
       switch(ch)
       {
           case 1:
               st.push();
               break;
           case 2:
               st.pop();
               break;
           case 3:
               st.search();
               break;
           case 4:
               st.display();
               break;
           case 5:
               exit(0);
               break;
           default:cout<<"\nPlease enter valid choice"<<endl<<endl<<endl;
       }
    }
    return 0;
}
