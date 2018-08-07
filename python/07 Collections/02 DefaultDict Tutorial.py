# https://www.hackerrank.com/challenges/defaultdict-tutorial/problem

from collections import defaultdict
n, m = map(int, input().split())
a = defaultdict(list)
for i in range (n):
    a[input()].append(i+1)
for _ in range (m):
    b = input()
    if b in a:
        print(*a[b])
    else:
        print(-1)