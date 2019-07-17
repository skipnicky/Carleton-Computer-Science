#################################
#NAME: Lily Inskip-Shesnicky
#STUDENT ID: 101115505
#COURSE: COMP-1405 B2
#FILE: count.py
#DATE: 2018-11-30
##################################

"""
countsort - creates new, sorted copy of input list
Args:
	inpList - list given to fcn to sort
Returns:
	sort - new sorted list
"""
def countsort(inpList):
    #create empty dictionary
    #to store number of occurences of each element in list
    #keys --> number
    #value --> occurences of that number
    numDict = {}

    """
    for x in list --> O(n)
    if x in dict / else --> O(1)
    O(n) * O(1) = O(n)
    """
    #for element in list
    for i in inpList:
        #if element already in dictionary
        if i in numDict:
            #add 1 to value at it's key
            numDict[i] += 1
        #otherwise element not in dictionary
        else:
            #create new key of elememnt and set value to 1
            numDict[i] = 1

    #create new list of dictkeys to have list without duplicates
    unique = list(numDict)
    #use built in sort method to organize list
    unique.sort()

    #create new list to add values in sorted order
    sort = []
    #for element in unique
    for i in unique:
        #i = number
        #numDict[i] = amount of times number shows up in list
        #add i to list numDict[i] times
        sort += [i]*numDict[i]
    return(sort)
