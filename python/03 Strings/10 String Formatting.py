# https://www.hackerrank.com/challenges/python-string-formatting/problem

def print_formatted(number):
    width = len("{0:b}".format(number))
    for i in range(1, number + 1):
        print((str(i)).rjust(width, " "), "{0:o}".format(i).rjust(width, " "), "{0:X}".format(i).rjust(width, " "), "{0:b}".format(i).rjust(width, " "))