# https://www.hackerrank.com/challenges/word-order/problem

from collections import OrderedDict
n = int(input())
words = OrderedDict()
for _ in range(n):
    word = input()
    if(word in words):
        words[word] += 1
    else:
        words[word] = 1
print(len(words))
print(*[v for (k, v) in words.items()])