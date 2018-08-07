# https://www.hackerrank.com/challenges/string-validators/problem

if __name__ == '__main__':
    s = input()
    isalnum = isalpha = isdigit = islower = isupper = False
    for i in range(len(s)):
        isalnum = isalnum or s[i].isalnum()
        isalpha = isalpha or s[i].isalpha()
        isdigit = isdigit or s[i].isdigit()
        islower = islower or s[i].islower()
        isupper = isupper or s[i].isupper()
    print('%r\n%r\n%r\n%r\n%r' % (isalnum,isalpha,isdigit,islower,isupper))