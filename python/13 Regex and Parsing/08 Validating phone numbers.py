# https://www.hackerrank.com/challenges/validating-the-phone-number/problem

import re
p = re.compile(r'^[789]\d{9}$')
for _ in range(int(input())):
    m = p.match(input())
    print('YES' if m else 'NO')