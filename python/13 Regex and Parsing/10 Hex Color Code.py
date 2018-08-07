# https://www.hackerrank.com/challenges/hex-color-code/problem

import re
p = re.compile(r'(?<=.)(#(?:[0-9a-fA-F]{3}){1,2})')
for _ in range(int(input())):
    r = p.findall(input())
    if(r): print(*r, sep="\n")