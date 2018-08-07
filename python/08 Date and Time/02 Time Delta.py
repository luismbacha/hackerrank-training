# https://www.hackerrank.com/challenges/python-time-delta/problem

#!/bin/python3

import sys
from datetime import datetime, time

def time_delta(t1, t2):
    f = '%a %d %b %Y %H:%M:%S %z'
    return int(abs((datetime.strptime(t1, f) - datetime.strptime(t2, f)).total_seconds()))

if __name__ == "__main__":
    t = int(input().strip())
    for a0 in range(t):
        t1 = input().strip()
        t2 = input().strip()
        delta = time_delta(t1, t2)
        print(delta)