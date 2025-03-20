//Problem:Longest Common Prfefix
//https://leetcode.com/problems/longest-common-prefix/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder();
        Arrays.sort(strs);
        char[] first=strs[0].toCharArray();
        char[] last=strs[strs.length-1].toCharArray();
        int i=0;
        while(i<first.length && i<last.length)
        if(first[i]==last[i]){
            sb.append(first[i]);
            i++;
        }
        else{
            break;
        }
        return sb.toString();
    }
}
//TC:O(nlogn+m)
//SC:O(m)


//Problem:Valid Anagram
//https://leetcode.com/problems/valid-anagram/
class Solution {
    public boolean isAnagram(String s, String t) {
HashMap<Character,Integer> map=new HashMap<>();
int i=0;
if (s.length() != t.length()) return false; 
  for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
while(i<t.length()){
    if(map.containsKey(t.charAt(i)))
    map.put(t.charAt(i),map.get(t.charAt(i))-1);
    else return false;
    i++;
}
for(int value:map.values()){
    if(value!=0)
    return false;
}
return true;
    }
}
//TC:o(n)
//SC:o(n)
