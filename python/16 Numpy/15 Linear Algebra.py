# https://www.hackerrank.com/challenges/np-linear-algebra/problem

import numpy
print(numpy.linalg.det(numpy.array([list(map(float, input().split())) for _ in range(int(input()))])))