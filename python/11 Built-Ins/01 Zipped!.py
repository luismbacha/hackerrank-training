# https://www.hackerrank.com/challenges/zipped/problem

n, x = map(int, input().split())
a = []
for _ in range(x):
    a += [list(map(float, input().split()))]
print(*[sum(i)/x for i in zip(*a)], sep="\n")