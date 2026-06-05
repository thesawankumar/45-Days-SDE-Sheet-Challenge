# Day 5

## Problems Solved

### 1. Search a 2D Matrix

Pattern:
Binary Search

Idea:
Treat the matrix as a sorted 1D array.

Convert index into row and column:

row = mid / cols
col = mid % cols

Time Complexity: O(log(m*n))
Space Complexity: O(1)

---

### 2. Pow(x, n)

Pattern:
 Binary Exponentiation

Idea:
Instead of multiplying x n times,
square the answer and reduce n by half.

Time Complexity: O(log n)
Space Complexity: O(log n)

---

### 3. Majority Element

Pattern:
Moore's Voting Algorithm

Idea:
Keep a candidate and count.

If count becomes zero,
choose a new candidate.

The majority element survives all cancellations.

Time Complexity: O(n)
Space Complexity: O(1)

---

## Key Learnings

- Binary Search on Matrix
- Fast Exponentiation
- Moore's Voting Algorithm

Day 5 Complete ✅