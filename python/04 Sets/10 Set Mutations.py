# https://www.hackerrank.com/challenges/py-set-mutations/problem

input()
A = set(map(int, input().split()))
N = int(input())
for i in range(N):
    cmd, k = input().split()
    s = set(map(int, input().split()))
    eval('A.' + cmd + '(s)')
print(sum(A))