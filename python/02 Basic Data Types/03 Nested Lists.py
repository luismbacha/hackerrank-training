# https://www.hackerrank.com/challenges/nested-list/problem

if __name__ == '__main__':
    students = []
    lowest = None
    sLowest = None
    for _ in range(int(input())):
        name = input()
        score = float(input())
        students.append([name, score])
        if(lowest == None) : lowest = score
        elif((sLowest == None) and (lowest != score)):
            if(lowest > score) :
                sLowest = lowest
                lowest = score
            else : sLowest = score
        elif(sLowest != None):
            if(score < lowest) :
                sLowest = lowest
                lowest = score
            elif((score < sLowest) and (score != lowest)) : sLowest = score
    students.sort()
    for i in range(len(students)):
        if(students[i][1] == sLowest):
            print(students[i][0])