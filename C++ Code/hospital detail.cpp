URL CODE:-cpp.sh/2wdtc

// Hospital detail
#include <iostream>
#include <string>
using namespace std;

struct admission_date
    {
        int date;
        int month;
        int year;
    };
 
 struct discharging_date
    {
        int date;
        int month;
        int year;
    };
    
class hospital
{
    string name;
    admission_date a;
    string disease;
    discharging_date d;
    public:
    void input();
    void output();
};

class age:public hospital
{
    int age;
    public:
    void in();
    void out();
    void pediatric();
};

 void hospital::input()
 {
     cout<<"Enter the name of the patient:-";
     cin>>name;
     cout<<"Enter the date of admission:-";
     cout<<"\nEnter date:-";
     cin>>a.date;
     cout<<"Enter month:-";
     cin>>a.month;
     cout<<"Enter year:-";
     cin>>a.year;
     cout<<"Enter the disease:-";
     cin>>disease;
     cout<<"Enter the date of discharge:-";
     cout<<"\nEnter date:-";
     cin>>d.date;
     cout<<"Enter month:-";
     cin>>d.month;
     cout<<"Enter year:-";
     cin>>d.year;
 }
 
 void age::in()
 {
     input();
     cout<<"Enter the age of patient:-";
     cin>>age;
 }
 
 void hospital::output()
 {
     cout<<"\nName of the patient is "<<name<<".";
     cout<<"\nDate of admission="<<a.date<<"/"<<a.month<<"/"<<a.year;
     cout<<"\nDisease is "<<disease;
     cout<<"\nDate of discharge="<<d.date<<"/"<<d.month<<"/"<<d.year;
 }
 
 void age::out()
 {
     output();
     cout<<"\nAge of a patient is "<<age<<".";
 }
 
 void age::pediatric()
 {
     if(age<12)
     {
         cout<<"\n\nDetails of pediatric patients:-\n";
         out();
         cout<<endl;
     }
     else
     cout<<"\n\nNO any pediatric patients in a hospital."<<endl;;
 }
 
 int main()
 {
     age a;
     a.in();
     a.out();
     a.pediatric();
     return 0;
 }