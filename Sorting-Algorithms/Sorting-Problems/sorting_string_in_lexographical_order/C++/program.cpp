#include<iostream>
#include<string>
using namespace std;

class Program{
private:
	static void sortFruits(string fruits[] , int n){
		for(int i=0 ; i<n-1 ; i++){
			int minIndex = i;
			for(int j=i+1 ; j<n ; j++){
				if (fruits[j] < fruits[minIndex]){
					minIndex = j;
				}
			} 	 	

			// Swap the elements
			string temp = fruits[i];
			fruits[i] = fruits[minIndex];
			fruits[minIndex] = temp;
		} 
	} 

public: 
	static void main(){
		string fruits[] = {"apple", "mango", "papaya", "banana"};

		int n = sizeof(fruits) / sizeof(fruits[0]);

		sortFruits(fruits , n);

		for(string val : fruits){
			cout<<val<<" ";
		}

		cout<<endl;
	}
};

int main() {
    Program::main();
    return 0;
}