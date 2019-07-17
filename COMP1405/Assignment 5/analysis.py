#################################
#NAME: Lily Inskip-Shesnicky
#STUDENT ID: 101115505
#COURSE: COMP-1405 B2
#FILE: analysis.py
#DATE: 2018-11-30
##################################
#set global variables
global words, chars, wordsDict

"""
load - initializes data from file
Args:
	str - file name
Returns:
	None
"""
def load(str):
    #clear any previously loaded data from storage locations
    words.clear()
    chars.clear()
    wordsDict.clear()
    charsDict.clear()

    #while loop to catch errors as long as fileCheck is True
    fileCheck = True
    while fileCheck:
        #try to open file for reading
        try:
            inpFile = open(str, 'r')
            #set fileCheck to False to end loop
            fileCheck = False
        #get exception error if try fails
        except IOError as e:
            #print failed file name and error message
            print("")
            print ("Failed to open %s for reading." % fileName)
            print(e)
            print("")

    #for each line in input file
    for line in inpFile:
        #iterate through line split on space
        for word in line.split():
            #add word to words list
            words.append(word)
        #for each element in line
        for i in line:
            #if element is empty space
            if i == " ":
                #does not count as char
                pass
            #otherwise append element to list of characters
            else:
                chars.append(i)
    #close file
    inpFile.close()

    #for word in list of words
    for i in words:
        #if word is in dictionary of words
        if i in wordsDict:
            #add 1 to value at it's key
            wordsDict[i] += 1
        #otherwise set initial value to 1
        else:
            wordsDict[i] = 1

    #for character in list of characters
    for i in chars:
        #if character is in dictionary of chars
        if i in charsDict:
            #add 1 to value at it's key
            charsDict[i] += 1
        #otherwise set initial value to 1
        else:
            charsDict[i] = 1

"""
commonword - finds word contained in list that occurs most often
             in loaded text
Args:
	list - string values to be compared to loaded text
Returns:
	commons[idx] - word stored at max key
                   so word that appears most
    or None
"""
def commonword(list):
    #create dictionary to store words + num of occurences in text
    commons = {}

    #for element in input list
    for i in list:
        #if element in dict of loaded words
        if i in wordsDict:
            #set key in commons as amount of time word appears
            #in loaded text, set value as that word
            commons[wordsDict[i]] = i

    #if length of commons greater than 0
    # --> aka if there were similar values between list & loaded text
    if len(commons) > 0:
        #desired index is maximum key value
        idx = max(commons)
        #return word at maximum key
        return(commons[idx])
    #otherwise pass (to return None if no similar words)
    else:
        pass

"""
commonletter - finds letter contained in list that occurs most often
               in loaded text
Args:
	list - string values to be compared to loaded text
Returns:
	commons[idx] - char stored at max key
                   so char that appears most
    or None
"""
def commonletter(list):
    #create dictionary to store words + num of occurences in text
    commons = {}

    #for element in input list
    for i in list:
        #if element in dict of loaded characters
        if i in charsDict:
            #set key in commons as amount of time character appears
            #in loaded text, set value as that char
            commons[charsDict[i]] = i

    #if length of commons greater than 0
    # --> aka if there were similar values between list & loaded text
    if len(commons) > 0:
        #desired index is maximum key value
        idx = max(commons)
        #return word at maximum key
        return(commons[idx])
    #otherwise pass (to return None if no similar words)
    else:
        pass

"""
commonpair - finds most common word to follow given argument
Args:
	str - string values representing preceding word
Returns:
	val - word that follows most often
    or None
"""
def commonpair(str):
    #list to store common pairs
    pairs = []

    #for idx in range length of list
    # --> not including last idx as nothing can follow final word
    for i in range(len(words)-1):
        #if word at idx is desired argument
        if words[i]==str:
            #add word at next idx to list
            pairs.append(words[i+1])

    #if length of pairs greater than 0
    # --> meaning argument was found in list
    if len(pairs) > 0:
        #built set (unordered collection of unique elements) with pairs
        #get max value of set(pairs), setting key as the amount of time
        #that element is counted in pairs
        # --> max(iterable, *[, default=obj, key=func])
        val = max(set(pairs), key=pairs.count)
        #return value
        return(val)
    #otherwise argument wasn't in loaded text, return none
    else:
        pass

"""
countall - gets total number of words in loaded text
Args:
	None
Returns:
	len(words) - amount of words in list
"""
def countall():
    #return length of words list 
    return(len(words))

"""
countunique - gets total number of unique words in loaded text
Args:
	None
Returns:
	len(wordsDict) - amount of key/value pairs in wordsDict
"""
def countunique():
    #dictionary only has unique words as keys
    #amount of keys in dict = amount of unique words from file
    return(len(wordsDict))

#---LOADED VALUE STORAGE---
#list of words from file
words = []
#list of characters from file
chars = []
#dictionary of words
# --> keys = word, value = num of occurences
wordsDict = {}
#dictionary of characters
# --> keys = character, value = num of occurences
charsDict = {}
