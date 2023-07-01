
💡 **Question 6**

Given two strings s and goal, return true *if and only if* s *can become* goal *after some number of **shifts** on* s.

A **shift** on s consists of moving the leftmost character of s to the rightmost position.

- For example, if s = "abcde", then it will be "bcdea" after one shift.

**Example 1:**

**Input:** s = "abcde", goal = "cdeab"

**Output:**

true

soln : //Time complexity :O(n)
       //space complexity :O(n)

class Solution {
    public boolean rotateString(String s, String goal) {
    if (s.length() != goal.length()) {
        return false;
    }
    
    String concatenated = s + s;
    return concatenated.contains(goal);
}
}