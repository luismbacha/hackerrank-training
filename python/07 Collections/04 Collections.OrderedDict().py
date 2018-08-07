# https://www.hackerrank.com/challenges/py-collections-ordereddict/problem

from collections import OrderedDict
n = int(input())
items = OrderedDict()
for _ in range(n):
    i = input().rpartition(" ")
    if(i[0] in items):
        items[i[0]] += int(i[2])
    else:
        items[i[0]] = int(i[2])
for k, v in items.items():
    print(k, v)