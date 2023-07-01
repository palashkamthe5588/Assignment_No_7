
💡 **Question 7**

Given two strings s and t, return true *if they are equal when both are typed into empty text editors*. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

**Example 1:**

**Input:** s = "ab#c", t = "ad#c"

**Output:** true

**Explanation:**

Both s and t become "ac".

soln : //Time complexity :O(n)
       //space complexity:O(n)
 
class Solution {
    public boolean backspaceCompare(String s, String t) {
          return buildString(s).equals(buildString(t));
}

private String buildString(String str) {
    StringBuilder sb = new StringBuilder();

    for (char c : str.toCharArray()) {
        if (c != '#') {
            sb.append(c);
        } else if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    return sb.toString();
}
    }
