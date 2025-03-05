//Problem:Count distinct numbers on board(leetcode)
//https://leetcode.com/problems/count-distinct-numbers-on-board/description/
//Approach:Every number when divided by its previous number will give remainder 1.
class Solution {
    public int distinctIntegers(int n) {
        if(n==1){
            return 1;
        }
        return n-1;
    }
}
//TC=O(1)
//SC=O(1)



//Problem:chocolate distribution problem(gfg)
//https://www.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1
//Approach:First,sorted the array and took a window of size m,starting from 0th index and then kept shifting the window by 1 unit to find the minimum difference.
class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        Collections.sort(arr);
        int i=0,j=m-1,mindiff=Integer.MAX_VALUE;
        while(j<arr.size()){
            if(arr.get(j)-arr.get(i)<mindiff){
                 mindiff=arr.get(j)-arr.get(i);
            }
            i++;j++;
        }
        return mindiff;
    }
}
//TC:O(nlogn)
//SC:O(1)
