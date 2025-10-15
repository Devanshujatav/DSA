# Problem Statement

Problem 1: Distributing Chocolate Boxes Among Students

Input:

• N: The number of boxes of chocolates .

◦ N is greater than or equal to 1 and less than or equal to 10^5 .

• A: An array where each element A[i] represents the number of chocolates in the i-th box .

◦ Each A[i] is greater than or equal to 1 and less than or equal to 10^4 .

• M: The number of students among whom the chocolate boxes are to be distributed .
Task: You are given N boxes of chocolates and M students. You need to distribute all these boxes among the M students .
Goal: The objective is to distribute the boxes in such a way that the maximum number of chocolates allocated to any single student is minimised . In simpler terms, you need to find the "minimum maximum" possible .
Conditions for Distribution: The distribution must adhere to the following rules:

• One box, one student: Each box must be allocated entirely to exactly one student; it cannot be split or partially given to multiple students .

• All boxes allocated: All N boxes must be distributed. No box should remain unallocated .

• At least one box per student: Every student must receive at least one box .

• Continuous order: Students cannot be allocated boxes by skipping others. If a student receives boxes, they must be from a continuous sequence within the array of boxes (e.g., student one can get boxes 0, 1, and 2, but not box 0 and box 2, skipping box 1) .
Constraint/Guarantee:

• It is always possible to distribute the items according to the given conditions .
Note on Array State:

• The array A (of chocolate counts) is not sorted .

