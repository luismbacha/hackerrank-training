# https://www.hackerrank.com/challenges/introduction-to-regex/problem

import re
p = re.compile("^[\+-]?[0-9]*\.[0-9]+$")
for _ in range(int(input())):
    print(bool(p.match(input())))