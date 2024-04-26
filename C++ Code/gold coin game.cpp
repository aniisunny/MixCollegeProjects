#include<iostream>
using namespace std;

class MAGICHF
{
	int n,x,s,a,b;
public:
	void input() {
		cout<<"\nEnter the number of boxes:-";
		cin>>n;
		cout<<"Enter the box place the gold coin:-";
		cin>>x;
		cout<<"Enter the number of swap:-";
		cin>>s;
	}
	void swap() {
		while( s!=0 ) {
			cout<<"\nEnter the choose first box for swap:-";
			cin>>a;
			cout<<"Enter the choose second box for swap:-";
			cin>>b;
			if( (a!=b) && x>=1 && a<=n && b<=n )
			{
				if( x==a || x==b ) {
					if( x==a )
						x=b;
				    else
				    	x=a;
				    a=a+b;
				    b=a-b;
				    a=a-b;
				    s--;
				}
			    else {
			    	a=a+b;
				    b=a-b;
				    a=a-b;
				    s--;
				}	
			}
			else {
				cout<<"wrong input test case is failed";
				break;
			}
		}
	}
	void output() {
		cout<<"\nThe position of gold coin is ";
		cout<<x<<endl;
	}
};

int main()
{
    int t;
    cout<<"Enter the number of test cases:-";
    cin>>t;
    MAGICHF m;
    while( t!=0 )
    {
        m.input();
        m.swap();
        m.output();
        t--;
    }
    return 0;
}
