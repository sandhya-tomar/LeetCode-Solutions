# 704. Binary Search

**Leetcode Link:** [704. Binary Search](https://leetcode.com/problems/binary-search/)  
**Level:** Easy  
**Topic:** Binary Search, Array

---

## ❓ Problem Statement

Given an array of integers `nums` which is sorted in ascending order, and an integer `target`, write a function to search for `target` in `nums`.  
If the target exists, return its index. Otherwise, return `-1`.

You must write an algorithm with **O(log n)** runtime complexity.

---

## ✅ Example 1

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4


---

## ✅ Example 2

Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums



---

## 💡 Intuition

Binary search is the most efficient way to search in a **sorted array**, by repeatedly dividing the search space in half.

---

## 🧠 Approach

1. Initialize two pointers: `first` and `last` for the bounds of the array.
2. Use a loop to compute the middle index.
3. If `nums[mid] == target`, return `mid`.
4. If `nums[mid] < target`, search the right half (`first = mid + 1`).
5. If `nums[mid] > target`, search the left half (`last = mid - 1`).
6. If the loop ends with no match, return `-1`.

---

## ⏱️ Complexity

- **Time Complexity:** `O(log n)` — Halves the search space each time.
- **Space Complexity:** `O(1)` — No extra space used.

---

## 📝 Notes

- `mid = first + (last - first) / 2` avoids integer overflow.
- This is a classic problem and a foundation for more advanced ones like:
  - Search in Rotated Sorted Array
  - Find Peak Element
  - Binary Search on Answer

---

## 💻 Code (Java)

```java
class Solution {
    public int search(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;

        while (first <= last) {
            int mid = first + (last - first) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }

        return -1;
    }
}
