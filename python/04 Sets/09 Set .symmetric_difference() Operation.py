# https://www.hackerrank.com/challenges/py-set-symmetric-difference-operation/problem

input()
e = set(map(int, input().split()))
input()
f = set(map(int, input().split()))
print(len(e.symmetric_difference(f)))