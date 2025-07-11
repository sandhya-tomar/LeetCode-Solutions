# Happy Number

A **Happy Number** is a number defined by the following process:

1. Starting with any positive integer, replace the number with the **sum of the squares of its digits**.
2. Repeat the process until the number **equals 1** (where it will stay), or it **loops endlessly in a cycle** which does not include 1.
3. A number for which this process ends in 1 is called a **happy number**.

---

## ✅ Example

Input: `n = 19`

Explanation:
1² + 9² = 82
8² + 2² = 68
6² + 8² = 100
1² + 0² + 0² = 1 → ✅ Happy Number

---

## ❌ Unhappy Number Example

Input: `n = 2`

Explanation:
2² = 4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4 (cycle)
→ ❌ Not a Happy Number

---

## 🔁 Known Unhappy Cycle

All unhappy numbers eventually fall into this loop:
4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4

---

## 🧠 Approach

### Method 1: HashSet (to detect cycles)
- Use a `HashSet` to track seen numbers.
- If a number repeats, a cycle is detected → return false.
- If the number becomes `1`, return true.

### Method 2: Shortcut (Check for `n == 4`)
- Some implementations use the known fact that all unhappy numbers fall into a cycle starting at `4`.
- So, if `n` ever becomes `4`, return false.
