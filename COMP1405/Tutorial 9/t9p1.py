#################################
#NAME: Lily Inskip-Shesnicky
#STUDENT ID: 101115505
#COURSE: COMP-1405 B2
#FILE: t9p1.py
#DATE: 2018-11-19
##################################

def BinarySearch(list, start, end, x):
    while start <= end:
        #get idx of middle element in list
        midindex = int((start+end)/2)
        #if element at idx is the value, return location
        if list[midindex] == x:
            return(midindex)
        #if element at idx is less than value
        if list[midindex] < x:
            #new start is mid idx + 1
            #value is in upper half, or not in list
            start = midindex+1
        #if element at idx is greater than value
        if list[midindex] > x:
            #new end is mid idx - 1
            #value in lower half, or not in list
            end = midindex - 1
    #element not in list return False
    return -1

#also known as exponential search
def GallopingSearch(list, searchvalue):
    #set end to 1
    end = 1

    #if first element is search value
    if list[0] == searchvalue:
        #idx pos is 0
        return(0)

    #while end boundary is less than length of list
    #and element at end of boundary less than/equal to search value
    while end < len(list) and list[end] <= searchvalue:
        #multiply end bound by 2
        end *= 2

    newStart = end/2
    newEnd = min(end,len(list))
    #binary search now in given range of gall
    return BinarySearch(list,newStart,newEnd,searchvalue)

mylist = [1,4,6,8,9,10,14,16,20,23]
val = 1
val2 = 14
result = GallopingSearch(mylist,val)
result2 = GallopingSearch(mylist,val2)
print("List is:",mylist)
if result == -1:
    print("Element not found in list")
else:
    print("Element %d is located at index %d" % (val, result))

if result2 == -1:
    print("Element not found in list")
else:
    print("Element %d is located at index %d" % (val2, result2))
