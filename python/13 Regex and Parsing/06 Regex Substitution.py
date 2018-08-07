# https://www.hackerrank.com/challenges/re-sub-regex-substitution/problem

import re
p1 = re.compile(r'(?<= )&&(?= )')
p2 = re.compile(r'(?<= )\|\|(?= )')
for _ in range(int(input())):
    print(p1.sub("and", str(p2.sub("or", input()))))