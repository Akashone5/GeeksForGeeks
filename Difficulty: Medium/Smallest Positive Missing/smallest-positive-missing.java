class Solution {
    public int missingNumber(int[] arr) {
        // code here
        int n=arr.length;
        int t=1;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]==t){
                t++;
            }
            while(t<arr[n-1]){
                break;
            }
        }
        return t;
    }
}
