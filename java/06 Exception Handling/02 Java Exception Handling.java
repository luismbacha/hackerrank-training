// https://www.hackerrank.com/challenges/java-exception-handling/problem


class MyCalculator {
	public int power(int n, int p) throws Exception {
		if((n == 0) && (p == 0))
			throw new Exception("n and p should not be zero.");
		if((n < 0) || (p < 0))
			throw new Exception("n or p should not be negative.");
		double y = (double) n;
		double x = (double) p;
		return (int) Math.pow(y, x);
	}
}