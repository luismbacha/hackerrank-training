# https://www.hackerrank.com/challenges/maximize-it/problem

import itertools
K, M = map(int, input().split())
N = (list(map(int,input().split()))[1:] for _ in range(K))
print(max(map(lambda x : (sum(i**2 for i in x)%M), itertools.product(*N))))