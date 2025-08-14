name: Reverse Linked List – Java Implementation
description: |
  This repository contains a Java implementation to reverse a singly linked list.
  The solution uses an iterative approach with constant space complexity.

problem_statement: |
  Given the head of a singly linked list, reverse the list and return the new head.

  Example:
    Input:  1 → 2 → 3 → 4 → 5 → null
    Output: 5 → 4 → 3 → 2 → 1 → null

approach:
  steps:
    - Use three pointers: previous, current, and t (traversal pointer).
    - Iterate through the list, reversing the next pointer of each node.
    - Finally, return the new head (previous).
  complexity:
    time: "O(n) — traverses each node once."
    space: "O(1) — no extra data structures used."

process_diagram: |
  Initial:
  prev   curr
  null   1 → 2 → 3 → 4 → 5 → null

  Step 1:
  null ← 1   2 → 3 → 4 → 5 → null
         ↑prev   ↑curr

  Step 2:
  null ← 1 ← 2   3 → 4 → 5 → null
              ↑prev   ↑curr

  Step 3:
  null ← 1 ← 2 ← 3   4 → 5 → null
                   ↑prev   ↑curr

  Step 4:
  null ← 1 ← 2 ← 3 ← 4   5 → null
                        ↑prev   ↑curr

  Step 5:
  null ← 1 ← 2 ← 3 ← 4 ← 5
                             ↑prev   ↑curr=null

code: |
  class Solution {
      public ListNode reverseList(ListNode head) {
          ListNode t = head;
          ListNode current = null;
          ListNode previous = null;

          while (t != null) {
              current = t.next;
              t.next = previous;
              previous = t;
              t = current;
          }

          head = previous;
          return head;     
      }
  }

how_to_run:
  - step: Clone the repository
    command: git clone <repo-url>
  - step: Compile the Java file
    command: javac Solution.java
  - step: Run the program
    command: java Solution
