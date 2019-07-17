#################################
#NAME: Lily Inskip-Shesnicky
#STUDENT ID: 101115505
#COURSE: COMP-1405 B
#FILE: a3p3.py
#DATE: 2018-10-29
##################################

"""
slice - creates sliced object
Args:
	source - the list to be sliced
	start - element of list to start at
	end - element of list to end at
Returns:
	mylist - the sliced list
"""
def slice(source,start,end):
	#empty list to hold selected values
	mylist = []
	"""
	if starting or end value is not in range of list,
	pass and return empty list
	"""
	if start not in range(0,len(source))\
	and end not in range(start,len(source)):
		pass
	else:
		#for list element in range of list
		for i in range(start-1,end):
			#add selected values
			mylist.append(source[i])
	#return result of slicing
	return(mylist)

"""
check - data type error catch fcn for user input
Args:
	msg - input prompt to be output to user
	conv - data type to convert input to (int, str, float, etc)
Returns:
	conv(var) - Converted variable
"""
def check(msg,conv):
	#error while loop
	checking = True
	while checking:
		#get var
		var = input(msg)
		#try except for correct input
		try:
			var = conv(var)
			#if correct input end loop
			checking = False
		except:
			print("Please enter a valid",conv)
	#return var as int
	return(conv(var))

#list with values of alphabet 1 to 9
alphaNine = ["A","B","C","D","E","F","G","H","I","J"]
#get what user wants to slice
print("What elements of",alphaNine,"would you like (range 1 to 9)?")
thestart = check("Start:",int)
theend= check("End:",int)
#print results of slicing fcn
print(slice(alphaNine,thestart,theend))
