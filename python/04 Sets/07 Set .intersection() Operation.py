# https://www.hackerrank.com/challenges/py-set-intersection-operation/problem

input()
e = set(map(int, input().split()))
input()
f = set(map(int, input().split()))
print(len(e.intersection(f)))