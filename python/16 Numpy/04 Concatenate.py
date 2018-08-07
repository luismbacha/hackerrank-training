# https://www.hackerrank.com/challenges/np-concatenate/problem

import numpy
N, M, P = map(int, input().split())
nArray = []
mArray = []
for i in range(N):
    temp = list(map(int, input().split()))
    nArray.append(temp)
for i in range(M):
    temp = list(map(int, input().split()))
    mArray.append(temp)
print( numpy.concatenate( (nArray, mArray), axis = 0 ) )