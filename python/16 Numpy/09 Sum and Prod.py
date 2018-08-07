# https://www.hackerrank.com/challenges/np-sum-and-prod/problem

import numpy
n, m = map(int, input().split())
print(numpy.prod(numpy.sum(numpy.array([list(map(int, input().split())) for _ in range(m)]), axis=0)))