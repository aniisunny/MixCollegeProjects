#include<iostream>
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
using namespace std;

struct node
{
    char NAME[30];
    struct node *next;
};

class Linear
{
    char Name[30];
    struct node *head,*tail;
public:
    Linear()
    {
        head=NULL;
        tail=NULL;
    }
    void insert()
    {
        cout<<"\nEnter the Name:-";
        gets(Name);
        node *ptr=new node;
        strcpy(ptr->NAME,Name);
        ptr->next=NULL;
        if(head==NULL)
        {
            head=tail=ptr;
        }
        else
        {
            tail->next=ptr;
            tail=ptr;
        }
        cout<<"\nRecord Inserted"<<endl<<endl<<endl;
    }
    void delet()
    {
        if(head==tail)
        {
            head=tail=NULL;
            cout<<"\nUnderflow"<<endl<<endl<<endl;
        }
        else
        {
            node *ptr=tail;   
            tail=ptr->next;   
            delete ptr;
            cout<<"\nRecord deleted"<<endl<<endl<<endl;
        }
    }
    void search()
    {
        char name[30];
        int counter=0,pos=0;
        cout<<"\nEnter the search Name:-";
        gets(name);
        node *ptr=head;
        while(ptr!=NULL)
        {
            pos++;
            if(strcmpi(ptr->NAME,name)==0)
            {
                cout<<"\nSearched Name is found in a linked list at node "<<pos;
                counter++;
            }
            ptr=ptr->next;
        }
        if(counter==0)
            cout<<"\nSearched Name is not found in a linked list"<<endl<<endl<<endl;
        else
            cout<<endl<<endl<<endl;
    }
    void display()
    {
        node *ptr=head;
        if(ptr==NULL)
            cout<<"\nEmpty List";
        else
        {
            cout<<"\nElements of linked list:-";
            while(ptr!=NULL)
            {
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
    Linear l;
    while(ch!=5)
    {
       cout<<"**********Operation on Linear linked list**********";
       cout<<"\n1.Insert\n2.Delete\n3.Search\n4.Display\n5.Exit";
       cout<<"\n\nEnter the choice:-";
       cin>>ch;
       switch(ch)
       {
           case 1:
               l.insert();
               break;
           case 2:
               l.delet();
               break;
           case 3:
               l.search();
               break;
           case 4:
               l.display();
               break;
           case 5:
               exit(0);
               break;
           default:cout<<"\nPlease enter valid choice"<<endl<<endl<<endl;
       }
    }
    return 0;
}
