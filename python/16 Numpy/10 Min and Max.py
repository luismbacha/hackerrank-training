# https://www.hackerrank.com/challenges/np-min-and-max/problem

import numpy
n, m = map(int, input().split())
print(numpy.max(numpy.min(numpy.array([list(map(int, input().split())) for _ in range(m)]), axis=1)))