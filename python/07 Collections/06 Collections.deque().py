# https://www.hackerrank.com/challenges/py-collections-deque/problem

from collections import deque
n = int(input())
d = deque()
for _ in range(n):
    i = list(input().split())
    if(i[0] == 'pop'): d.pop()
    elif(i[0] == 'popleft'): d.popleft()
    elif(i[0] == 'append'): d.append(int(i[1]))
    else: d.appendleft(int(i[1]))
print(*d)