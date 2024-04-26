#include<iostream>
using namespace std;

struct node
{
    int info;
    struct node *next;
}*head;

void addnode(int info)
{
    struct node *tail;
    struct node *temp=new node;
    temp->info=info;
    temp->next=NULL;
    if(head==NULL)
    {
        head=temp;
        tail=temp;
    }
    else
    {
        tail->next=temp;
        tail=temp;
    }
}

void traverse()
{
    struct node *ptr;
    ptr=head;
    cout<<"Linked List elements are:-";
    while(ptr!=NULL)
    {
        cout<<ptr->info<<" ";
        ptr=ptr->next;
    }
}

int main()
{
    addnode(15);
    addnode(5);
    addnode(20);
    traverse();
}
