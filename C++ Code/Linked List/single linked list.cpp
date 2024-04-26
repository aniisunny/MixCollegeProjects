#include<iostream>
#include<stdlib.h>
using namespace std;

struct node
{
    int UID;
    float CGPA;
    struct node *next;
};

class SingleLinkedList
{
    int Uid;
    float Cgpa;
    node *head,*tail;
public:
    SingleLinkedList()
    {
        head = tail = NULL;
    }
    void insertatBeg()
    {
        node *ptr= new node;
        cout<<"\nEnter the UID:-";
        cin>>Uid;
        cout<<"Enter the CGPA:-";
        cin>>Cgpa;
        ptr->UID= Uid;
        ptr->CGPA= Cgpa;
        ptr->next= head;
        if( tail==NULL )
            tail= ptr;
        head = ptr;
       /* ptr->next= NULL;
        if( head==NULL )
        {
            head= temp= tail= ptr;
        }
        head= ptr;
        ptr->next= temp;
        temp= ptr;*/
        cout<<"\nRecord Inserted"<<endl<<endl;
    }
    void insertatLast()
    {
        node *ptr= new node;
        cout<<"\nEnter the UID:-";
        cin>>Uid;
        cout<<"Enter the CGPA:-";
        cin>>Cgpa;
        ptr->UID= Uid;
        ptr->CGPA= Cgpa;
        ptr->next= NULL;
        tail->next= ptr;
        tail= ptr;
        cout<<"\nRecord Inserted"<<endl<<endl;
    }
    void insertatRandom()
    {
        node *ptr= new node;
        node *temp1= head;
        node *temp2= head;
        int pos= 0,i;
        cout<<"\nEnter the UID:-";
        cin>>Uid;
        cout<<"Enter the CGPA:-";
        cin>>Cgpa;
        ptr->UID= Uid;
        ptr->CGPA= Cgpa;
        ptr->next= NULL;
        cout<<"\nEnter the position of new node:-";
        cin>>pos;
        for( i=1; i<pos; i++ )
        {
            temp1= temp1->next;
        }
        ptr->next= temp1;
        for( i=1; i<pos-1; i++ )
        {
            temp2= temp2->next;
        }
        temp2->next= ptr;
        cout<<"\nRecord Inserted"<<endl<<endl;
    }
    void deleteatBeg()
    {
        node *ptr= head;
        head= ptr->next;
        delete ptr;
        cout<<"\nRecord Deleted"<<endl<<endl;
    }
    void deleteatLast()
    {
      node *ptr= head;
      while( ptr->next!=tail )
      {
          ptr= ptr->next;
      }
      tail= ptr;
      ptr= tail->next;
      tail->next= NULL;
      delete ptr;
      cout<<"\nRecord Deleted"<<endl<<endl;
    }
    void deleteatRandom()
    {
        int pos,i;
        cout<<"\nEnter the position of node:-";
        cin>>pos;
        node *ptr= head;
        node *temp= NULL;
        for( i=1; i<pos-1; i++ )
            ptr= ptr->next;
        for( i=pos-1; i<pos; i++ )
            temp= ptr->next;
        ptr->next= temp->next;
        delete temp;
        cout<<"\nRecord deleted"<<endl<<endl;
    }
    void searchNode()
    {
        int uid,counter= 0,pos= 0;
        float cgpa;
        cout<<"\nEnter the search UID:-";
        cin>>uid;
        cout<<"Enter the search CGPA:-";
        cin>>cgpa;
        node *ptr= head;
        while( ptr!=NULL )
        {
            pos++;
            if( ptr->UID==uid && ptr->CGPA==cgpa )
            {
                cout<<"\nSearch UID and CGPA is found in a linked list at node "<<pos;
                counter++;
            }
            ptr= ptr->next;
        }
        if(counter==0)
            cout<<"\nSearch UID and CGPA is not found in a linked list"<<endl<<endl;
        else
            cout<<endl<<endl;
    }
    void insertafterSearch()
    {
        int uid,counter= 0;
        float cgpa;
        cout<<"\nEnter the search UID:-";
        cin>>uid;
        cout<<"Enter the search CGPA:-";
        cin>>cgpa;
        node *ptr= head;
        while( ptr!=NULL )
        {
            if( ptr->UID==uid && ptr->CGPA==cgpa )
            {
                node *ptr1= new node;
                cout<<"\nEnter the UID:-";
                cin>>Uid;
                cout<<"Enter the CGPA:-";
                cin>>Cgpa;
                ptr1->UID= Uid;
                ptr1->CGPA= Cgpa;
                ptr1->next= NULL;
                ptr1->next= ptr->next;
                ptr->next= ptr1;
                counter++;
                cout<<"\nRecord Inserted";
            }
            ptr= ptr->next;
        }
        if( counter==0 )
            cout<<"\nSearch UID and CGPA is not found in a linked list so Insertion is not possible"<<endl<<endl;
        else
            cout<<endl<<endl;
    }
    void deleteafterSearch()
    {
        int uid,counter= 0;
        float cgpa;
        cout<<"\nEnter the search UID:-";
        cin>>uid;
        cout<<"Enter the search CGPA:-";
        cin>>cgpa;
        node *ptr= head;
        while( ptr!=NULL )
        {
            if( ptr->UID==uid && ptr->CGPA==cgpa )
            {
                node *temp1= ptr;
                node *temp2= ptr->next;
                temp1->next= temp2->next;
                delete temp2;
                counter++;
                cout<<"\nRecord Deleted";
            }
            ptr= ptr->next;
        }
        if( counter==0 )
            cout<<"\nSearch UID and CGPA is not found in a linked list so Deletion is not possible"<<endl<<endl;
        else
            cout<<endl<<endl;
    }
    void countNode()
    {
        int count= 0;
        node *ptr= head;
        while( ptr!=NULL )
        {
            count++;
            ptr= ptr->next;
        }
        cout<<"\nTotal nodes in a linked list:-"<<count<<endl<<endl;
    }
    void display()
    {
    	node *ptr= head;
        if( ptr==NULL )
            cout<<"\nEmpty List";
        else
        {
            cout<<"\nElements of Linked List:-";
            while( ptr!=NULL )
            {
                cout<<"\nUID:-"<<ptr->UID;
                cout<<"\nCGPA:-"<<ptr->CGPA;
                ptr= ptr->next;
            }
        }
        cout<<endl<<endl;
    }
};

int main()
{
    int ch= 0;
    SingleLinkedList s;
    while( ch!=12 )
    {
       cout<<"\n***************Operation on Single linked list***************\n";
       cout<<"\n1.  Insertion at beginning\n2.  Insertion at last node\n3.  Insertion at random position";
       cout<<"\n4.  Deletion at beginning\n5.  Deletion at last node\n6.  Deletion at random position\n7.  Search Node";
       cout<<"\n8.  Insertion after Searching\n9.  Deletion after Searching\n10. Count Node\n11. Display List\n12. Exit";
       cout<<"\n\nEnter the choice:-";
       cin>>ch;
       switch( ch )
       {
           case 1:
               s.insertatBeg();
               break;
           case 2:
               s.insertatLast();
               break;
           case 3:
               s.insertatRandom();
               break;
           case 4:
               s.deleteatBeg();
               break;
           case 5:
               s.deleteatLast();
               break;
           case 6:
               s.deleteatRandom();
               break;
           case 7:
               s.searchNode();
               break;
           case 8:
               s.insertafterSearch();
               break;
           case 9:
               s.deleteafterSearch();
               break;
           case 10:
               s.countNode();
               break;
           case 11:
               s.display();
               break;
           case 12:
               exit(0);
               break;
           default:cout<<"\nPlease enter valid choice"<<endl<<endl<<endl;
       }
    }
    return 0;
}
