# https://www.hackerrank.com/challenges/python-lists/problem

if __name__ == '__main__':
    N = int(input())
    L = []
    for i in range (0, N) :
        line = str(input())
        values = line.split()
        if(values[0] == "insert") :
            L.insert(int(values[1]),int(values[2]))
        if(values[0] == "print") :
            print(L)
        if(values[0] == "remove") :
            L.remove(int(values[1]))
        if(values[0] == "append") :
            L.append(int(values[1]))
        if(values[0] == "sort") :
            L.sort()
        if(values[0] == "pop") :
            L.pop()
        if(values[0] == "reverse") :
            L.reverse()