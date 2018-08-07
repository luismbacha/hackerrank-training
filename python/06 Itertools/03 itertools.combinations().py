# https://www.hackerrank.com/challenges/itertools-combinations/problem

from itertools import combinations
s, k = input().split()
s = ''.join(sorted(s))
for i in range(1, int(k)+1):
    for j in combinations(s, i):
        print(''.join(j))