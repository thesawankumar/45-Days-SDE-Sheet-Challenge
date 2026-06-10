# Day 9

## Problems Solved

### 1. Reverse Linked List

Pattern:
Pointer Manipulation

Approach:
- Use three pointers:
  - prev
  - current
  - next
- Reverse links one by one.

Time Complexity: O(n)
Space Complexity: O(1)

Key Learning:
Always store the next node before changing pointers.

---

### 2. Middle Of Linked List

Pattern:
Fast & Slow Pointer

Approach:
- Slow moves one step.
- Fast moves two steps.
- When fast reaches end, slow reaches middle.

Time Complexity: O(n)
Space Complexity: O(1)

Key Learning:
Fast and Slow pointers help solve many linked list problems efficiently.

---

### 3. Merge Two Sorted Lists

Pattern:
Recursion

Approach:
- Compare current nodes.
- Attach smaller node.
- Recursively merge remaining nodes.

Time Complexity: O(n + m)
Space Complexity: O(n + m)

Key Learning:
Recursion can make linked list merging very clean and readable.

---

## Summary

Topics Covered:
- Linked List Reversal
- Fast & Slow Pointer
- Recursive Linked List Merge

Day 9 Complete ✅