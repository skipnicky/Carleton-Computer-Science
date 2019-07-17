#################################
#NAME: Lily Inskip-Shesnicky
#STUDENT ID: 101115505
#COURSE: COMP-1405 B2
#FILE: t10p4.py
#DATE: 2018-11-26
##################################

#O(n) runtime complexity
def merge(list1, list2):
    result = []
    #while there are elements in one of the lists
    while len(list1) > 0 or len(list2) > 0:
        #if nothing in list1
        if len(list1) == 0:
            #add elements from list2
            result.append(list2.pop(0))
        #if nothing in list2
        elif len(list2) == 0:
            #add elements from list1
            result.append(list1.pop(0))
        else:
            #if first element in list1 less than element in list2
            if list1[0] < list2[0]:
                #add first element of list1
                result.append(list1.pop(0))
            else:
                #first element in list2 is greater than first in list1
                #so add element from 2
                result.append(list2.pop(0))
    return result

def mergesort(list):
    if len(list) <= 1: #base case
        return list

    #divide array in half and merge sort recursively
    list1 = mergesort(list[:int(len(list)/2)])
    list2 = mergesort(list[int(len(list)/2):])
    return merge(list1,list2)

"""
---runtime complexity of mergesort---
    Input must be iterated through O(logn) times
       input can only be halved O(logn) times
    n items iterated log(n) times
    Therefor complexity: O(nlogn)
"""
lister = [6,1,5,10,11,19,14,0,-1]
print("Original list:",lister)
print("Sorted list:",mergesort(lister))
