# https://www.hackerrank.com/challenges/iterables-and-iterators/problem

import itertools
n = int(input()); l = input().split(); k = int(input())
c = list(itertools.combinations(l, k))
a = filter(lambda x: 'a' in x, c)
print("{0:.3}".format(len(list(a))/len(c)))