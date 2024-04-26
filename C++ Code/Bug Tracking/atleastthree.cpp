#include<bits/stdc++.h>
using namespace std;

int count_t(long n){
    int c=0;
    while(n>0){
        if(c==3) break;
        if(n%10==3){
            c++;
        }
        n=n/10;
    }
    return c;
}

int main() {
    long n = 1211;
    while(count_t(n+1)!=3){
   	  n++;
  }
	cout<<n+1<<endl;
    return 0;
}
