# https://www.hackerrank.com/challenges/capitalize/problem

def capitalize(string):
    wasBlank = True
    result = ""
    for i in range(len(string)):
        if((wasBlank) and (string[i] != ' ')):
            result = result + string[i].upper()
            wasBlank = False
        else:
            if(string[i] == ' '):
                wasBlank = True
            result = result + string[i]
    return result