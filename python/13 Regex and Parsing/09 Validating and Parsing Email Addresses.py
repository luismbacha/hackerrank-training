# https://www.hackerrank.com/challenges/validating-named-email-addresses/problem

import re
import email.utils
p = re.compile(r'^[A-Za-z](\w|-|\.|_)+@[A-Za-z]+\.[A-Za-z]{1,3}$')
for _ in range(int(input())):
    s = input()
    if(p.match(email.utils.parseaddr(s)[1])):
        print(s)