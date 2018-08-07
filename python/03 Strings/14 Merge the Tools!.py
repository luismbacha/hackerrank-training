# https://www.hackerrank.com/challenges/merge-the-tools/problem

import textwrap

def merge_the_tools(string, k):
    l = textwrap.wrap(string, k)
    for s in l:
        print("".join([j for i,j in enumerate(s) if j not in s[:i]]))