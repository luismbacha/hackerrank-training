# https://www.hackerrank.com/challenges/map-and-lambda-expression/problem

cube = lambda x: x**3

def fibonacci(n):
    l = []
    for i in range(n):
        if(i == 0):
            l.append(0)
        elif(i == 1):
            l.append(1)
        elif(i > 1):
            l.append(l[i-1] + l[i-2])
    return(l)