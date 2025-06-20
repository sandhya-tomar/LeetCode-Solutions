# Contains Duplicate

## Problem Statement

Given an integer array `nums`, return `true` if any value appears **at least twice** in the array, and return `false` if every element is **distinct**.

This is a common problem in coding interviews and competitive programming that tests your understanding of data structures and time complexity.

## Solution Overview

This solution is implemented in Java using a `HashSet` to efficiently track the elements we've seen so far. By checking each element against the set, we can determine if a duplicate exists in **linear time**.

### Time and Space Complexity

- **Time Complexity**: O(n), where n is the number of elements in the array.
- **Space Complexity**: O(n), in the worst case, if there are no duplicates.


