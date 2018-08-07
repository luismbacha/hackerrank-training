# https://www.hackerrank.com/challenges/py-set-discard-remove-pop/problem

n = int(input())
s = set(map(int, input().split())) 
N = int(input())
for i in range(N):
    cmd = input().split()
    try:
        if(cmd[0] == "pop") : s.pop()
        elif(cmd[0] == "discard") : s.discard(int(cmd[1]))
        else : s.remove(int(cmd[1]))
    except KeyError:
        i = 0
print(sum(s))