# DSA Interview Notes

## Time Complexity

O(1) < O(log n) < O(n) < O(n log n) < O(n²)

## Space Complexity

Extra memory used by algorithm.

## Two Pointer Pattern

Used when:
- Sorted Arrays
- Pair Sum Problems
- Removing Duplicates

## Sliding Window

Used when:
- Subarray
- Substring
- Fixed/Variable Window Size

## Recursion Template

1. Base Case
2. Recursive Call
3. Backtracking (if needed)

## Binary Search Template

while(low <= high){
    int mid = low + (high-low)/2;
}



# Kadane's Algorithm

Purpose:
Find the maximum sum subarray.

Time Complexity: O(n)
Space Complexity: O(1)

Key Idea:
If current sum becomes negative, start a new subarray.

---

# Dutch National Flag Algorithm

Used In:
Sort Colors

Pointers:
- low
- mid
- high

Time Complexity: O(n)
Space Complexity: O(1)

Key Idea:
Partition the array into 0s, 1s, and 2s in one traversal.

---

# Best Time to Buy and Sell Stock

Approach:
Track the minimum buying price and maximum profit.

Time Complexity: O(n)
Space Complexity: O(1)

Key Idea:
Maintain the best buying opportunity seen so far.



# Rotate Image

Technique:
Transpose + Reverse

Time Complexity: O(n²)
Space Complexity: O(1)

---

# Merge Intervals

Pattern:
Sorting + Merging Overlaps

Time Complexity: O(n log n)
Space Complexity: O(n)

---

# Merge Sorted Array

Pattern:
Two Pointers from End

Time Complexity: O(m+n)
Space Complexity: O(1)

Key Idea:
Fill nums1 from the back to avoid shifting elements.