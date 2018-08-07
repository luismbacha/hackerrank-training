// https://www.hackerrank.com/challenges/prime-checker/problem

import static java.lang.System.in;

class Prime {
	public void checkPrime(int... numbers) {
		String result = "";
		for(int n : numbers) {
			boolean isPrime = true;
			if(n==1)
				isPrime = false;
			else if(n!=2)
				if(n%2==0)
					isPrime = false;
				else
					for(int i=3; i*i<=n; i+=2)
						if(n%i==0) {
							isPrime = false;
							break;
						}
			if(isPrime)
				result = result + n + " ";
		}
		System.out.println(result);
	}
}