#include<iostream>
using namespace std;

	string grammer(int n, int k) {
        if(n == 1)
         return "0";
        string s = grammer(n - 1, k);
        string str = "";
        for(int i = 0; i < s.length(); i++) {
            if(s[i] == '0')
                str += "01";
            if(s[i] == '1')
                str += "10";
        }
        return str;
    }

	int kthGrammar(int N, int K) {
        string s = grammer(N, K);
        return s[K - 1] - '0';
    }
    
    int main() {
    	cout<<kthGrammar(4, 5);
    	return 0;
	}
