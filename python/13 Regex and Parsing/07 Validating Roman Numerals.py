# https://www.hackerrank.com/challenges/validate-a-roman-number/problem

import re
p = re.compile(r'^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$')
print(True if p.search(input()) else False)