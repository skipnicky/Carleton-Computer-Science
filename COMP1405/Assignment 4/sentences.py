#################################
#NAME: Lily Inskip-Shesnicky
#STUDENT ID: 101115505
#COURSE: COMP-1405 B
#FILE: sentences.py
#DATE: 2018-11-07
##################################
from collections import OrderedDict

'''
startwords - create a list of the first word from each sentence
Args:
    string - any string variable input
Returns:
    startWrds - list of start words
'''
def startwords(string):
    #create empty list
    startWrds = []
    #create list by splitting sentence input on period
    sentences = string.split(".")
    #for elements, now strip leading/trailing whitespace and split on space
    words = [(sentence.strip()).split(" ") for sentence in sentences]

    #if the there's an empty element in the list remove
    if words[-1] == ['']:
        words.pop()

    #for words in list of each individual sentences words
    for word in words:
        #append first to startWrds
        startWrds.append(word[0])

    '''
    use OrderedDict.fromkeys to create dict from elements in list
    the keys are each element in the list with autoset values of None,
    and as such removes duplicates. OrderedDict remembers when each thing
    was added, and therefore does not manipulate the dictionary order
     when appending/removing/changing/etc.
    '''
    startWrds = list(OrderedDict.fromkeys(startWrds))

    #return the startWrds list
    return(startWrds)

'''
endWords - create a list of the end word from each sentence
Args:
    string - any string variable input
Returns:
    endWrds - list of end words
'''
def endwords(string):
    #create empty list
    endWrds = []
    #create list by splitting sentence input on period
    sentences = string.split(".")
    #for elements, now strip leading/trailing whitespace and split on space
    words = [(sentence.strip()).split(" ") for sentence in sentences]

    #if the there's an empty element in the list remove
    if words[-1] == ['']:
        words.pop()

    #for words in list of each individual sentences words
    for word in words:
        #append last to endWrds
        endWrds.append(word[-1])

    '''
    use OrderedDict.fromkeys to create dict from elements in list
    the keys are each element in the list with autoset values of None,
    and as such removes duplicates. OrderedDict remembers when each thing
    was added, and therefore does not manipulate the dictionary order
     when appending/removing/changing/etc.
    '''
    endWrds = list(OrderedDict.fromkeys(endWrds))

    #return the endWrds list
    return(endWrds)
