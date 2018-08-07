// https://www.hackerrank.com/challenges/java-string-tokens/problem

import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if(s == null) System.out.println(0);
        else {
            if(s.trim().replaceAll("[^A-Za-z]+", "").length() == 0)
                System.out.println(0);
            else {
                s = s.trim();
                String[] tokens = s.split("[^A-Za-z]+");
                System.out.println(tokens.length);
                for (String token : tokens) {
                    System.out.println(token);
                }
            }
        }
        scan.close();
    }
}
