#include<stdio.h>
 void main()
 {
     int n,reversed_integer=0,original_integer,remainder;
     printf("Enter the value of n=");
     scanf("%d",&n);
     original_integer=n;
     while(n!=0)
     {
         remainder=n%10;
         reversed_integer=reversed_integer*10+remainder;
         n/=10;
     }
     if(original_integer==reversed_integer)
        printf("\n %d is a palindrome.",original_integer);
     else
        printf("\n %d is not a palindrome.",original_integer);
 }
