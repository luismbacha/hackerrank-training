# https://www.hackerrank.com/challenges/re-findall-re-finditer/problem

import re
m = re.findall(r"(?<=[QWRTYPSDFGHJKLZXCVBNMqwrtypsdfghjklzxcvbnm])[AEIOUaeiou]{2,}(?=[QWRTYPSDFGHJKLZXCVBNMqwrtypsdfghjklzxcvbnm])", input())
print(*m if m else [-1], sep='\n')