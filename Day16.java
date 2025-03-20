bonus problem
// problem 1:https://leetcode.com/problems/rotate-array/description/
class Solution {
    public void rotate(int[] nums, int k) {
        int numsSize=nums.length,i;
        int arr[]=new int[numsSize];
        while(numsSize<k){
            k-=numsSize;
        }
        if(numsSize>k){
            for(i=0;i<numsSize-k;i++){
                arr[k+i]=nums[i];
    }
            for(i=0;i<k;i++){
                arr[i]=nums[numsSize-k+i];
    }
        for(i=0;i<numsSize;i++){
                nums[i]=arr[i];
    }
        }
    }
}
sc:O(n)
tc:O(n)
  approach: created a new array and store value before k and after k
// problem 2:https://leetcode.com/problems/first-unique-character-in-a-string/description/
class Solution {
    public int firstUniqChar(String s) {
        int arr[]=new int [26];
        int i;
        for(i=0;i<s.length();i++){
            int x=s.charAt(i)-'a';
            arr[x]++;
        }
        for(i=0;i<s.length();i++){
            if(arr[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
sc:O(n)
tc:O(n)
  approach: created an array of size 26 and store the frequency of each character.
