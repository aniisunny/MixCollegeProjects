#include<iostream>
#include<stdio.h>
using namespace std;

struct node1
{
    int data;
    struct node1 *next;
};

struct node2
{
    int data;
    struct node2 *next;
};

class Concatenation
{
public :
    int info;
    node1 *head1,*tail1;
    node2 *head2,*tail2;

    Concatenation()
    {
        head1=tail1=NULL;
        head2=tail2=NULL;
    }
    void insert1()
    {
        cout<<"Enter the data:-";
        cin>>info;
        node1 *ptr=new node1;
        ptr->data=info;
        ptr->next=NULL;
        if(head1==NULL)
            head1=tail1=ptr;
        else
        {
            tail1->next=ptr;
            tail1=ptr;
        }
    }
    void insert2()
    {
        cout<<"Enter the data:-";
        cin>>info;
        node2 *ptr=new node2;
        ptr->data=info;
        ptr->next=NULL;
        if(head2==NULL)
            head2=tail2=ptr;
        else
        {
            tail2->next=ptr;
            tail2=ptr;
        }
    }
    void concat()
    {
        tail1->next=head2;
        node1 *ptr=head1;
        cout<<"\nConcatenation of two linked list:-";
        while(ptr!=NULL)
        {
            cout<<ptr->data<<" ";
            ptr=ptr->next;
        }
    }
};

int main()
{
    Concatenation con;
    con.insert1();
    con.insert1();
    con.insert1();
    con.insert2();
    con.insert2();
    con.concat();
}
