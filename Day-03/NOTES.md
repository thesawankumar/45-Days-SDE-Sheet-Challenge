# Day 3

## Problems Solved

### 1. Rotate Image

Approach:
1. Transpose the matrix.
2. Reverse each row.

Time Complexity: O(n²)
Space Complexity: O(1)

Key Learning:
Matrix rotation can be achieved without extra space by combining transpose and reverse operations.

---

### 2. Merge Intervals

Approach:
1. Sort intervals by start time.
2. Merge overlapping intervals.
3. Store merged intervals in result list.

Time Complexity: O(n log n)
Space Complexity: O(n)

Key Learning:
Sorting often simplifies interval problems significantly.

---

### 3. Merge Sorted Array

Approach:
1. Start from the end of both arrays.
2. Place the larger element at the end.
3. Continue until nums2 is exhausted.

Time Complexity: O(m+n)
Space Complexity: O(1)

Key Learning:
Working from the back avoids unnecessary shifting operations.

---

## Summary

Topics Covered:
- Matrix Manipulation
- Intervals
- Two Pointers

Day 3 Complete ✅