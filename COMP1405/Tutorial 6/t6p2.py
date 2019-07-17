#################################
#NAME: Lily Inskip-Shesnicky
#STUDENT ID: 101115505
#COURSE: COMP-1405 B2
#FILE: t6p2.py
#DATE: 2018-10-30
##################################
#fcn that takes one string as perameter
def add(string):
	string = str(string)
	#for element in list
	for n in mylist:
		#if string to be added is a duplicate of another element
		if n == string:
			#find stored index of original duplicate element
			i = mylist.index(n)
			#remove original element
			mylist.pop((i))
		else:
			#otherwise, continue through list
			continue
	#once duplicate is removed, add to list
	mylist.append(string)

"""
Potential catch for int vs str variables...
mylist = ["hi","hello","hey", 2]
mylist = [str(i) for i in mylist]
add("hello")
add("2")
print(mylist)
"""
#simple test
mylist = ["hi","hello","hey"]
add("hello")
add("bonjour")
add("salut")
add("bonjour")
add("hola")
print(mylist)
