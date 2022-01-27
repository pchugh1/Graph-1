// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No 


// Your code here along with comments explaining your approach

// Time Complexity : O(n) to traverse the array.
// Space Complexity :O(n) indegree array extra space required
class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==0) return -1;
        int [] degrees= new int[n];
        for( int [] edge: trust){
            degrees[edge[1]-1]++;
            degrees[edge[0]-1]--;
        }
        for(int i=0;i<degrees.length;i++){
            if(degrees[i]==n-1)
                return i+1;
        }
        return -1;
    }
}
