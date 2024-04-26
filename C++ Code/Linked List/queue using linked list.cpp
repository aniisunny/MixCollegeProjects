#include<iostream>
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
using namespace std;

struct node
{
    char UID[10];
    char NAME[30];
    struct node *next;
};

class Queue
{
    char Uid[10];
    char Name[30];
    struct node *front,*rear;
public:
    Queue()
    {
        front=NULL;
        rear=NULL;
    }
    void enqueue()
    {
        cout<<"\nEnter the UID:-";
        gets(Uid);
        cout<<"\nEnter the Name:-";
        gets(Name);
        node *ptr=new node;
        strcpy(ptr->UID,Uid);
        strcpy(ptr->NAME,Name);
        ptr->next=NULL;
        if(rear==NULL)
        {
            front=rear=ptr;
        }
        else
        {
            rear->next=ptr;
            rear=ptr;
        }
        cout<<"\nRecord Inserted"<<endl<<endl<<endl;
    }
    void dequeue()
    {
        if(front==rear)
        {
            front=rear=NULL;
            cout<<"\nUnderflow"<<endl<<endl<<endl;
        }
        else
        {
            node *ptr=front;
            front=ptr->next;
            delete ptr;
            cout<<"\nRecord deleted"<<endl<<endl<<endl;
        }
    }
    void search()
    {
        char uid[10];
        char name[30];
        int counter=0,pos=0;
        cout<<"\nEnter the search UID:-";
        gets(uid);
        cout<<"\nEnter the search Name:-";
        gets(name);
        node *ptr=front;
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
        node *ptr=front;
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
    Queue qu;
    while(ch!=5)
    {
       cout<<"**********Operation on Queue using linked list**********";
       cout<<"\n1.Insert\n2.Delete\n3.Search\n4.Display\n5.Exit";
       cout<<"\n\nEnter the choice:-";
       cin>>ch;
       switch(ch)
       {
           case 1:
               qu.enqueue();
               break;
           case 2:
               qu.dequeue();
               break;
           case 3:
               qu.search();
               break;
           case 4:
               qu.display();
               break;
           case 5:
               exit(0);
               break;
           default:cout<<"\nPlease enter valid choice"<<endl<<endl<<endl;
       }
    }
    return 0;
}
