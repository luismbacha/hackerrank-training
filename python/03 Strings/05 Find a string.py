# https://www.hackerrank.com/challenges/find-a-string/problem

def count_substring(string, sub_string):
    count = 0
    position = 0
    while (string[position:].find(sub_string) > -1):
        position = position + string[position:].find(sub_string) + 1
        count += 1
    return count