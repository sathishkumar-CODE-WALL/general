package com.tryout.randomstuff;

public class MinimalReplaceSolution {
	
	static int[] minimalOperations(String[] words) {
		
		if(words == null){
			return null;
		}
		int[] replaceCountArr= new int[words.length];
		int index=0;
		
		for(String word: words){
			char[] chars=word.toCharArray();
			int replaceCount=0;
			for(int i=0;i<chars.length;i++){
				if(i+1 <chars.length && chars[i]==chars[i+1]){
					replaceCount++;
				}
				if(i+2<chars.length && chars[i+2]==chars[i+1] && chars[i+1]==chars[i]){
					i++;
				}
			}
			replaceCountArr[index]=replaceCount;
			index++;
		}
		return replaceCountArr;

    }
	
 public static void main(String args[]){
	 String[] words = {"bbbb", "abaa"};
	 System.out.print(minimalOperations(words).toString());
 }

}
