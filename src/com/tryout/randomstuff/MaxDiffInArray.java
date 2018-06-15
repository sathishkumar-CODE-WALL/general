package com.tryout.randomstuff;

public class MaxDiffInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,5,6,7,7};
		System.out.println(findMaxDiff(arr));
	}
	
	public static int findMaxDiff(int arr[]){
		int maxDiff=0;
		int minEle=arr[0];
		for(int i=0; i< arr.length; i++){
			if(arr[i]-minEle>maxDiff){
				maxDiff=arr[i]-minEle;
			}
			if(arr[i]<minEle){
				minEle=arr[i];
			}
		}
		
		return maxDiff;
	}

}
