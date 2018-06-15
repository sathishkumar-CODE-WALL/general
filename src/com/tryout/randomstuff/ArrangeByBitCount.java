package com.tryout.randomstuff;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ArrangeByBitCount {
	
    /**
     * Complete the function below.
     * DONOT MODIFY anything outside this function!
     */
    static int[] rearrange(int[] elements) {
        
        if(elements.length==0||elements.length==1)
            return elements;
            
      	int bitCount=0;
    	Map<Integer,List<Integer>> countElementMap = new HashMap<Integer,List<Integer>>();
    	List<Integer> elementList = null;
    	List<Integer> resultList = new ArrayList<Integer>();
    	
    	
    	for(int index=0;index<elements.length;index++){
    		
    		bitCount=countONBits(elements[index]);
    		
    		if(countElementMap.get(bitCount)!= null){
    			elementList= countElementMap.get(bitCount);
    			elementList.add(elements[index]);
    			countElementMap.put(bitCount, elementList);
    		}else{
    			elementList= new ArrayList<Integer>();
    			elementList.add(elements[index]);
    			countElementMap.put(bitCount, elementList);
    		}
    	}
    	
    	Set<Integer> orderedBitCountSet = new TreeSet<>(countElementMap.keySet());
    	List<Integer> tempList = null;
    	for(Integer count :orderedBitCountSet){
    		tempList = countElementMap.get(count);
    		Collections.sort(tempList);
    		resultList.addAll(tempList);
    	}
    	
    	return resultList.stream().distinct().mapToInt(i->i).toArray();
        
    }
    
    static int countONBits(int n)
    {
        int count = 0;
        while (n > 0)
        {
            n &= (n - 1) ;
            count++;
        }
        return count;
    }
    

    /**
     * DO NOT MODIFY THIS METHOD!
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        
        int n = 0;
        n = Integer.parseInt(in.nextLine().trim());
        int[] elements = new int[n];
        int element;
        for (int i = 0; i < n; i++) {
            element = Integer.parseInt(in.nextLine().trim());
            elements[i] = element;
        }
        
        // call rearrange function
        int[] results = rearrange(elements);
        
        for (int i = 0; i < results.length; i++) {
            System.out.println(String.valueOf(results[i]));
        }
    }
}