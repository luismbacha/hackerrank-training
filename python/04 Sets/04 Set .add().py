# https://www.hackerrank.com/challenges/py-set-add/problem

n = int(input())
s = set()
for i in range(n):
    s.add(str(input()))
print(len(s))