💡 **Question 5**

Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.

If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.

**Example 1:**

**Input:** s = "abcdefg", k = 2

**Output:**

"bacdfeg"

soln :// Time complexity :O(n)
      //space complexity :O(n)

class Solution {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
    int n = chars.length;
    
    for (int i = 0; i < n; i += 2 * k) {
        int start = i;
        int end = Math.min(i + k - 1, n - 1);
        reverseWord(chars, start, end);
    }
    
    return new String(chars);
}

private void reverseWord(char[] chars, int start, int end) {
    while (start < end) {
        char temp = chars[start];
        chars[start] = chars[end];
        chars[end] = temp;
        start++;
        end--;
    }
}
}