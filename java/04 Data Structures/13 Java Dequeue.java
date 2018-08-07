// https://www.hackerrank.com/challenges/java-dequeue/problem

import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int unique = 0;
        int first;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            set.add(num);
            if(deque.size() > m) {
            	first = deque.removeFirst();
            	if(!deque.contains(first))
            		set.remove(first);
            }
            if(set.size() > unique)
            	unique = set.size();
        }
        System.out.println(unique);
        in.close();
    }
}