#include<iostream>
using namespace std;
void insert(int);
void traverse();
void desire();
struct node
{
    int data;
    node *next;
};
node *head=NULL,*tail;
int main()
{
    int n,choice;
    while(1){
    cout<<"\nChoose Options..\n1.Insertion \n2.Traverse\n3.Desire Result\n";
    cin>>choice;
    switch(choice)
    {
        case 1:
            cout<<"Enter Data for nodes:";
            cin>>n;
            insert(n);
            break;
        case 2:
            traverse();
            break;
        case 3:
            desire();
            break;
    }
    }
}
void insert(int n)
{
    node *temp = new node;
    temp->data=n;
    temp->next=NULL;
    if(head==NULL){
        head=temp;
        tail=temp;
    }
    else
    {
        tail->next=temp;
        tail=temp;
    }
    cout<"Created";
}
void traverse()
{
    node *temp;
    temp=head;
    if(head==NULL)
        cout<<"\nTheir is no Element";
    else
    {
        cout<<"Head<--";
        while(temp!=NULL)
        {
            cout<<temp->data<<"<--";
            temp=temp->next;
        }
    }
}
void desire()
{
     node *temp;
     int even=0;
     int odd=0;
    temp=head;
    if(head==NULL)
        cout<<"No Element";
    else
    {
        while(temp!=NULL)
        {
            if(temp->data%2==0)
            {
                even+=temp->data;
            }
            else
            {
                odd+=temp->data;
            }
            temp=temp->next;
        }
    }
    cout<<"Even Sum is:"<<even<<endl;
    insert(even);
    cout<<"Odd Sum is "<<odd;
    insert(odd);
}
