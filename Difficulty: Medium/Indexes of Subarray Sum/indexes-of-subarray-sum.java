class Solution {
	static ArrayList<Integer> subarraySum(int[] arr, int target) {
		// code here
		int sum = 0;
		int j = arr.length;
		int start=0;
		ArrayList<Integer> aa=new ArrayList<>();
		for(int i=0;i<j;i++){
		sum=sum+arr[i];
	while(sum>target){
		    sum=sum-arr[start];
		    start++;
		    
		}
		if(sum==target){
		    aa.add(start+1);
		    aa.add(i+1);
		    return aa;
		}}
		aa.add(-1);
		return aa;
		
		
		
	}
}
