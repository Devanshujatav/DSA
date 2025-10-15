import array

def move_zeroes_bubble_array(arr):
	#length of the array
	n = len(arr)

	for i in range(n):
		flag = False

		# Check all adjacent pairs 
		for j in range(n-1):
			# finding elements where j-->0 and j+1 --> not equals to 0
			if arr[j] == 0 and arr[j+1] != 0: 
				temp = arr[j]
				arr[j] = arr[j+1]
				arr[j+1] = temp
				flag = True

		if flag == False:
			break

	return arr


arr = array.array('i', [10, 0, 0, 40])
print("Original Array:")
for element in arr: 
    print(element, end=" ")  # Added end=" " for better formatting
print()  # New line

print("Manipulated Array:")
move_zeroes_bubble_array(arr)
for element in arr:  # Print the modified array
    print(element, end=" ")
print()