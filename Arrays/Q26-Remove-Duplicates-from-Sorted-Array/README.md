# 🚫 Remove Duplicates from Sorted Array

## 📝 Problem Statement

Given a **sorted integer array** `nums`, remove the **duplicates in-place** such that each element appears only **once** and return the new length.

Do **not** allocate extra space; modify the input array in-place with **O(1)** extra memory.

---

## 📌 Example

### Example 1:
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]


### Example 2:
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,,,,,_]


(Underscores `_` indicate values beyond the new length which are not important)

---

## ✅ Constraints
- `1 <= nums.length <= 3 * 10^4`
- `-100 <= nums[i] <= 100`
- `nums` is sorted in **non-decreasing** order

---

## 💡 Approach

- Use the **two-pointer technique**.
- `ans` (or write pointer) keeps track of where to place the next unique number.
- Iterate from the second element:
  - If `nums[i] != nums[i-1]`, it's a unique number.
  - Place it at `nums[ans]` and increment `ans`.

This modifies the array **in-place** and ensures the first `ans` elements are unique.