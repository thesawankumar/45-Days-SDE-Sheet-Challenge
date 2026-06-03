# Day 2

## Problems Solved

### 1. Maximum Subarray (Kadane's Algorithm)

Approach:
- Maintain current sum and maximum sum.
- If current sum becomes negative, reset it.
- Update maximum sum at every step.

Time Complexity: O(n)
Space Complexity: O(1)

Key Learning:
Negative prefixes do not help in forming the maximum subarray.

---

### 2. Sort Colors

Approach:
- Used Dutch National Flag Algorithm.
- Three pointers: low, mid, high.
- Sort the array in one traversal.

Time Complexity: O(n)
Space Complexity: O(1)

Key Learning:
Three-pointer technique can efficiently partition arrays.

---

### 3. Best Time to Buy and Sell Stock

Approach:
- Track minimum buying price.
- Calculate profit for every price.
- Update maximum profit.

Time Complexity: O(n)
Space Complexity: O(1)

Key Learning:
Many optimization problems can be solved by tracking the best value seen so far.

---

## Summary

Topics Covered:
- Kadane's Algorithm
- Dutch National Flag Algorithm
- Array Optimization

Day 2 Complete ✅