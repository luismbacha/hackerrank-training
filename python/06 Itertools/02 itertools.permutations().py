# https://www.hackerrank.com/challenges/itertools-permutations/problem

from itertools import permutations
s, n = input().split()
n = int(n)
l = list(permutations(s, n))
l.sort()
for i in range(len(l)):
    print(*l[i], sep="")