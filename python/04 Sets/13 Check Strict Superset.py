# https://www.hackerrank.com/challenges/py-check-strict-superset/problem

A = set(map(int, input().split())); N = int(input())
isSss = True
i = 0
while(i < N) and (isSss):
    i += 1
    s = set(map(int, input().split()))
    isSss = (len(A.difference(s)) > 0) and (len(s.difference(A)) == 0)
print(isSss)