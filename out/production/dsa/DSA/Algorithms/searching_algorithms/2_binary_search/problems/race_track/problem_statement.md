# Problem Statement 

### Problem 2: Placing Kids on a Racing Track

Input:

• N: The number of starting points on a racing track . The track is a straight line .

• X: An array containing the positions of these N starting points .

◦ The maximum position value X[i] will always be less than or equal to 10^9 .

◦ For each i, X[i+1] is greater than X[i], meaning the positions are distinct and given in increasing (sorted) order .

• M (or K): The number of kids to be placed on the racing track .
Task:

• You have to place M kids on the racing track at these available starting points .
Goal:

• The objective is to place the kids such that the minimum distance between any two of them is as large as possible . This is also referred to as finding the "maximum minima" . The reasoning provided is that the kids should be placed as far apart as possible to prevent them from colliding .
Both of these problems exemplify the "Binary Search on Answer Value" pattern, where the search space is not the input array itself, but rather the possible range of the answer value (either minimum maximum or maximum minimum) .
Think of it like setting the ideal room temperature. In the chocolate distribution, you're trying to find the coolest "hottest spot" (minimum of maximums) in the room. You want to make sure no one person feels too hot, and you're aiming for the lowest possible temperature that still accommodates everyone. For the racing track, you're trying to achieve the warmest "coolest spot" (maximum of minimums) in the room. You want to maximise the distance between the kids, so you're looking for the largest possible minimum spacing between them, ensuring no two kids are uncomfortably close.