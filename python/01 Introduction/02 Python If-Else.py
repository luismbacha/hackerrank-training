# https://www.hackerrank.com/challenges/py-if-else/problem

if __name__ == '__main__':
    n = int(raw_input())
    if (n%2 == 0) and ((n>20) or ((n>2) and (n<5))) : print "Not Weird"
    else : print "Weird"