#include<iostream>
#include<stdlib.h>
using namespace std;

class Queue
{
    int queue[50],front,rear,counter;
    public:
    Queue()
    {
        front=rear=-1;
        counter=0;
    }
void enqueue()
{
    int ins;
    cout<<"\nEnter the insert elements in queue:-";
    cin>>ins;
    if(rear==49)
        cout<<"\nOverflow Queue"<<endl<<endl<<endl;
    else
    {
        ++rear;
        queue[rear]=ins;
        cout<<ins<<" inserted"<<endl<<endl<<endl;
    }
}

void dequeue()
{
    if(front==rear)
    {
        front=rear=-1;
        cout<<"\nUnderflow Queue"<<endl<<endl<<endl;
    }
    else
    {
        front++;
        counter++;
        cout<<queue[front]<<" deleted"<<endl<<endl<<endl;
    }
}

void search()
{
    int i,s,count=0;;
    cout<<"\nEnter the search element:-";
    cin>>s;
    for(i=front+1;i<=rear;i++)
    {
        if(queue[i]==s)
        {
            cout<<s<<" is found at "<<i+1-counter<<" position";
            count++;
        }
    }
    if(count==0)
        cout<<"\nSearched elements is not found"<<endl<<endl<<endl;
    else
        cout<<endl<<endl<<endl;
}

void display()
{
    if(front==rear)
        cout<<"\nEmpty Queue";
    else
    {
        int i;
        cout<<"\nQueue Elements:-";
        for(i=front+1;i<=rear;i++)
            cout<<queue[i]<<" ";
    }
    cout<<endl<<endl<<endl;
}
};

int main()
{
    Queue q;
    int ch=0;
    while(ch!=5)
    {
       cout<<"**********Operation on Queue**********";
       cout<<"\n1.Insert\n2.Delete\n3.Search\n4.Display\n5.Exit";
       cout<<"\n\nEnter the choice:-";
       cin>>ch;
       switch(ch)
       {
           case 1:
               q.enqueue();
               break;
           case 2:
               q.dequeue();
               break;
           case 3:
               q.search();
               break;
           case 4:
               q.display();
               break;
           case 5:
               exit(0);
               break;
           default:cout<<"\nPlease enter valid choice"<<endl<<endl<<endl;
       }
    }
    return 0;
}
