
💡 **Question 3**

Given two non-negative integers, num1 and num2 represented as string, return *the sum of* num1 *and* num2 *as a string*.

You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.

**Example 1:**

**Input:** num1 = "11", num2 = "123"

**Output:**

"134"



soln :

// time complexity :O(max(n1,n2));
// time complexity :O(max(n1,n2));


class Solution {
    public String addStrings(String num1, String num2) {
         int n1 = num1.length();
    int n2 = num2.length();
    int maxLength = Math.max(n1, n2);
    char[] result = new char[maxLength + 1];
    
    int carry = 0;
    int index = maxLength;
    
    for (int i = n1 - 1, j = n2 - 1; i >= 0 || j >= 0 || carry > 0; i--, j--) {
        int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
        int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;
        
        int sum = digit1 + digit2 + carry;
        int digit = sum % 10;
        carry = sum / 10;
        
        result[index] = (char) (digit + '0');
        index--;
    }
    
    if (carry > 0) {
        result[index] = (char) (carry + '0');
        index--;
    }
    
    return new String(result, index + 1, maxLength - index);
}
}