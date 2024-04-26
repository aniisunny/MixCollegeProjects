#include<stdio.h>
#include<conio.h>
int main()
{
    int a,b,c;
    printf("Enter a first number=");
    scanf("%d",&a);
    printf("\nEnter a second number=");
    scanf("%d",&b);
    printf("\nEnter a third number=");
    scanf("%d",&c);
    if(a>b)
    {

        if(b>c)
         printf("\n%d is the greatest number.",a);
        else
         printf("\n%d is the greatest number.",c);
    }
    else
    {

        if(b>c)
         printf("\n%d is the greatest number.",b);
        else
          printf("\n%d is the greatest number.",c);
    }

    return 0;

}
