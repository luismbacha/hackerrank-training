# https://www.hackerrank.com/challenges/validating-uid/problem

import re
valid = re.compile(r'^(?=.*[A-Z].*[A-Z])(?=.*[0-9].*[0-9].*[0-9])([a-zA-Z0-9]{10})')
invalid = re.compile(r'(.).*\1')
for _ in range(int(input())):
    s = input()
    print("Valid" if valid.search(s) and not invalid.search(s) else "Invalid")