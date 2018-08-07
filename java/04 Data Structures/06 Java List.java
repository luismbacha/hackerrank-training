// https://www.hackerrank.com/challenges/java-list/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	int n = sc.nextInt();
    	for(int i=0; i<n; i++)
    		list.add(sc.nextInt());
    	int q = sc.nextInt();
    	for(int i=0; i<q; i++) {
    		sc.nextLine();
    		String action = sc.nextLine();
    		if(action.equals("Insert")) {
    			int x = sc.nextInt();
    			int y = sc.nextInt();
    			if(x >= list.size())
    				list.add(y);
    			else
    				list.add(x, y);
    		} else {
    			int x = sc.nextInt();
    			if((x>=0) && (x<list.size()))
    				list.remove(x);
    		}
    	}
    	for(int i=0; i<list.size(); i++)
    		System.out.print(list.get(i) + " ");
    }
}