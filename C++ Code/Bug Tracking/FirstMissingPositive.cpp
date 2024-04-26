#include<iostream>
using namespace std;

	int firstMissingPositive(int nums[]) {
		int positive = 1;
		for(int i = 0; i < 4; i++) {
			if(nums[i] == positive) {
				positive++;
				i = -1;
			}
		}
		return positive;
	}

	int main() {
		int nums[] = {3, 4, -1, 1};
		cout<<firstMissingPositive(nums);
		return 0;
	}
