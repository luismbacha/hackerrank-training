# https://www.hackerrank.com/challenges/find-angle/problem

import math
y = abs(int(input())); x = abs(int(input()))
print(int(round(math.degrees(math.atan2(y,x)))), "°", sep="")