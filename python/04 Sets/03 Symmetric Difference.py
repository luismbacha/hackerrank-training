# https://www.hackerrank.com/challenges/symmetric-difference/problem

s1 = map(int, input())
a = set(map(int, input().split()))
s2 = map(int,input())
b = set(map(int, input().split()))
l = list(a.difference(b).union(b.difference(a)))
l.sort()
for i in l:
    print(i)