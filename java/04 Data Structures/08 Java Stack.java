// https://www.hackerrank.com/challenges/java-stack/problem

import java.util.*;
class Solution{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      
      while (sc.hasNext()) {
         String input=sc.next();
          ArrayList<Character> stack = new ArrayList<Character>();
          for(int i=0; i<input.length(); i++) {
        	  char p = input.charAt(i);
        	  if(stack.size() > 0) {
        		  char l = stack.get(stack.size()-1);
        		  if(((p == '}') && (l == '{')) ||
        			((p == ')') && (l == '(')) ||
          			((p == ']') && (l == '[')))
        			  stack.remove(stack.size()-1);
        		  else
        			  stack.add(p);
        	  } else
        		  stack.add(p);
          }
          System.out.println(!(stack.size() > 0));
      }
      
   }
}