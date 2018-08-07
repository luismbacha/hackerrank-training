// https://www.hackerrank.com/challenges/java-2d-array

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        Boolean first = true;
        int sum = 0;
        for(int i = 0; i < 4; i++)
            for(int j = 0; j < 4; j++) {
                int hourglass = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                    + arr[i+1][j+1]
                    + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if(first) {
                    sum = hourglass;
                    first = false;
                }
                if(hourglass > sum)
                    sum = hourglass;
            }
        System.out.println(sum);
    }
}