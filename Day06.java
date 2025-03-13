//Problem:Most visited sector in circular track
//https://leetcode.com/problems/most-visited-sector-in-a-circular-track/?envType=problem-list-v2&envId=array
//Approach:created an array arr and traversed through the rounds array and kept incrementing the (sector-1)th index of arr whenever it was visited and finally checked for the maximum value in arr and 
//added it to the list ans.
class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        int[]arr=new int[n];
        List<Integer> ans=new ArrayList<>();
        int i=0,j,k;
        while(i<rounds.length-1){           
                j=rounds[i];
            if(rounds[i]<rounds[i+1]){
                while(j<rounds[i+1]){
                    arr[j-1]++;
                    j++;
                }
            }
            else{
                 k=1;
                while(j<=n){
                    arr[j-1]++;
                    j++;
                }
                while(k<rounds[i+1]){
                    arr[k-1]++;
                    k++;
                }
            }
            i++;
        }
        arr[rounds[rounds.length-1]-1]++;
        int max=Integer.MIN_VALUE;
        for(i=0;i<n;i++){
            if(arr[i]>max){
                ans.clear();
                ans.add(i+1);
                max=arr[i];
            }
            else if(arr[i]==max){
                ans.add(i+1);
            }
        }
        return ans;
    }
}
//TC:O(nm)
//SC:O(n)
