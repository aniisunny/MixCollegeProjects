#include<iostream>
using namespace std;
int climbStairs(int);
int climb_Stairs(int, int);
int main() {
    cout<<climbStairs(8);
}

	int climbStairs(int n) {
		return climb_Stairs(0, n);
	}

	int climb_Stairs(int i, int n) {
		if(i > n)
			return 0;
		if(i == n)
			return 1;
		return climb_Stairs(i + 1, n) + climb_Stairs(i + 2, n);
	}
