# https://www.hackerrank.com/challenges/piling-up/problem

from collections import deque
for _ in range(int(input())):
    input()
    d = deque(map(int,input().split()))
    while len(d) > 0:
        if(len(d) == 1):
            print("Yes")
            break
        elif(d[0] >= d[-1]):
            if(d[0] >= d[1]):
                d.popleft()
            else:
                print("No")
                break
        else:
            if(d[-1] >= d[-2]):
                d.pop()
            else:
                print("No")
                break