#include<stdio.h>
void main()
{
    int a[10][10],b[10][10],n,i,j,k,result[10][10],ch;
    printf("Enter the limit of array=");
    scanf("%d",&n);
    printf("\n");
    printf("Enter a matrix A:-\n");
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
         scanf("%d",&a[i][j]);
        }
     printf("\n");
    }
    printf("Enter a matrix B:-\n");
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
         scanf("%d",&b[i][j]);
        }
    printf("\n");
    }
    printf("Enter the choice;1.addition 2.substraction 3.transpose 4.multiplication=");
    scanf("%d",&ch);
    printf("\n");
    switch(ch)
    {
     case 1:
         printf("The addition of matrix:-\n");
         for(i=0;i<n;i++)
         {
          for(j=0;j<n;j++)
          {
            result[i][j]=a[i][j]+b[i][j];
            printf("%d  ",result[i][j]);
          }
            printf("\n");
         }
         printf("\n");
     case 2:
         printf("The substraction of matrix:-\n");
         for(i=0;i<n;i++)
         {
          for(j=0;j<n;j++)
          {
            result[i][j]=a[i][j]-b[i][j];
            printf("%d  ",result[i][j]);
          }
       printf("\n");
         }
        printf("\n");
     case 3:
         printf("The transpose of matrix A:-\n");
         for(i=0;i<n;i++)
         {
          for(j=0;j<n;j++)
          {
            result[i][j]=a[j][i];
            printf("%d  ",result[i][j]);
          }
            printf("\n");
         }
          printf("\n\nThe transpose of matrix B:-\n");
         for(i=0;i<n;i++)
         {
          for(j=0;j<n;j++)
          {
            result[i][j]=b[j][i];
            printf("%d  ",result[i][j]);
          }
         printf("\n");
        }
     case 4:
         for(i=0;i<n;i++)
             for(j=0;j<n;j++)
                result[i][j]=0;
          printf("\nThe multiplication of matrix A and B:-\n");
         for(i=0;i<n;i++)
         {
          for(j=0;j<n;j++)
          {
            int sum=0;
            for(k=0;k<n;k++)
            {
                sum=sum+a[i][k]*b[k][j];
                result[i][j]=sum;
            }
          printf("%d  ",result[i][j]);
          }
        printf("\n");
       }
    }
}
