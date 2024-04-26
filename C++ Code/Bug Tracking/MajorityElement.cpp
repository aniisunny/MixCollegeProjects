#include<iostream>
using namespace std;

    int majorityElement(int nums[], int size) {
		 int i, j, element = -1;
		 for(i=0; i<size; i++) {
			int temp = nums [ i ];
			int counter = 1;
			for(j = i + 1; j<size; j++)
				if(nums[j] == temp)
					counter ++;
			if(counter > size / 2)
				return temp;
		 }
		 return element;
	 }

	 int main() {
	     int nums[] = {2,2,1,1,1,2,2};
	     int size = 7;
	     cout<<majorityElement(nums, size);
	     return 0;
	 }
