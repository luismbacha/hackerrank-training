// https://www.hackerrank.com/challenges/simple-addition-varargs/problem

class Add {
	public void add(int... integers) {
		int sum = 0;
		boolean isFirst = true;
		for(int i : integers) {
			if(isFirst)
				isFirst = false;
			else
				System.out.print("+");
			sum += i;
			System.out.print(i);
		}
		System.out.println("=" + sum);
	}
}