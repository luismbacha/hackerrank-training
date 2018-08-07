# https://www.hackerrank.com/challenges/write-a-function/problem

def is_leap(year):
    leap = False
    
    if(year%4==0) :
        if((year>=100) and (year%100==0)):
            if((year>=400) and (year%400==0)) : leap = True
        else :
            leap = True
    
    return leap