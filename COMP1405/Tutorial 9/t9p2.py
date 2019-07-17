#################################
#NAME: Lily Inskip-Shesnicky
#STUDENT ID: 101115505
#COURSE: COMP-1405 B2
#FILE: t9p2.py
#DATE: 2018-11-20
##################################

def count(list, value):
    firstidx = findstart(list, value)

    if firstidx == -1:
        return -1

    lastidx = findend(list, value)
    return (lastidx-firstidx)+1

def findstart(list, value):
    #set end to length of possible index's in list
    end = len(list)-1
    #set start to 0
    start = 0
    #set result to False
    result = -1

    #while the end of search is greater than start of search
    while end >= start:
        #if first element in list is equal to desired value
        if list[0] == value:
            #first element in list is value
            return(0)
        if list[-1] == value and list[-2] != value:
            return(len(list)-1)

        #get idx of middle element in list
        midindex = int((start+end)/2)
        #if element at idx is the value
        if list[midindex] == value:
            #the result (start value) is the midindex
            result = midindex
            #set new end of search to left of middle index
            end = midindex - 1
        #if element at idx is greater than value
        elif list[midindex] > value:
            #new end of search is to the left of middle index
            end = midindex-1
        #otherwise element at idx is less than value
        else:
            #new start of search is to the right of middle index
            start = midindex + 1

    #if element was in list result will be start value
    #otherwise will return false
    return result

def findend(list, value):
    #set end of search to amount of possible idx's in list
    end = len(list) -1
    #set start of search to where element first appears in list
    start = findstart(list,value)
    #set result to False
    result = -1

    #while end of search is greater than/equal to start of search
    while end >= start:
        #get idx of middle element in list
        midindex = int((start+end)/2)
        #if list position in
        if list[midindex] == value:
            result = midindex
            start = midindex+1
        elif value < list[midindex]:
            end = midindex -1
        else:
            start = midindex+1
    return result

mylist = [2,2,2,5,6]
mylist2 = [1,2,3,4,4,4,5,6]
mylist3 = [1,2,4,7,7,7,7,9]
x = 4
z = 7
result = count(mylist,x)
result2 = count(mylist2, x)
result3 = count(mylist3,z)
print("List one:",mylist)
if result == -1:
    print("%d not found in list" % x)
else:
    print("%d is in the list %d times" % (x,result))

print("List two:",mylist2)
if result2 == -1:
    print("%d not found in list" % x)
else:
    print("%d is in the list %d times" % (x,result2))

print("List three:",mylist3)
if result2 == -1:
    print("%d not found in list" % z)
else:
    print("%d is in the list %d times" % (z,result3))
