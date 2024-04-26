#include<stdio.h>
#include<conio.h>
int main()
{
    float km,m,cm,in,ft;
    printf("Enter a distance between two cities(in km)=");
    scanf("%f",&km);
    m=km*1000;
    cm=km*100000;
    in=km*39370.0787;
    ft=km*3280.8399;
    printf("\nThe distance between two cities(in m)=%f",m);
    printf("\nThe distance between two cities(in cm)=%f",cm);
    printf("\nThe distance between two cities(in in)=%f",in);
    printf("\nThe distance between two cities(in ft)=%f",ft);
    return 0;
}
