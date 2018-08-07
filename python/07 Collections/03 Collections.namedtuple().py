# https://www.hackerrank.com/challenges/py-collections-namedtuple/problem

from collections import namedtuple
n = int(input())
Student = namedtuple('Student', input().strip().split())
print("{0:.2f}".format(sum([int(Student(*input().strip().split()).MARKS) for _ in range(n)])/n))