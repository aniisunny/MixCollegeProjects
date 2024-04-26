#include<stdio.h>
#include<math.h>
int main()
{
    int n,x,i,j,fact;
    float sum=1;
    printf("Enter the value of x=");
    scanf("%d",&x);
    printf("\nEnter the value of n=");
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        fact=1;
        for(j=i;j>=1;j--)
        fact*=j;
        sum+=pow(x,i)/fact;
    }
    printf("\n\nSum of series=%f",sum);
}
