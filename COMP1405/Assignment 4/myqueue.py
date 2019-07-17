#################################
#NAME: Lily Inskip-Shesnicky
#STUDENT ID: 101115505
#COURSE: COMP-1405 B
#FILE: myqueue.py
#DATE: 2018-11-04
##################################
#set maximum list length to global
global maxSize

'''
enqueue - adds element to queue as long as size remains within bounds
Args:
    queue - the list queue
    value - the element to be added
Returns:
    True or False
'''
def enqueue(queue, value):
    #if length of queue less than maximum bound
    if len(queue) < maxSize:
        #add value to queue & return True
        queue.append(value)
        return True
    #otherwise return False
    else:
        return False

'''
dequeue - removes element from queue (list)
Args:
    queue - the list queue
Returns:
    first - the first value in the list
    None
'''
def dequeue(queue):
    #if queue length greater than 0 (there are elements in queue)
    if len(queue) > 0:
        #remove first element and return
        first = queue.pop(0)
        return(first)
    #otherwise return is None
    else:
        pass

'''
peek - sees first element in list without removing
Args:
    queue - the list queue
Returns:
    first element in queue or None
'''
def peek(queue):
    #if queue not empty
    if len(queue)>0:
        #return first element
        return(queue[0])
    #otherwise return is None
    else:
        pass

'''
isempty - returns False if queue is not empty
Args:
    queue - the list queue
Returns:
    True or False
'''
def isempty(queue):
    #if no elements in queue
    if len(queue)>0:
        return False
    else:
        return True

'''
multienqueue - adds as many items as possible before reaching list bound
Args:
    queue - the list queue
    items - list of items to be added
Returns:
    count - number of items succesfully added to queue
'''
def multienqueue(queue, items):
    #set count to 0
    count = 0
    #for element in list of items
    for i in items:
        #add to queue
        add = enqueue(queue,i)
        #if add returns True (add was succesful)
        if add == True:
            #add one to count
            count+=1
        #otherwise pass
        else:
            pass
    #return number of items added
    return(count)

'''
multidequeue - removes as many elements asked from list
Args:
    queue - the list queue
    number - amount of items to be removed
Returns:
    newList - the list after items have been removed
'''
def multidequeue(queue, number):
    #create empty list
    newList = []
    #run through for loop as many times as user input
    for i in range(number):
        #element is removed from queue
        el = dequeue(queue)
        #if element is None
        if el == None:
            #pass
            pass
        #otherwise append removed element to list
        else:
            newList.append(el)
    #return list of removed elements
    return(newList)

#maximum length of list
maxSize = 10
