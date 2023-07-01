
💡 **Question 4**

Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

**Example 1:**

**Input:** s = "Let's take LeetCode contest"

**Output:** "s'teL ekat edoCteeL tsetnoc"

soln:  // Time complexity :O(n);
       //space complexity :O(n);
 

class Solution {
    public String reverseWords(String s) {
         char[] chars = s.toCharArray();
    int start = 0;
    int end = 0;

    while (end < chars.length) {
        if (chars[end] == ' ') {
            reverseWord(chars, start, end - 1);
            start = end + 1;
        }
        end++;
    }

    // Reverse the last word
    reverseWord(chars, start, end - 1);

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