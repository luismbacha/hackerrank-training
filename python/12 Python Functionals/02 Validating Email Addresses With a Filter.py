# https://www.hackerrank.com/challenges/validate-list-of-email-address-with-filter/problem

import re
p = re.compile('^([a-zA-Z0-9_-])+@([a-zA-Z0-9])+\.[a-zA-Z]{1,3}$')

def fun(s):
    return p.fullmatch(s) != None