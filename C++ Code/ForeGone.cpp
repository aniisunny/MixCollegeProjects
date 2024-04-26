#include<iostream>
#include<vector>
using namespace std;
int main()
{
    long long int a,b;
    int t;
    vector<long long int> v1;
    vector<long long int> v2;
    cin>>t;
    int c1=1,c2=1;
    long long int arr[t];

    for(int i=0;i<t;i++)
    {
        a=0;
        b=arr[i];
        for(int j=0;j<arr[i];j++)
        {
            while (b)
            {
                v1.push_back(b % 10);
                b/=10;
            }
            reverse(v1.begin());
            while (a)
            {
                v2.push_back(a % 10);
                a/=10;
            }
            reverse(v2.begin(), v2.end());
            for(int k=0; k<v1.size(); k++)
            {
                if(v1[k]==4)
                {
                    c1=0;
                    break;
                }
            }
            if(c1!=0)
            {
                for(int l=0; l<v2.size(); l++)
                {
                    if(v2[l] == 4)
                    {
                        c2=0;
                        break;
                    }
                }
            }
            if(c1==0||c2==0)
            {
                a++;
                b--;
            }
        }
        cout<<"case #"<<i+1<<": "<<a<<" "<<b<<endl;
    }
}
