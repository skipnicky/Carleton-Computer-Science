#################################
#NAME: Lily Inskip-Shesnicky
#STUDENT ID: 101115505
#COURSE: COMP-1405 B2
#FILE: t6p1.py
#DATE: 2018-10-30
##################################
#takes two lists as perameters
def sorted(listOne, listTwo):
	#combine the two lists
	mergedList = listOne + listTwo
	#empty list to hold sorted values
	sortedList = []
	#run as long as there are stil values to be sorted in merged list
	while len(mergedList)>0:
		#set lowest to first element in merged list
		lowest = mergedList[0]
		#for each element in merged list
		for i in mergedList:
			#if element is less than current lowest value
			if i < lowest:
				#set new lowest value to list element (i)
				lowest = i
		#remove lowest from merged
		mergedList.remove(lowest)
		#now append lowest value to sorted
		#effectivley diminishing merged list until each element
		#has been appended to sorted in ascending order
		sortedList.append(lowest)
	#return sorted list
	return(sortedList)

#two list sets to showcase sort fcn
mylist = [1,3,5]
mylist2 = [2,4,6]
#print out result of combining and sorting list 
print("The lists before concatenation and sorting:",mylist, mylist2)
print("The list after concatenation and sorting:",sorted(mylist, mylist2))
