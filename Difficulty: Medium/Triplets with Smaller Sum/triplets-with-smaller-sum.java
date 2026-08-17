class Solution {
    int countTriplets(int sum, int arr[]) {
        // code here
        
        int count=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int l=i+1;
        int r=arr.length-1;
        while(r>l){
            if((arr[i]+arr[l]+arr[r])>=sum){
                r--;
            }
            else {
                count=count+(r-l);
                l++;
            }
        }}
        return count;
    }
}