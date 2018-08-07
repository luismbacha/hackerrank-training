# https://www.hackerrank.com/challenges/validating-postalcode/problem

import re
print(bool(re.match(r'^(?!.*(.).\1.*(.).\2)(?!.*(.)(.)\3\4)[1-9]\d{5}$', input())))