function moveZeroes(nums){
	// Length of the array-> nums
	const n = nums.length;
	
	for(let i=0 ; i<n ; i++){
		let flag = false;
		for(let j=0 ; j<n-1 ; j++){
			if(nums[j]===0 && nums[j+1]!== 0){
				flag = true;
				let temp = nums[j];
				nums[j]=nums[j+1];
				nums[j+1]=temp;
			}
		}
		if(flag === false){
			break;
		}
	}
}

const arr = [3, 0, 2, 1, 0, 5, 4];

console.log("Origional Array : ",arr);

moveZeroes(arr);

console.log("After moving zeroes : ",arr);

// OR

let Output = "";
for(let val of arr){
	Output += val + " ";
}

console.log(Output);

// Alternative Using join() method

console.log("Using join method : ", arr.join(" "));
