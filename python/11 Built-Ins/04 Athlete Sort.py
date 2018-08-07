# https://www.hackerrank.com/challenges/python-sort-sort/problem

n, m = map(int, input().split())
t = [tuple(map(int, input().split())) for _ in range(n)]
k = int(input())
for r in sorted(t, key=lambda x: x[k]):
    print(*r)