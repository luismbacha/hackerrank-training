# https://www.hackerrank.com/challenges/standardize-mobile-number-using-decorators/problem

def wrapper(f):
    def fun(l):
        f(["+91 " + t[-10:-5] + " " + t[-5:] for t in l])
    return fun