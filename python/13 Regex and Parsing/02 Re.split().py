# https://www.hackerrank.com/challenges/re-split/problem

import re
print(*filter(None, re.split("[,\.]", input())), sep="\n")