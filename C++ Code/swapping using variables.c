
#include<stdio.h>
 int main()
 {
     int a,b,c;
     printf("Enter a value of a,b=");
     scanf("%d%d",&a,&b);
     c=a;
     a=b;
     b=c;
     printf("\nAfter swapping of number=%d %d",a,b);
     return 0;
 }
