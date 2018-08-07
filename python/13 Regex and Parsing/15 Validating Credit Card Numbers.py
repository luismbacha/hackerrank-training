# https://www.hackerrank.com/challenges/validating-credit-card-number/problem

import re
p = re.compile(
    r"^"
    r"(?!.*(\d)(-?\1){3})"
    r"[456]"
    r"\d{3}"
    r"(?:-?\d{4}){3}"
    r"$"
)
for _ in range(int(input())):
    print("Valid" if p.search(input()) else "Invalid")