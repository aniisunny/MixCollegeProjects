#include<stdio.h>
#include<math.h>
int main()
{
    int a,b,c,d;
    float root1,root2;
    printf("Enter the value of a for quadratic equation=");
    scanf("%d",&a);
    printf("\nEnter the value of b for quadratic equation=");
    scanf("%d",&b);
    printf("\nEnter the value of c for quadratic equation=");
    scanf("%d",&c);
    d=((b*b)-(4*a*c));
    if(d>0)
    {
        root1=((-b)+pow(d,1/2))/2a;
        root2=((-b)-pow(d,1/2))/2a;
        printf("\nRoots are=%f%f",root1,root2);
    }
    if(d==0)
    {
        root1=root2=(-b)/2a;
        printf("\nRoots are=%f%f",root1,root2);
    }
    if(d<0)
        printf("\n imaginary roots");
    return 0;

}
