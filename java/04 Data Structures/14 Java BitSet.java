// https://www.hackerrank.com/challenges/java-bitset/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	BitSet b1 = new BitSet(n);
    	BitSet b2 = new BitSet(n);
    	int[][] result = new int[m][2];
    	for(int i=0; i<m; i++) {
    		String op = sc.next();
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		if(op.equals("AND")) {
    			if(a == 1)
    				b1.and(b2);
    			else
    				b2.and(b1);
    		} else if(op.equals("OR")) {
    			if(a == 1)
    				b1.or(b2);
    			else
    				b2.or(b1);
    		} else if(op.equals("XOR")) {
    			if(a == 1)
    				b1.xor(b2);
    			else
    				b2.xor(b1);
    		} else if(op.equals("FLIP")) {
    			if(a == 1)
    				b1.flip(b);
    			else
    				b2.flip(b);
    		} else if(op.equals("SET")) {
    			if(a == 1)
    				b1.set(b);
    			else
    				b2.set(b);
    		}
    		result[i][0] = b1.cardinality();
    		result[i][1] = b2.cardinality();
    	}
    	for(int i=0; i<m; i++) {
    		System.out.println(result[i][0] + " " + result[i][1]);
    	}
    }
}