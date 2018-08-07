# https://www.hackerrank.com/challenges/itertools-combinations-with-replacement/problem

from itertools import combinations_with_replacement
s, k = input().split()
s = ''.join(sorted(s))
for i in combinations_with_replacement(s, int(k)):
    print(''.join(i))