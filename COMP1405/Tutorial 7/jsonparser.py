#################################
#NAME: Lily Inskip-Shesnicky
#STUDENT ID: 101115505
#COURSE: COMP-1405 B2
#FILE: jsonparser.py
#DATE: 2018-11-04
##################################

def jsontolist(string):
    string = (string.strip("{").strip("}")).replace("'","")
    stuff = string.split(",")
    stuff = [n.split(":") for n in stuff]
    return(stuff)

def getvalue(jsonlist, key):
    value = ""
    for i in range(len(jsonlist)):
        if jsonlist[i][0] == key:
            value = jsonlist[i][1]
    return(value)

def setvalue(jsonlist, key, newValue):
    for i in range(len(jsonlist)):
        if jsonlist[i][0] == key:
            jsonlist[i][1] = newValue
        else:
            pass
    return(jsonlist)

def listtojson(jsonlist):
    newList = []
    for n in jsonlist:
        pair = "'%s':'%s'" % (n[0],n[1])
        newList.append(pair)
    jsonStr = "{"+ ','.join(newList)+"}"
    return(jsonStr)

def remove(jsonlist, key):
    for i in range(len(jsonlist)):
        if key in str(jsonlist[i]):
            jsonlist.pop(i)
        else:
            pass
    return(jsonlist)

def add(jsonlist, key, value):
    jsonlist.append([key,value])
    return(jsonlist)

string1 = "{'firstname':'dave','lastname':'mckenney','position':'instructor'}"
print("Original json string:")
print(string1)
print("")
list1 = jsontolist(string1)
print("New list:")
print(list1)
print("")
print("Value for firstname key:",getvalue(list1,'firstname'))
print("Value for lastname key:",getvalue(list1,'lastname'))
print("Value for position key:",getvalue(list1,'position'))
print("Value for coffee key:",getvalue(list1,'coffee'))
print("")
print("New value for firstname key:")
print(setvalue(list1, 'firstname','david'))
print("")
print("List back to json string:")
print(listtojson(list1))
print("")
print("Removing position key and value:")
print(remove(list1,'position'))
print("")
print("Adding new height key and value:")
print(add(list1,'height','100ft'))
