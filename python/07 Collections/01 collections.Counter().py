# https://www.hackerrank.com/challenges/collections-counter/problem

from collections import Counter
X = int(input())
shoes = Counter(map(int, input().split()))
N = int(input())
earnings = 0
for _ in range(N):
    size, price = map(int, input().split())
    if(shoes[size] > 0):
        shoes[size] -= 1
        earnings += price
        X -= 1
        if(X <= 0):
            print(earnings)
            quit()
print(earnings)