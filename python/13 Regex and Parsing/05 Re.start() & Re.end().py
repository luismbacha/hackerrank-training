# https://www.hackerrank.com/challenges/re-start-re-end/problem

import re
s, p = input(), re.compile(input())
m = p.search(s)
if(m):
    while(m):
        print((m.start(), m.end() - 1))
        m = p.search(s, m.start() + 1)
else: print((-1,-1))