#################################
#NAME: Lily Inskip-Shesnicky
#STUDENT ID: 101115505
#COURSE: COMP-1405 B2
#FILE: t10p2.py
#DATE: 2018-11-26
##################################

def insertionsort(list):
    #for i in range 1 to length of list -1 (inclusive)
    for i in range(1, len(list)):
        key = list[i]
        j = i #set j to i bcuz reducing i will mess with loop
        """
        Comparing current element with sorted portion + swapping.
        Move elements of list[0...i-1], that are greater than key
        to one pos ahead of current position.
        Essentially moving key back as long as it is smaller
        than the last item in the array.
        """
        #if j-1 == -1 key belongs at start
        while (j > 0) and list[j-1] > key:
            print("Swaped {} for {}".format(list[j],list[j-1]))
            #move last object compared one step ahead to make room for key
            list[j] = list[j-1]
            print(list)
            j -= 1
        #if i is not greater than key, key belongs at j
        list[j] = key
    return(mylist)

#best case: O(n)
#worst case: O(n^2)
#   arrays where each element is smallest/second-smallest of element before it
#   so every iteration of inner loop will scan and shift entire
#   sorted subsection of array before inserting next element
mylist = [0,5,3,6,7,2,8,1]
print("Initial list:",mylist)
print("Sorted list:",insertionsort(mylist))
