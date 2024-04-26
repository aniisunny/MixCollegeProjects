#include<stdio.h>
void main()
{
    int i,j,k,n;
    printf("\n Enter number of rows that you want to print:- ");
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
      for(k=0;k<n-i;k++)
      printf(" ");
      for(j=0;j<=i;j++)
      printf("*");
      printf("\n");
    }
}
