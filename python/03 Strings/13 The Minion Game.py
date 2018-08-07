# https://www.hackerrank.com/challenges/the-minion-game/problem

def minion_game(string):
    stuart = kevin = 0
    for i in range(len(string)):
        if(string[i] in ('A', 'E', 'I', 'O', 'U')):
            kevin += len(string)-i
        else:
            stuart += len(string)-i
    if(kevin > stuart):
        print("Kevin", kevin)
    elif(stuart > kevin):
        print("Stuart", stuart)
    else:
        print("Draw")