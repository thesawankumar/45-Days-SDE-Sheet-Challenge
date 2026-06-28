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


# Search a 2D Matrix

Pattern:
Binary Search

Key Idea:
Treat the matrix as a single sorted array.

Formula:

row = mid / cols
col = mid % cols

Why?

This helps us apply Binary Search directly on a matrix.

Time Complexity: O(log(m*n))
Space Complexity: O(1)

Interview Question:
Why not use Binary Search on each row?

Answer:
That would take O(m log n).
Treating the matrix as one sorted array is more efficient.

---

# Pow(x, n)

Pattern:
Binary Exponentiation

Key Idea:
Instead of multiplying x, n times,
square the result and reduce n by half.

Example:

2^10

2^10 = (2^2)^5

This reduces calculations significantly.

Time Complexity: O(log n)
Space Complexity: O(log n) (recursive)

Interview Question:
Why is Binary Exponentiation better than brute force?

Answer:
Brute Force → O(n)
Binary Exponentiation → O(log n)

---

# Majority Element

Pattern:
Moore's Voting Algorithm

Key Idea:
Maintain:

candidate
count

If count becomes 0,
pick a new candidate.

The majority element survives all cancellations.

Example:

[2,2,1,1,1,2,2]

After cancellation,
2 remains as candidate.

Time Complexity: O(n)
Space Complexity: O(1)

Interview Question:
Why does Moore's Voting work?

Answer:
The majority element appears more than n/2 times,
so it cannot be completely cancelled by other elements.

---

# Day 5 Patterns Learned

1. Binary Search on Matrix
2. Binary Exponentiation
3. Moore's Voting Algorithm

Important Interview Takeaway:

Whenever you see:

* Sorted Data → Think Binary Search
* Large Powers → Think Binary Exponentiation
* Majority Frequency (> n/2) → Think Moore's Voting


# Majority Element II

Pattern:
Moore's Voting Algorithm (Extended)

Key Idea:

For elements appearing more than n/3 times,
there can be at most 2 such elements.

So we maintain:

candidate1
candidate2

and their counts.

Time Complexity: O(n)
Space Complexity: O(1)

Interview Tip:

For n/2 → 1 candidate

For n/3 → 2 candidates

For n/k → k-1 candidates

---

# Unique Paths

Pattern:
Combinatorics

Key Idea:

To reach destination:

Move Right (n-1) times
Move Down (m-1) times

Total moves:

(m+n-2)

Choose positions of Down moves:

C(m+n-2,m-1)

Time Complexity: O(min(m,n))
Space Complexity: O(1)

Interview Tip:

Most people use DP.

Combinatorics is more optimized.

---

# Reverse Pairs

Pattern:
Merge Sort

Condition:

nums[i] > 2 * nums[j]

where i < j

Brute Force:
O(n²)

Optimal:
Merge Sort

O(n log n)

Interview Tip:

Whenever counting pairs in an array:

* Inversions
* Reverse Pairs
* Smaller Elements After Self

Think Merge Sort.


# Two Sum

Pattern:
Hashing

Current Solution:
Brute Force

Time Complexity: O(n²)
Space Complexity: O(1)

Optimal Approach:

Use HashMap.

Store:
value -> index

Check:
target - currentValue

Time Complexity: O(n)
Space Complexity: O(n)

Interview Tip:

Whenever you need:
"Find a pair with a given sum"

Think HashMap.

---

# Four Sum

Pattern:
Sorting + Two Pointers

Key Idea:

1. Sort the array.
2. Fix first two elements.
3. Use two pointers for remaining elements.

Current Complexity:
O(n³)

Interview Tip:

2 Sum → HashMap

3 Sum → Sorting + Two Pointers

4 Sum → Sorting + Nested Loops + Two Pointers

---

# Longest Consecutive Sequence

Pattern:
HashSet

Key Idea:

Start only from numbers
that don't have a predecessor.

Example:

100,4,200,1,3,2

Start from 1.

1 → 2 → 3 → 4

Length = 4

Time Complexity: O(n)
Space Complexity: O(n)

Interview Tip:

If you see:
Consecutive Elements

Think HashSet.


# Longest Subarray With Sum K

Pattern:
Prefix Sum + HashMap

Key Idea:

If:

prefixSum - k

already exists,

then the subarray between those indices has sum k.

Time Complexity: O(n)
Space Complexity: O(n)

Interview Tip:

Whenever you see:
Subarray + Sum K

Think Prefix Sum.

---

# Count Subarrays With XOR K

Pattern:
Prefix XOR + HashMap

Key Idea:

currentXor ^ previousXor = k

Therefore:

previousXor = currentXor ^ k

Store frequencies of prefix XORs in HashMap.

Time Complexity: O(n)
Space Complexity: O(n)

Interview Tip:

Sum Problems → Prefix Sum

XOR Problems → Prefix XOR

---

# Longest Substring Without Repeating Characters

Pattern:
Sliding Window

Key Idea:

Expand window using right pointer.

If duplicate appears,
shrink window using left pointer.

Maintain unique characters inside window.

Time Complexity: O(n)
Space Complexity: O(n)

Interview Tip:

Whenever you see:

* Longest substring
* Distinct characters
* Continuous window

Think Sliding Window.


# Reverse Linked List

Pattern:
Pointer Manipulation

Key Idea:

Maintain:

prev
current
next

At every step:

1. Store next node
2. Reverse current link
3. Move pointers forward

Time Complexity: O(n)
Space Complexity: O(1)

Interview Tip:

Always draw pointer movement before coding.

---

# Middle Of Linked List

Pattern:
Fast and Slow Pointer

Key Idea:

Slow moves 1 step.
Fast moves 2 steps.

When fast reaches end,
slow reaches middle.

Time Complexity: O(n)
Space Complexity: O(1)

Interview Tip:

This pattern is also used in:

- Cycle Detection
- Palindrome Linked List
- Finding Midpoint

---

# Merge Two Sorted Lists

Pattern:
Recursion / Linked List Merge

Key Idea:

Compare current nodes.

Smaller node becomes part of answer.

Recursively merge remaining nodes.

Time Complexity: O(n+m)
Space Complexity: O(n+m) (recursive stack)

Interview Tip:

This is the same idea used in Merge Sort merging step.

---

# Day 9 Patterns Learned

1. Pointer Manipulation
2. Fast & Slow Pointer
3. Recursive Linked List Merge




# Remove Nth Node From End

Pattern:
Linked List Traversal

Current Approach:
Find Length First

Time Complexity: O(n)
Space Complexity: O(1)

Interview Tip:

Optimal Solution:
Fast and Slow Pointer

Remove node in one traversal.

---

# Add Two Numbers

Pattern:
Linked List Simulation

Key Idea:

Add digit by digit.

Maintain carry.

Use Dummy Node.

Time Complexity: O(max(n,m))
Space Complexity: O(max(n,m))

---

# Delete Node In Linked List

Pattern:
Node Copying Trick

Key Idea:

Copy next node value.

Delete next node.

Optimal:

node.val = node.next.val;
node.next = node.next.next;

Time Complexity: O(1)
Space Complexity: O(1)

---

# Day 10 Learnings

1. Linked List Traversal
2. Dummy Node Technique
3. Fast & Slow Pointer
4. Node Copying Trick


# Intersection of Two Linked Lists

Pattern:
Two Pointers

Key Idea:

Pointer A:
List A -> List B

Pointer B:
List B -> List A

Both travel same distance.

Time Complexity: O(m+n)
Space Complexity: O(1)

Interview Tip:

No need for HashSet.

Two Pointer solution is optimal.

---

# Linked List Cycle

Pattern:
Floyd Cycle Detection

Key Idea:

Slow = 1 step
Fast = 2 steps

If cycle exists,
they will eventually meet.

Time Complexity: O(n)
Space Complexity: O(1)

Interview Tip:

Cycle + Linked List

Think Fast & Slow Pointer.

---

# Reverse Nodes in K Group

Pattern:
Recursion

Key Idea:

Reverse only k nodes.

Recursively process remaining nodes.

Attach reversed part with remaining answer.

Time Complexity: O(n)
Space Complexity: O(n/k)

Interview Tip:

Questions involving:

- Reverse Alternate Nodes
- Reverse K Nodes
- Reverse Between Positions

are extensions of Linked List Reversal.


# Palindrome Linked List

Pattern:
Two Pointers

Approach Used:
Store all values in ArrayList and compare from both ends.

Time Complexity: O(n)
Space Complexity: O(n)

Interview Follow-Up:
Can be solved in O(1) space by reversing the second half.

---

# Linked List Cycle II

Pattern:
Floyd's Cycle Detection Algorithm

Key Idea:

1. Find meeting point using slow and fast pointers.
2. Move one pointer to head.
3. Move both one step at a time.
4. Meeting point becomes cycle start.

Time Complexity: O(n)
Space Complexity: O(1)

---

# Flatten Linked List

Pattern:
Merge Sorted Lists + Recursion

Key Idea:

Flatten right side first.
Merge current list with flattened list.

Similar to Merge Sort.

Time Complexity: O(N*M)
Space Complexity: O(recursion stack)

Interview Tip:
Whenever multiple sorted linked lists appear,
think Merge Sorted Lists.


# Rotate List

Pattern:
Linked List Rotation

Key Idea:

1. Find length of linked list.
2. Connect last node to head.
3. Find new tail.
4. Break the circle.

Time Complexity: O(n)
Space Complexity: O(1)

Interview Tip:
Always use:
k = k % length

---

# Copy List with Random Pointer

Pattern:
HashMap

Key Idea:

Store mapping:

Original Node -> Copy Node

First pass:
Create copied nodes.

Second pass:
Connect next and random pointers.

Time Complexity: O(n)
Space Complexity: O(n)

Interview Tip:
Optimal solution exists using O(1) extra space.

---

# Three Sum

Pattern:
Sorting + Two Pointers

Key Idea:

1. Sort array.
2. Fix one element.
3. Find remaining pair using two pointers.

Time Complexity: O(n²)
Space Complexity: O(1) excluding output.

Interview Tip:

2 Sum → HashMap

3 Sum → Sorting + Two Pointers

4 Sum → Sorting + Nested Loops + Two Pointers

# Trapping Rain Water

Pattern:
Two Pointers

Key Idea:

Water trapped at index:

min(leftMax, rightMax) - height[i]

Instead of storing arrays,
maintain:

leftMax
rightMax

using two pointers.

Time Complexity: O(n)
Space Complexity: O(1)

Interview Tip:

Most asked hard array problem.

---

# Remove Duplicates From Sorted Array

Pattern:
Two Pointers

Key Idea:

i = unique elements pointer
j = traversal pointer

Whenever a new element appears,
place it at i+1.

Time Complexity: O(n)
Space Complexity: O(1)

Interview Tip:

Whenever array is sorted,
think Two Pointers.

---

# Max Consecutive Ones

Pattern:
Linear Traversal

Key Idea:

Keep counting consecutive ones.

Reset count when zero appears.

Track maximum count.

Time Complexity: O(n)
Space Complexity: O(1)

Interview Tip:

Foundation problem for Sliding Window.



# Activity Selection

Pattern:
Greedy

Key Idea:

Always select the activity
that finishes earliest.

Why?

It leaves maximum room for future activities.

Time Complexity: O(n log n)

Interview Tip:
Sort by finish time.

---

# Minimum Platforms

Pattern:
Greedy + Two Pointers

Key Idea:

Sort arrival and departure arrays.

If train arrives before previous departure,
need a new platform.

Track maximum platforms needed.

Time Complexity: O(n log n)

Interview Tip:

Arrival <= Departure

means platform count increases.

---

# Job Sequencing Problem

Pattern:
Greedy

Key Idea:

Sort jobs by profit in descending order.

Try to schedule each job
at the latest available slot before deadline.

Time Complexity: O(n²)

Interview Tip:

Always prioritize higher profit jobs first.

---

# Fractional Knapsack

Pattern:
Greedy

Key Idea:

Sort items by:

profit / weight

Take highest ratio item first.

If full item can't fit,
take fractional part.

Time Complexity: O(n log n)

Interview Tip:

Greedy works because fractions are allowed.

# Coin Change

Pattern:
Dynamic Programming

Key Idea:

dp[i] = minimum coins needed to make amount i

Transition:

dp[i] = min(dp[i], 1 + dp[i-coin])

Time Complexity: O(amount × coins)
Space Complexity: O(amount)

Interview Tip:
Classic DP problem.
Understand state and transition clearly.

---

# Assign Cookies

Pattern:
Greedy + Sorting

Key Idea:

Sort both arrays.

Give smallest valid cookie
to the least greedy child.

Time Complexity: O(n log n)
Space Complexity: O(1)

Interview Tip:
Greedy works because local optimal choice
leads to maximum satisfied children.

---

# Subset Sums

Pattern:
Bit Manipulation

Key Idea:

Total subsets = 2^n

Use bits to decide
whether an element belongs to subset.

Time Complexity: O(n × 2^n)

Interview Tip:
Bitmasking is useful whenever
all subsets are required.

---

# Subsets II

Pattern:
Backtracking / Subsets

Current Solution:
Generate subsets and avoid duplicates.

Interview Tip:
Optimal solution uses backtracking
and skips duplicates directly instead of checking contains().

# Combination Sum

Pattern:
Backtracking

Key Idea:

Pick an element.
Either use it again or move forward.

Generate all valid combinations.

Time Complexity:
Exponential

Interview Tip:
Same element can be chosen multiple times.

---

# Combination Sum II

Pattern:
Backtracking

Key Idea:

Each element can be used only once.

Skip duplicates:

if(i > start && nums[i] == nums[i-1])

Time Complexity:
Exponential

Interview Tip:
Sort array before backtracking.

---

# Palindrome Partitioning

Pattern:
Backtracking

Key Idea:

Partition string only when substring is palindrome.

Generate all valid partitions.

Interview Tip:
Always check palindrome before recursion.

---

# Kth Permutation Sequence

Pattern:
Math + Factorial Number System

Key Idea:

Use factorial blocks to directly find kth permutation.

Avoid generating all permutations.

Time Complexity:
O(n²)

Interview Tip:
Frequently asked optimization problem.


# Permutations

Pattern:
Backtracking

Key Idea:

Choose one element.
Explore.
Backtrack.
Try next element.

Total permutations = n!

Time Complexity: O(n × n!)

Interview Tip:
Classic Backtracking Problem.

---

# N-Queens

Pattern:
Backtracking

Key Idea:

Place one queen per row.

Check:

- Column
- Main Diagonal
- Anti-Diagonal

before placing queen.

Time Complexity:
Exponential

Interview Tip:

Most famous backtracking interview problem.

---

# Sudoku Solver

Pattern:
Backtracking + Constraint Checking

Key Idea:

Try placing numbers 1-9.

If valid:
Move forward.

If invalid:
Backtrack.

Time Complexity:
Exponential

Interview Tip:

Demonstrates real-world backtracking.

# M-Coloring Problem

Pattern:
Backtracking + Graph

Key Idea:

Assign colors one by one.

Before assigning:

Check adjacent nodes.

No adjacent nodes should have same color.

Time Complexity:
O(m^v)

Interview Tip:

Classic Graph + Backtracking problem.

---

# Rat In A Maze

Pattern:
Backtracking

Key Idea:

Explore all possible paths.

Move:

D, L, R, U

Mark visited nodes.

Backtrack after exploration.

Time Complexity:
O(4^(n²))

Interview Tip:

Always remember:
Mark Visited → Explore → Unmark

---

# Word Break

Pattern:
Dynamic Programming

Key Idea:

dp[i] = true

if substring before i can be formed.

Transition:

dp[start] && word matches

Time Complexity:
O(n × dictionary size)

Interview Tip:

Very common DP interview problem.

Think:
Can we build answer from smaller substrings?


# Nth Root of M

Pattern:
Binary Search on Answer

Key Idea:

Search between 1 and m.

Check:

mid^n == m

Time Complexity:
O(log m)

Interview Tip:

Avoid Math.pow() directly because of precision issues.

Use multiplication with overflow checks.

---

# Matrix Median

Pattern:
Binary Search

Current Solution:
Flatten + Sort

Time Complexity:
O(r*c log(r*c))

Optimal Approach:

Binary Search on value range.

Time Complexity:
O(32 * r * log(c))

Interview Tip:

This is a classic Binary Search on Answer problem.

---

# Single Element in Sorted Array

Pattern:
Binary Search

Key Idea:

Pairs before single element start at even index.

Use parity of mid to eliminate half.

Time Complexity:
O(log n)

Space Complexity:
O(1)

---

# Search in Rotated Sorted Array

Pattern:
Binary Search

Key Idea:

One half is always sorted.

Determine which half is sorted.

Discard the other half.

Time Complexity:
O(log n)

Space Complexity:
O(1)

# Median of Two Sorted Arrays

Pattern:
Binary Search on Partition

Key Idea:

Partition both arrays such that:

Left Half <= Right Half

Then calculate median.

Time Complexity:
O(log(min(n,m)))

Interview Tip:

Always perform binary search
on the smaller array.

---

# Kth Element of Two Sorted Arrays

Current Approach:
Merge + Sort

Time Complexity:
O((n+m)log(n+m))

Optimal Approach:

Binary Search Partition

Time Complexity:
O(log(min(n,m)))

Interview Tip:

This is a direct extension
of Median of Two Sorted Arrays.

---

# Allocate Minimum Pages

Pattern:
Binary Search on Answer

Key Idea:

Guess maximum pages.

Check:

How many students are needed?

If students <= k

Try smaller answer.

Time Complexity:
O(n log(sum))

Interview Tip:

Classic Binary Search on Answer problem.

---

# Aggressive Cows

Pattern:
Binary Search on Answer

Key Idea:

Guess minimum distance.

Check if all cows
can be placed.

If possible:

Increase distance.

Time Complexity:
O(n log(maxDistance))

Interview Tip:

One of the most famous Binary Search problems.

# Max Heap Implementation

Pattern:
Heap / Priority Queue

Current Approach:

Store elements in ArrayList
and sort in descending order.

Operations:

Push -> Insert + Sort
Pop -> Remove first element
Peek -> Return maximum element

Interview Tip:

Optimal heap operations should be:

Push -> O(log n)
Pop -> O(log n)

Current approach:

Push -> O(n log n)

---

# Kth Largest Element

Pattern:
Min Heap

Key Idea:

Maintain heap size = k.

If heap size exceeds k,
remove smallest element.

At the end:

Heap top = kth largest element.

Time Complexity:
O(n log k)

Interview Tip:

Very common Heap interview problem.

---

# Top K Sum Combinations

Pattern:
Max Heap + HashSet

Key Idea:

Sort both arrays.

Start from largest pair.

Use Max Heap to always pick
the next largest sum.

Use HashSet to avoid duplicates.

Time Complexity:
O(k log k)

Interview Tip:

Classic Heap + Greedy problem.

# Find Median from Data Stream

Pattern:
Two Heaps

Key Idea:

Max Heap:
Stores smaller half

Min Heap:
Stores larger half

Median:

Odd Elements:
Top of Max Heap

Even Elements:
Average of both heap tops

Time Complexity:

Add Number -> O(log n)
Find Median -> O(1)

Interview Tip:

Most famous Heap interview problem.

---

# Merge K Sorted Arrays

Current Approach:

Flatten all arrays
and sort again.

Time Complexity:
O(N log N)

Optimal Approach:

Min Heap

Time Complexity:
O(N log K)

Interview Tip:

Whenever multiple sorted arrays appear,
think Heap.

---

# Top K Frequent Elements

Pattern:
Bucket Sort

Key Idea:

Store frequency.

Group elements by frequency.

Traverse buckets from high to low.

Time Complexity:
O(n)

Interview Tip:

Better than Heap for this problem.

# Stack Implementation

Pattern:
Array Implementation

Key Idea:

LIFO (Last In First Out)

Operations:

Push -> Insert at Top
Pop -> Remove from Top
Peek -> Return Top Element

Time Complexity:

Push -> O(1)
Pop -> O(1)
Peek -> O(1)

---

# Queue Implementation

Pattern:
Circular Queue

Key Idea:

FIFO (First In First Out)

Operations:

Enqueue
Dequeue
Front
Rear

Time Complexity:

All Operations -> O(1)

Interview Tip:

Circular Queue avoids wasted space.

---

# Stack Using Queue

Pattern:
Queue Simulation

Key Idea:

After every push,
rotate queue elements.

Latest inserted element
comes to front.

Push -> O(n)
Pop -> O(1)

Interview Tip:

Classic Stack-Queue conversion question.

---

# Queue Using Stack

Pattern:
Two Stacks

Key Idea:

Input Stack:
Store elements

Output Stack:
Serve elements

Reverse order only when needed.

Amortized Complexity:

Push -> O(1)
Pop -> O(1)

Interview Tip:

Very frequently asked interview problem.

# Valid Parentheses

Pattern:
Stack

Key Idea:

Push every opening bracket.

Whenever a closing bracket appears,
check whether the top of the stack
contains the matching opening bracket.

Time Complexity:
O(n)

Space Complexity:
O(n)

Interview Tip:

Whenever brackets, undo operations,
or nested structures appear,
think Stack.

---

# Next Greater Element

Current Approach:

Store index using HashMap.

For every element,
search to the right until a greater element is found.

Time Complexity:
O(n²)

Optimal Approach:

Use Monotonic Stack.

Time Complexity:
O(n)

Interview Tip:

Next Greater Element is one of the
most important Monotonic Stack problems.

---

# Sort a Stack

Pattern:
Recursion + Stack

Key Idea:

Remove the top element.

Sort remaining stack recursively.

Insert current element
back in the correct position.

Time Complexity:
O(n²)

Interview Tip:

Very common recursion interview question.

# Next Smaller Element

Current Approach:
Nested Loops

Key Idea:

For every element,
search on the right
until a smaller element is found.

Current Complexity:
O(n²)

Optimal Approach:

Monotonic Stack

Time Complexity:
O(n)

Interview Tip:

Whenever you hear
Next Greater/Next Smaller,
think Monotonic Stack.

---

# LRU Cache

Pattern:
HashMap + Doubly Linked List

Key Idea:

HashMap provides O(1) lookup.

Doubly Linked List maintains
recently used order.

Most recently used node stays
near the head.

Least recently used node
gets removed from the tail.

Time Complexity:

get() -> O(1)
put() -> O(1)

Interview Tip:

One of the most frequently asked
system design + DSA interview questions.

---

# LFU Cache

Pattern:
HashMap + Frequency Map

Key Idea:

Each node stores frequency.

Whenever accessed,
frequency increases.

If cache is full,
remove the least frequently used node.

Time Complexity:

get() -> O(1)
put() -> O(1)

Interview Tip:

LFU is harder than LRU and is
asked in product-based companies.

# Largest Rectangle in Histogram

Pattern:
Monotonic Stack

Key Idea:

Maintain an increasing stack.

Whenever a smaller bar appears,
calculate the maximum area.

Time Complexity:
O(n)

Interview Tip:

One of the most important Stack problems.

---

# Sliding Window Maximum

Pattern:
Deque (Monotonic Queue)

Key Idea:

Maintain useful indices only.

Front always stores
maximum element of current window.

Time Complexity:
O(n)

Interview Tip:

Very common Sliding Window interview question.

---

# Min Stack

Pattern:
Stack + Minimum Tracking

Key Idea:

Store current minimum
with every pushed element.

getMin() becomes O(1).

Time Complexity:

Push -> O(1)
Pop -> O(1)
Top -> O(1)
GetMin -> O(1)

Interview Tip:

Frequently asked Stack design question.

---

# Rotten Oranges

Pattern:
Multi Source BFS

Key Idea:

Push all rotten oranges first.

Spread infection
level by level.

Time Complexity:
O(n × m)

Interview Tip:

Whenever multiple sources start BFS,
think Multi Source BFS.

# Online Stock Span

Pattern:
Monotonic Stack

Key Idea:

Maintain a decreasing stack of prices.

If current price is greater,
remove smaller prices and
add their span.

Time Complexity:
O(n)

Interview Tip:

Very common Stack interview problem.

---

# Maximum of Minimum for Every Window

Pattern:
Monotonic Stack

Key Idea:

Find Previous Smaller
and Next Smaller element.

Calculate the window size
where current element is minimum.

Time Complexity:
O(n)

Interview Tip:

Combination of Previous Smaller
and Next Smaller concepts.

---

# Celebrity Problem

Pattern:
Stack Elimination

Key Idea:

Compare two people.

If A knows B,
A can't be celebrity.

Otherwise,
B can't be celebrity.

Verify the last remaining person.

Time Complexity:
O(n)

Interview Tip:

Classic Stack elimination problem.