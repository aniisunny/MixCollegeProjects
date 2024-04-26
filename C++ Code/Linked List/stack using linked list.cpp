#include<iostream>
#include<stdio.h>
#include<string.h>
#include<stdlib.h>
using namespace std;

struct node
{
    char UID[10];
    char NAME[30];
    struct node *next;
};

class Stack
{
    char Uid[10];
    char Name[30];
    struct node *top;
public:
    Stack()
    {
        top=NULL;
    }
    void push()
    {
        cout<<"\nEnter the UID:-";
        gets(Uid);
        cout<<"\nEnter the Name:-";
        gets(Name);
        node *ptr=new node;
        strcpy(ptr->UID,Uid);
        strcpy(ptr->NAME,Name);
        ptr->next=top;
        top=ptr;
        cout<<"\nRecord Pushed"<<endl<<endl<<endl;
    }
    void pop()
    {
        if(top==NULL)
        {
            cout<<"\nUnderflow"<<endl<<endl<<endl;
        }
        else
        {
            node *ptr=top;
            top=ptr->next;
            delete ptr;
            cout<<"\nRecord Popped"<<endl<<endl<<endl;
        }
    }
    void search()
    {
        char uid[10];
        char name[30];
        int counter=0,pos=0;;
        cout<<"\nEnter the search UID:-";
        gets(uid);
        cout<<"\nEnter the search Name:-";
        gets(name);
        node *ptr=top;
        while(ptr!=NULL)
        {
            pos++;
            if(strcmpi(ptr->UID,uid)==0 && strcmpi(ptr->NAME,name)==0)
            {
                cout<<"\nSearched UID and Name is found in a linked list at node "<<pos;
                counter++;
            }
            ptr=ptr->next;
        }
        if(counter==0)
            cout<<"\nSearched UID and Name is not found in a linked list"<<endl<<endl<<endl;
        else
            cout<<endl<<endl<<endl;
    }
    void display()
    {
        node *ptr=top;
        if(ptr==NULL)
            cout<<"\nEmpty List";
        else
        {
        	cout<<"\nElements of linked list:-";
            while(ptr!=NULL)
            {

			    cout<<"\nUID:-"<<ptr->UID;
                cout<<"\nName:-"<<ptr->NAME;
                ptr=ptr->next;
            }
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
       cout<<"**********Operation on Stack using linked list**********";
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
