# Day 11

## Problems Solved

### 1. Intersection of Two Linked Lists

Pattern:
Two Pointers

Approach:
- Use two pointers.
- When one pointer reaches null, move it to the other list.
- Both pointers travel equal distance.
- They meet at the intersection node.

Time Complexity: O(m+n)
Space Complexity: O(1)

Key Learning:
Equalizing path lengths can solve linked list intersection problems elegantly.

---

### 2. Linked List Cycle

Pattern:
Fast & Slow Pointer (Floyd's Cycle Detection)

Approach:
- Slow moves one step.
- Fast moves two steps.
- If they meet, a cycle exists.

Time Complexity: O(n)
Space Complexity: O(1)

Key Learning:
Fast and Slow pointers are extremely useful in linked list problems.

---

### 3. Reverse Nodes in K Group

Pattern:
Recursion + Linked List Reversal

Approach:
- Count k nodes.
- Recursively solve remaining list.
- Reverse current group of k nodes.
- Connect reversed group with recursive result.

Time Complexity: O(n)
Space Complexity: O(n/k) Recursive Stack

Key Learning:
Complex linked list problems become easier when broken into smaller recursive subproblems.

---

## Summary

Topics Covered:
- Two Pointers
- Fast & Slow Pointer
- Recursion
- Linked List Reversal

Day 11 Complete ✅