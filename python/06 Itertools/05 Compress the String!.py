# https://www.hackerrank.com/challenges/compress-the-string/problem

from itertools import groupby
s = input()
l = []
for k, g in groupby(s):
    l.append((len(list(g)), int(k)))
print(*l)