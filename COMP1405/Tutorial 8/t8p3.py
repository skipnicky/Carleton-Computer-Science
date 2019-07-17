#################################
#NAME: Lily Inskip-Shesnicky
#STUDENT ID: 101115505
#COURSE: COMP-1405 B2
#FILE: t8p1.py
#DATE: 2018-11-12
##################################

def jsontodict(jsonString):
    #strip and replace excess
    #split on comma
    jsonList = ((jsonString.strip("'").strip("{").strip("}"))\
    .replace('"',"").replace('"',"")).split(",")

    #empty dict
    dict = {}
    #for element in new split list
    for n in jsonList:
        #key and value is n[0] and n[1] after split on colon
        key,value = n.split(":")
        #set key and values
        dict[key]=value
    #return new dict
    return(dict)


#set new key value
def setvalue(dict, key, newVal):
    dict[key] = newVal

def getvalue(dict, key):
    #if the key is in the dictionary
    if key in dict:
        #value is at key
        val = dict[key]
    #otherwise no value
    else:
        val = None
    return(val)

def remove(dict,key):
    #this mutates dict, would be better to create copy?
    del dict[key]

def add(dict,key,value):
    dict[key] = value

def dicttojson(dict):
    nowJson = str(dict)
    return(nowJson)

jsonStr = '{1:2,"cara":"s"}'
print("Original json string:",jsonStr)
myDict = jsontodict(jsonStr)
print("New dictionary:",myDict)
print("Proof of type difference --")
print(" - jsonStr:",type(jsonStr))
print(" - myDict:",type(myDict))
setvalue(myDict,"1","number")
print("New value for 1:",myDict)
print("Value for Cara:",getvalue(myDict,'cara'))
print("Value for Coffee:",getvalue(myDict,'coffee'))
remove(myDict,'1')
print("Removal of 1:",myDict)
add(myDict,'lily','is')
print("Adding Lily:",myDict)
myDict = dicttojson(myDict)
print("Dict back to json proof:")
print(" - new myDict type:",type(myDict))
