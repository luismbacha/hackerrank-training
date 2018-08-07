# https://www.hackerrank.com/challenges/matrix-script/problem

#!/bin/python3

import sys
import re

n, m = map(int, input().strip().split())
matrix = [""] * m
for _ in range(n):
    s = input()
    for i in range(m - len(s)):
        s += " "
    for i in range(m):
        matrix[i] += s[i]
    s = "".join(matrix)
print(re.sub(r'(?<=[A-Za-z0-9])[^A-Za-z0-9]+(?=[A-Za-z0-9])', " ", s))