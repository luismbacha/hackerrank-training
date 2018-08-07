# https://www.hackerrank.com/challenges/alphabet-rangoli/problem

import string
def print_rangoli(size):
    l = list(string.ascii_lowercase)[:size]
    r = l[1:]
    l.reverse()
    for i in range(size):
        print("-".join(l[:i+1] + r[size-1-i:]).center(size*4-3, "-"))
    for i in range(size-2, -1, -1):
        print("-".join(l[:i+1] + r[size-1-i:]).center(size*4-3, "-"))