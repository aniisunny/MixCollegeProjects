#include<iostream>
#include<stdio.h>
#include<string.h>
#include<fstream>

using namespace std;

class pizza
{
	int person;
	int i;
	int n;
	int s;
	string order[50];
	int order_no;
	float total_amount;
	public:
		pizza()
		{
		    order_no=0;
		    total_amount=0;
		    n=0;
		    s=0;
		    i=0;
		}

		void information()
		{
			cout<<"                  VEG PIZZAS\n\n";
			cout<<"Types of Pizza                    Price"<<endl;
			cout<<"Margherita                        59"<<endl;
			cout<<"Farm House                        129"<<endl;
			cout<<"Peppy Paneer                      159"<<endl;
			cout<<"Mexican Green Wave                189"<<endl;
			cout<<"Deluxe Vaggie                     199"<<endl;
			cout<<"5 Pepper                          249"<<endl;
			cout<<"Veg Extravaganza                  289"<<endl;
			cout<<"Cheeze n Corn                     109"<<endl;
			cout<<"Paneer Makhani                    339"<<endl;
			cout<<"Veggie Paradise                   409"<<endl;
			cout<<"Fresh Veggie                      389"<<endl<<endl;
			cout<<"                 NON VEG PIZZAS\n\n";
			cout<<"Types of Pizza                    Price"<<endl;
			cout<<"Pepper Barbecue Chicken           159"<<endl;
			cout<<"Chicken Tikka                     99"<<endl;
			cout<<"Chicken Sausage                   199"<<endl;
			cout<<"Chicken Golden Delight            289"<<endl;
			cout<<"Non Veg Supreme                   379"<<endl;
			cout<<"Chicken Dominator                 489"<<endl;
			cout<<"Peri-Peri Chicken                 449"<<endl;
			cout<<"Pepper Barbecue & onion           369"<<endl;
			cout<<"Chicken Fiesta                    679"<<endl<<endl;
		}

		void changes()
		{
            cout<<"                  VEG PIZZAS\n\n";
			cout<<"Types of Pizza                    Price"<<endl;
			cout<<"Margherita                        59"<<endl;
			cout<<"Double Cheeze Margherita          109"<<endl;
			cout<<"Farm House                        129"<<endl;
			cout<<"Peppy Paneer                      159"<<endl;
			cout<<"Mexican Green Wave                189"<<endl;
			cout<<"Deluxe Veggie                     199"<<endl;
			cout<<"5 Pepper                          249"<<endl;
			cout<<"Veg Extravaganza                  289"<<endl;
			cout<<"Paneer Makhani                    339"<<endl;
			cout<<"Veggie Paradise                   409"<<endl;
			cout<<"Fresh Veggie                      389"<<endl<<endl;
			cout<<"                 NON VEG PIZZAS\n\n";
			cout<<"Types of Pizza                    Price"<<endl;
			cout<<"Pepper Barbecue Chicken           159"<<endl;
			cout<<"Chicken Tikka                     99"<<endl;
			cout<<"Chicken Sausage                   199"<<endl;
			cout<<"Chicken Golden Delight            289"<<endl;
			cout<<"Non Veg Supreme                   379"<<endl;
			cout<<"Chicken Dominator                 579"<<endl;
			cout<<"Peri-Peri Chicken                 449"<<endl;
			cout<<"Pepper Barbecue & onion           369"<<endl;
			cout<<"Chicken Fiesta                    679"<<endl;
		}

		void input()
		{
		    cout<<"\nEnter the total number of person:-";
		    cin>>person;
		    cout<<"\nEnter the number of quantity:-";
		    cin>>n;
		    cout<<"\nEnter your order:-\n";
		    for(i=0;i<n;i++)
            {
                cin>>order[i];
            }
		}

		void generate()
		{
		    order_no+=1;
		    for(i=0;i<n;i++)
            {
                if(strcmpi(order[i],"Margherita")==0)
                    total_amount+=59;
                if(strcmpi(order[i],"Double Cheeze Margherita")==0)
                    total_amount+=109;
                if(strcmpi(order[i],"Farm House")==0)
                    total_amount+=129;
                if(strcmpi(order[i],"Peppy Paneer")==0)
                    total_amount+=159;
                if(strcmpi(order[i],"Mexican Green Wave")==0)
                    total_amount+=189;
                if(strcmpi(order[i],"Deluxe Veggie")==0)
                    total_amount+=199;
                if(strcmpi(order[i],"5 Pepper")==0)
                    total_amount+=249;
                if(strcmpi(order[i],"Veg Extravaganza")==0)
                    total_amount+=289;
                if(strcmpi(order[i],"Paneer Makhani")==0)
                    total_amount+=339;
                if(strcmpi(order[i],"Veggie Paradise")==0)
                    total_amount+=409;
                if(strcmpi(order[i],"Fresh Veggie")==0)
                    total_amount+=389;
                if(strcmpi(order[i],"Pepper Barbecue Chicken")==0)
                    total_amount+=159;
                if(strcmpi(order[i],"Chicken Tikka")==0)
                    total_amount+=99;
                if(strcmpi(order[i],"Chicken Sausage")==0)
                    total_amount+=199;
                if(strcmpi(order[i],"Chicken Golden Delight")==0)
                    total_amount+=289;
                if(strcmpi(order[i],"Non Veg Supreme")==0)
                    total_amount+=379;
                if(strcmpi(order[i],"Chicken Dominator")==0)
                    total_amount+=579;
                if(strcmpi(order[i],"Peri-Peri Chicken")==0)
                    total_amount+=449;
                if(strcmpi(order[i],"Pepper Barbecue & onion")==0)
                    total_amount[i]+=369;
                if(strcmpi(order[i],"Chicken Fiesta")==0)
                    total_amount+=679;
            }
		}

		void file()
		{
		    ofstream off("new menu.txt");
            off<<"                  VEG PIZZAS\n\n";
			off<<"Types of Pizza                    Price"<<endl;
			off<<"Margherita                        59"<<endl;
			off<<"Double Cheeze Margherita          109"<<endl;
			off<<"Farm House                        129"<<endl;
			off<<"Peppy Paneer                      159"<<endl;
			off<<"Mexican Green Wave                189"<<endl;
			off<<"Deluxe Vaggie                     199"<<endl;
			off<<"5 Pepper                          249"<<endl;
			off<<"Veg Extravaganza                  289"<<endl;
			off<<"Paneer Makhani                    339"<<endl;
			off<<"Veggie Paradise                   409"<<endl;
			off<<"Fresh Veggie                      389"<<endl<<endl;
			off<<"                 NON VEG PIZZAS\n\n";
			off<<"Types of Pizza                    Price"<<endl;
			off<<"Pepper Barbecue Chicken           159"<<endl;
			off<<"Chicken Tikka                     99"<<endl;
			off<<"Chicken Sausage                   199"<<endl;
			off<<"Chicken Golden Dellight           289"<<endl;
			off<<"Non Veg Supreme                   379"<<endl;
			off<<"Chicken Dominator                 579"<<endl;
			off<<"Peri-Peri Chicken                 449"<<endl;
			off<<"Pepper Barbecue & onion           369"<<endl;
			off<<"Chicken Fiesta                    679"<<endl<<endl;
			off.close();
			ofstream offf("pizza information.txt");
			offf<<"                  VEG PIZZAS\n\n";
			offf<<"Types of Pizza                    Price"<<endl;
			offf<<"Margherita                        59"<<endl;
			offf<<"Farm House                        129"<<endl;
			offf<<"Peppy Paneer                      159"<<endl;
			offf<<"Mexican Green Wave                189"<<endl;
			offf<<"Deluxe Vaggie                     199"<<endl;
			offf<<"5 Pepper                          249"<<endl;
			offf<<"Veg Extravaganza                  289"<<endl;
			offf<<"Cheeze n Corn                     109"<<endl;
			offf<<"Paneer Makhani                    339"<<endl;
			offf<<"Veggie Paradise                   409"<<endl;
			offf<<"Fresh Veggie                      389"<<endl<<endl;
			offf<<"                 NON VEG PIZZAS\n\n";
			offf<<"Types of Pizza                    Price"<<endl;
			offf<<"Pepper Barbecue Chicken           159"<<endl;
			offf<<"Chicken Tikka                     99"<<endl;
			offf<<"Chicken Sausage                   199"<<endl;
			offf<<"Chicken Golden Dellight           289"<<endl;
			offf<<"Non Veg Supreme                   379"<<endl;
			offf<<"Chicken Dominator                 489"<<endl;
			offf<<"Peri-Peri Chicken                 449"<<endl;
			offf<<"Pepper Barbecue & onion           369"<<endl;
			offf<<"Chicken Fiesta                    679"<<endl<<endl;
			offf.close();
		    ofstream of("store.txt");
		    of<<order_no<<endl;
		    of<<total_amount;
		    of.close();
		}

		void search()
		{
		    int flag=0;
		    cout<<"\nEnter the search order number:-";
		    cin>>s;
		    if(s==order_no)
            {
                cout<<"\n\nThe Total Person is:-"<<person<<endl;
                cout<<"Your order is:-\n";
                for(i=0;i<n;i++)
                {
                    cout<<order[i]<<endl;
                }
                cout<<"The total amount is "<<total_amount<<endl;
                flag=1;
            }
            if(flag==0)
            {
            	cout<<"\nNot Found your Order Number";
			}
		}
};

int main()
{
    cout<<"                                              WELCOME TO THE PIZZA HUT MANAGEMENT SYSTEM"<<endl<<endl;
	pizza p;
	p.information();
	cout<<"                                              New Menu"<<endl<<endl;
	p.changes();
	p.input();
	p.generate();
	p.file();
	p.search();
	return 0;
}