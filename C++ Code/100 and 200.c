#include<stdio.h>
#include<conio.h>
int main()
{
    int sum=0,i=101;
    printf("All numbers greater than 100 and less than 200 which are divisible by 5");
    while(i<200)
    {
        if(i%5==0)
        {
          printf("\n%d",i);
          sum+=i;
        }
        i++;
    }
    printf("\n\nThe sum of all integers between greater than 100 and less than 200 which are divisible by 5=%d",sum);
    return 0;
}

