package com.tryout.randomstuff;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EligiblePairsFrmArray {

    /*
     * Complete the function below.
     */
    static int kDifference(int[] a, int k) {
        
        if(a.length==0 || a.length==1){
            return 0;
        }
        int diffCount=0;
        Map<Integer, Integer> tempMap = new HashMap<Integer,Integer>();
        //populate hashmap
        for(int index=0; index<a.length; index++){
            tempMap.put(a[index],1);    
        }
        
        for(int index=0; index<a.length; index++){
            if(tempMap.get(a[index]+k) !=null)
                diffCount++;
            if(tempMap.get(a[index]-k) !=null)
                diffCount++;
        }
        
        if(diffCount>1 && diffCount %2==0)
            return diffCount/2;
        else if(diffCount%2!=0)
            return (diffCount/2)+1;
        else
            return diffCount;

    }
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = null;
        if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        int res;
        int a_size = 0;
        a_size = Integer.parseInt(in.nextLine().trim());

        int[] a = new int[a_size];
        for(int i = 0; i < a_size; i++) {
            int a_item;
            a_item = Integer.parseInt(in.nextLine().trim());
            a[i] = a_item;
        }

        int k;
        k = Integer.parseInt(in.nextLine().trim());

        res = kDifference(a, k);
        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();
    }
}
