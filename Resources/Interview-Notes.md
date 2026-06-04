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

# Day 4 Notes

## 1. Find Duplicate Number

Pattern: Cyclic Sort

Idea:

Every number should be placed at its correct index.

Example:

1 should be at index 0
2 should be at index 1
3 should be at index 2

While placing numbers, if a number is already present at its correct position, then that number is the duplicate.

Time Complexity: O(n)
Space Complexity: O(1)

---

## 2. Find Missing And Repeated Values

Pattern: HashSet

Idea:

Store all numbers in a HashSet.

If a number already exists in the set, it is repeated.

Then check numbers from 1 to n².

The number that is missing from the set is the missing value.

Time Complexity: O(n²)
Space Complexity: O(n²)

---

## 3. Count Inversions

Pattern: Merge Sort

Inversion:

arr[i] > arr[j]
and
i < j

Example:

[3,1,2]

Inversions:
(3,1)
(3,2)

Answer = 2

Idea:

While merging two sorted halves:

If left element > right element,
then all remaining elements in left half will also form inversions.

Count them directly.

Time Complexity: O(n log n)
Space Complexity: O(n)
