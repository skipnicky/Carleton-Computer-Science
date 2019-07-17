#################################
#NAME: Lily Inskip-Shesnicky
#STUDENT ID: 101115505
#COURSE: COMP-1405 B2
#FILE: t10p3.py
#DATE: 2018-11-26
##################################

def stringreverse(string):
    #if string is empty return string
    if string == "":
        return string
    else:
        #add final value of string on top of all string values except last one
        #continue until string is empty
        return(string[-1] + stringreverse(string[:-1]))

userStr = input("What do you want reversed?")
print(stringreverse(userStr))
