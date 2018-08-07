// https://www.hackerrank.com/challenges/java-negative-subarray/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int count = 0;
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if(a[i] < 0) count++;
        }
        for(int i = 0; i < n-1; i++) {
            for(int j = i+1; j < n; j++) {
                int sum = 0;
                for(int k = i; k <= j; k++)
                    sum = sum + a[k];
                if(sum < 0) count++;
            }
        }
        System.out.println(count);
    }
}