// https://www.hackerrank.com/challenges/java-lambda-expressions/problem

    public PerformOperation isOdd() {
		return (int a) -> (a % 2 == 0) ? false : true;
	}

	public PerformOperation isPrime() {
		return
				(int a) -> {
                    if(a==2) return true;
					if((a%2==0) || (a==0) || (a==1)) return false;
					for(int i=3; i*i<=a; i+=2)
						if(a%i==0)
							return false;
					return true;
				};
	}
	
	public PerformOperation isPalindrome() {
		return
				(int a) -> {
					char[] n = String.valueOf(a).toCharArray();
					int i1 = 0;
					int i2 = n.length - 1;
					while(i2>i1) {
						if(n[i1] != n[i2]) return false;
						++i1;
						--i2;
					}
					return true;
				};
	}
}