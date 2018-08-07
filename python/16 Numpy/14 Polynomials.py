# https://www.hackerrank.com/challenges/np-polynomials/problem

import numpy
a = numpy.array(input().split(), float)
x = float(input())
print(numpy.polyval(a, x))