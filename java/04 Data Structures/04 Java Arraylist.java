// https://www.hackerrank.com/challenges/java-arraylist/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.nextLine();
        ArrayList<String[]> arrays = new ArrayList<String[]>();
        for(int i = 0; i < k; i++) {
            String line = sc.nextLine();
            arrays.add(line.split(" "));
        }
        k = sc.nextInt();
        for(int i = 0; i < k; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            try {
                System.out.println((arrays.get(x-1))[y]);
            } catch(IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
    }
}