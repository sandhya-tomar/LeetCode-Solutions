# Leetcode 448 - Find All Numbers Disappeared in an Array

## 🧩 Problem Description

Given an array `nums` of `n` integers where `nums[i]` is in the range `[1, n]`, some elements appear twice and others appear once.

Return **all the integers in the range `[1, n]` that do not appear in `nums`**.

---
💡 Approach: In-Place Marking
We use the input array itself to mark visited numbers by negating the values at corresponding indices.

Steps:
Iterate through the array.

For each value val, mark nums[val - 1] as negative.

After that, iterate through the array again and collect indices where values are still positive — these indices + 1 are the missing numbers.

---

### Example

Input: nums = [4,3,2,7,8,2,3,1]
Step 1: After marking => [-4,-3,-2,-7,8,2,-3,-1]
Step 2: Positive values at indices 4 and 5 => Missing numbers = 5,6
