// https://www.hackerrank.com/challenges/java-exception-handling-try-catch

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			int y = sc.nextInt();
			int result = x/y;
			System.out.println(result);
		} catch(InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		} catch(ArithmeticException e) {
			System.out.println("java.lang.ArithmeticException: / by zero");
		}
    }
}