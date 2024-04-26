#include<stdio.h>
#include<conio.h>
int main()
{
   int a,b;
   printf("Enter a value of a=");
   scanf("%d",&a);
   printf("\n Enter a value of b=");
   scanf("%d",&b);
   printf("\n AND bitwise operator=%d",a&b);
   printf("\n OR bitwise operator=%d",a|b);
   printf("\n XOR bitwise operator=%d",a^b);
   printf("\n COMPLEMENT bitwise operator=%d",~a,~b);
   printf("\n RIGHT SHIFTED bitwise operator=%d",a>>3,b>>4);
   printf("\n LEFT SHIFTED bitwise operator=%d",a<<4,b<<5);
   return 0;
}
