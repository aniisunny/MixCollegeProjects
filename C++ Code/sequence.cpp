#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
int N,K,cases,square=0,sum=0;
cin>>cases;
string arr[cases];
int flag=0;
for(int i=0;i<cases;i++)
{
cin>>N>>K;
int a[N];
for(int j=0;j<N;j++)
{
cin>>a[j];
}
sort(a, a+N, greater<int>());
for(int j=0;j<K;j++)
{
a[j]=1;
}
for(int m=0;m<N;m++)
{
square=square+pow(a[m],2);
sum=sum+a[m];
if(square<=sum)
    flag=1;
else
    flag=0;
if(flag==1)
arr[i]="YES";
else
arr[i]="NO";
}
}
for(int i=0;i<cases;i++)
    cout<<arr[i]<<endl;
}
