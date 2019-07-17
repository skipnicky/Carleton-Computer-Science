#################################
#NAME: Lily Inskip-Shesnicky
#STUDENT ID: 101115505
#COURSE: COMP-1405 B2
#FILE: t8p1.py
#DATE: 2018-11-11
##################################
import string as str

def lettercount(string):
    alpha = {}
    string = list(string.lower().replace(" ",""))
    string = [x for x in string if not x.isdigit() \
    and x not in str.punctuation]

    count = 0
    for i in string:
        if i in alpha:
             alpha[i] += 1
        else:
            alpha[i] = 1
    return(alpha)

again = True
while again:
    userStr = input("Enter something so I can count the letters:")
    print(lettercount(userStr))
    correctExit = False
    while correctExit != True:
        exit = input("Would you like to enter somethign else? (y/n)")
        if exit == 'y':
            correctExit = True
        elif exit == 'n':
            correctExit = True
            again = False
        else:
            print("Please enter y for yes or n for no.")
