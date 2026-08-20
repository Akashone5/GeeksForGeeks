class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int low=0;
        int high=k-1;
        int sum=0;
        for(int i=low;i<=high;i++){
            sum=sum+arr[i];
        }
        int res=0;
        int n=arr.length;
        while(high<n){
          res=Math.max(sum,res);
          low++;
          high++;
          if(high==arr.length)break;
          sum=sum-arr[low-1]+arr[high];
        }
        return res;
    }
}