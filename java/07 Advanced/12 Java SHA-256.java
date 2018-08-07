// https://www.hackerrank.com/challenges/sha-256/problem

import java.util.*;
import java.security.MessageDigest;

public class Solution {

    public static void main(String[] args) {
        try {
        	MessageDigest md = MessageDigest.getInstance("SHA-256");
	        Scanner sc = new Scanner(System.in);
	        String input = sc.next();
	        sc.close();
	        byte[] messageDigest = md.digest(input.getBytes());
	        StringBuffer hashtext = new StringBuffer();
	        for(int i=0; i<messageDigest.length; i++)
	        	hashtext.append(Integer.toString((messageDigest[i] & 0xff) + 0x100, 16).substring(1));
	        System.out.println(hashtext);
        } catch(Exception e) {}
    }
}