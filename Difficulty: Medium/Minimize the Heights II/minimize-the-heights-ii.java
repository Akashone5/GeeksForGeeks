class Solution {
    public int getMinDiff(int[] arr, int k) {
        int n=arr.length;
        Arrays.sort(arr);
      int min=arr[0];
      int max=arr[n-1];
      int ans=max-min;
           for(int i=1;i<n;i++){
               if(arr[i]-k<0){
                   continue;
               }
             min=Math.min(arr[0]+k,arr[i]-k);
             max=Math.max(arr[n-1]-k,arr[i-1]+k)  ;
             ans=Math.min(max-min,ans);
               
           }
     return ans;
    }
}
