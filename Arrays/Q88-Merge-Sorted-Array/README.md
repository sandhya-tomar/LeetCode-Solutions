# Merge Sorted Array

This repository contains a Java solution to merge two sorted integer arrays into one sorted array. The merged result is stored in the first array (`nums1`), which has enough space to hold elements from both arrays.

## 🧩 Problem Statement

You are given two integer arrays `nums1` and `nums2`, sorted in non-decreasing order, and two integers `m` and `n` representing the number of valid elements in `nums1` and `nums2`, respectively.

**Merge `nums2` into `nums1` as one sorted array.**

The final sorted array should not be returned by the function, but instead stored inside the array `nums1`. To accommodate this, `nums1` has a length of `m + n`, with the last `n` elements set to `0`, which should be ignored.

## 🛠️ Example

```java
Input: 
nums1 = [1,2,3,0,0,0], m = 3  
nums2 = [2,5,6], n = 3

Output: 
nums1 = [1,2,2,3,5,6]

---

🚀 Approach
This solution creates a temporary array nums3 and performs a two-pointer merge:

Traverse both nums1 and nums2 using indices i and j.

Compare the current elements of both arrays and add the smaller one to nums3.

Once one array is exhausted, copy the remaining elements from the other.

Copy the merged result back into nums1.