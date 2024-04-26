#include<iostream>
#include<stdio.h>
#include<string.h>
#include<fstream>
#include<ctime>
using namespace std;

class vehicle
{
protected:
    char type_veh[10];
    char reg_no[15];
    char dir[5];
public:
    vehicle();
    void getin();
    void time_in();
    void getout();
    void arrive();
   void file();
};

void vehicle::vehicle()
{
        strcpy(type_veh,"NULL");
        strcpy(reg_no,"NULL");
        strcpy(dir,"NULL");
}

void vehicle::getin()
{
    cout<<"\nEnter the type of vehicle(car or scooter):-";
    gets(type_veh);
    cout<<"Enter the registration number of vehicle:-";
    gets(reg_no);
    cout<<"Enter the direction of vehicle:-";
    gets(dir);
    time_in();
}

void vehicle::time_in()
{
        time_t tt;
        struct tm * ti;
        time(&tt);
        ti=localtime(&tt);
        cout<<"Time at which you did entered in my vehicle parking lot system:-"<<asctime(ti)<<endl;
}

void vehicle::getout()
{
        cout<<"Registration no of vehicle is "<<reg_no<<endl;
        cout<<"Type of vehicle is "<<type_veh<<endl;
        arrive();
        cout<<endl;
}

void vehicle::arrive()
{
        if(strcmpi(dir,"east")==0)
            cout<<"You are successful entered in my vehicle parking lot system."<<endl;
        else
            cout<<"You are moved to east end for entering in my parking lot system."<<endl;
}

 void vehicle::file()
{
    if(strcmpi(dir,"east")==0)
        cout<<"You are successful entered in my vehicle parking lot system."<<endl;
    else
        cout<<"You are moved to east end for entering in my parking lot system."<<endl;
}

class car:public vehicle
{
    int lane;
    int nvehicle;
    char d;
public:
    car()
    {
        lane=2;
        nvehicle=10;
    }
    void go()
    {
        getin();
    }
    void check()
    {
        if(strcmpi(type_veh,"car")==0)
            getdata();
    }
    void getdata()
    {
        getout();
       // file();
        cout<<"After entered in parking lot system you are enter the present direction for parked your car:-";
        gets(dir);
        dirn();
    }
    void putdata()
    {
        cout<<"Registration no of vehicle is "<<reg_no<<endl;
        cout<<"Type of vehicle is "<<type_veh<<endl;
        cout<<"Thanking you for entering in parking lot system."<<endl<<endl;
    }
    void dirn()
    {
        if(strcmpi(dir,"west")==0)
        {
            cout<<"\nYou are departure or not(Y or N):-";
            cin>>d;
            if(d=='Y' || d=='y')
            {
                cout<<"\nUpdated Car detail::-\n";
                putdata();
                file();
            }
            else
            {
                cout<<"\nYou are moved to the south end for parking your car.";
                strcpy(dir,"south");
                cout<<"\nYour car has parked successful."<<endl;
                cout<<"\nUpdated Car detail::-\n";
                putdata();
                file();
            }
        }
        else
        {
            cout<<"\nYou are moved to the west end for your parking or departure in parking lot system."<<endl;
            strcpy(dir,"west");
            dirn();
        }
    }
};

class scooter:public vehicle
{
    int lane;
    int nvehicle;
    char d;
public:
    scooter()
    {
        lane=2;
        nvehicle=10;
    }
    void go()
    {
        getin();
    }
    void check()
    {
        if(strcmpi(type_veh,"scooter")==0)
            input();
    }
    void input()
    {
        cout<<"After entered in parking lot you are enter the present direction:-";
        cin>>dir;
        dirn();
    }
    void putdata()
    {
        cout<<"Registration no of vehicle is "<<reg_no<<endl;
        cout<<"Type of vehicle is "<<type_veh<<endl;
        cout<<"Thanking you for entering in parking lot system."<<endl;
    }
    void dirn()
    {
        if(strcmpi(dir,"west")==0)
        {
            cout<<"\nYou are departure or not(Y or N):-";
            cin>>d;
            if(d=='Y' || d=='y')
            {
                cout<<"\nUpdated Scooter detail::-\n";
                putdata();
                file();
            }
            else
            {
                cout<<"\nYou are moved to the north end for parking your scooter.";
                strcpy(dir,"south");
                cout<<"\nYour scooter has parked successful.";
                cout<<"\n\nUpdated Car detail::-\n";
                putdata();
                file();
            }
        }
        else
        {
            cout<<"\nYou are moved to the west end for your parking or departure in parking lot system."<<endl;
            strcpy(dir,"west");
            dirn();
        }
    }
};

int main()
{
    cout<<"\t\t\t\t\tWELCOME TO THE VEHICLE PARKING LOT SYSTEM\t\t"<<endl<<endl<<endl;
    car c;
    scooter s;
    c.go();
    c.check();
    s.go();
    s.check();
    return 0;
}
