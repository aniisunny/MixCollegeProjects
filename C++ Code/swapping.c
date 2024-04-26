#include<stdio.h>
 int main()
 {
     int a,b;
     printf("Enter a value of a,b=");
     scanf("%d%d",&a,&b);
     a=a+b;
     b=a-b;
     a=a-b;
     printf("\nAfter swapping of number=%d %d",a,b);
     return 0;
 }
