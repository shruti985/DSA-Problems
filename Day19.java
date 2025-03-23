//Problem:Maximum nesting depth
//https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
        class Solution {
    public int maxDepth(String s) {
        int depth = 0, maxDepth = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                depth++;
                maxDepth = Math.max(maxDepth, depth);
            } else if (c == ')') {
                depth--;
            }
        }
        
        return maxDepth;
    }
        }
//Problem:Roman to Integer
//https://leetcode.com/problems/roman-to-integer/description/
class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int total = 0;
        int prevValue = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = romanMap.get(s.charAt(i));

            if (currValue < prevValue) {
                total -= currValue;
            } else {
                total += currValue; 
            }
            prevValue = currValue;
        }
        return total;
    }
}

 
