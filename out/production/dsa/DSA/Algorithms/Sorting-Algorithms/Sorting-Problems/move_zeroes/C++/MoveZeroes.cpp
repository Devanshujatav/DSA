#include <iostream>
#include <vector>

using namespace std;

void moveZeroes(vector<int>& nums){
	
	// Size of the Vector
	int n = nums.size();
	
	for(int i=0 ; i<n ; i++){
		// Flag Indicator
		bool flag = false;
		for(int j=0 ; j<n-1 ; j++){
			if(nums[j]==0 && nums[j+1]!=0){
				flag = true;
				swap(nums[j], nums[j+1]);	
			}
		}
		
		if(flag == false){
			break;
		}
	}
}

int main(){
	vector<int> nums = {3,0,2,1,0,5,4};
	
	moveZeroes(nums);
	
	for(int val : nums){
		cout<<val<<" ";	
	}
	
	cout<< endl;
	
	return 0;
}
