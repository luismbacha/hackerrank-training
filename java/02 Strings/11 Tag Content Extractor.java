// https://www.hackerrank.com/challenges/tag-content-extractor/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
   public static void main(String[] args){
      
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      while(testCases>0){
          String line = in.nextLine();
          Pattern p = Pattern.compile("(<([^<\\/]+?)>)([^<>]+?)(<\\/\\2>)");
          Matcher m = p.matcher(line);
          if(!m.find())
              System.out.println("None");
          else {
              do {
                  System.out.println(m.group(3));
              } while(m.find());
          }
          testCases--;
      }
   }
}