# https://www.hackerrank.com/challenges/np-transpose-and-flatten/problem

import numpy

N, M = map(int, input().split())
a = numpy.array([input().split() for _ in range(N)], int)
print(a.transpose())
print(a.flatten())