# Missing Number - Java Solution

This project contains a Java implementation of the classic **Missing Number** problem. The goal is to find the missing number from an array containing `n` distinct numbers taken from `0, 1, 2, ..., n`.

## Problem Statement

Given an array `nums` containing `n` distinct numbers in the range `[0, n]`, return the one number that is missing from the array.

### Example

Input: nums = [3, 0, 1]
Output: 2
Explanation: The numbers 0, 1, and 3 are present. 2 is missing.


## Approach

This implementation uses the **Mathematical Formula** approach:

1. The expected sum of the first `n` natural numbers (including 0) is calculated using the formula:
sum = n * (n + 1) / 2


2. The actual sum of elements in the array is computed.

3. The difference between the expected sum and the actual sum gives the missing number.

### Time and Space Complexity

- **Time Complexity:** O(n) – One pass through the array.
- **Space Complexity:** O(1) – Constant extra space is used.
