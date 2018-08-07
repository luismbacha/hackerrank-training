// https://www.hackerrank.com/challenges/java-md5/problem

import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.security.MessageDigest;

public class Solution {

    public static void main(String[] args) {
        try {
        	MessageDigest md = MessageDigest.getInstance("MD5");
	        Scanner sc = new Scanner(System.in);
	        String input = sc.next();
	        sc.close();
	        byte[] messageDigest = md.digest(input.getBytes());
	        BigInteger number = new BigInteger(1, messageDigest);
	        String hashtext = number.toString(16);
	        while(hashtext.length()<32)
	        	hashtext = "0" + hashtext;
	        System.out.println(hashtext);
        } catch(Exception e) {}
    }
}