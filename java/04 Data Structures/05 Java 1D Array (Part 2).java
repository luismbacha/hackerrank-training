// https://www.hackerrank.com/challenges/java-1d-array/problem

import java.util.*;

public class Solution {
	private static boolean canWin(int i, int leap, int[] game) {
		if(((i+leap) >= game.length) || (i >= game.length - 1))
			return true;
		game[i] = 1;
		if(((game[i+1] !=1) && (canWin(i+1, leap, game))) ||
			((leap>1) && (game[i+leap] != 1) && (canWin(i+leap, leap, game))) ||
			((i>0) && (game[i-1] != 1) && canWin(i-1, leap, game)))
			return true;
		return false;
	}
	
    public static boolean canWin( int leap, int[] game) {
    	return canWin(0, leap, game);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}