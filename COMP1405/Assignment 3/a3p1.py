#################################
#NAME: Lily Inskip-Shesnicky
#STUDENT ID: 101115505
#COURSE: COMP-1405 B
#FILE: a3p1.py
#DATE: 2018-10-30
##################################

"""
average - calculates individual student averages
Args:
	list - 2 dimensional list of each students grades
	 	   of assignment, midterm, and exam
Returns:
	average - calculated average
"""
def average(list):
	#get the individual grades
	asn = list[0]
	mid = list[1]
	exm = list[2]
	#weigh them
	asnWeight = asn*0.25
	midWeight = mid*0.25
	exmWeight = exm*0.5
	#get average
	average = asnWeight + midWeight + exmWeight
	return(average)

"""
listConversion - converts variables in list to ideal data type
Args:
	mylist - list containing elements to be converted
	con - desired data type
Returns:
	mylist - converted list
"""
def listConversion(mylist, con):
	#for element in the list, convert to desired data type
	mylist = [con(i) for i in mylist]
	#return converted list
	return(mylist)

"""
fileOpening - gets name of file and opens it for desired action
Args:
	type - action to be performed on file (write, read, append, etc)
Returns:
	inpFile - opened file
"""
def fileOpening(type):
	#while loop to catch errors as long as fileCheck is True
	fileCheck = True
	while fileCheck:
		#get user input of file name
		fileName = input("Enter file name:")
		#try to open file for reading
		try:
			inpFile = open(fileName, type)
			#set fileCheck to False to end loop
			fileCheck = False
		#get exception error if try fails
		except IOError as e:
			#print failed file name and error message
			print("")
			print("Failed to open %s for reading." % fileName)
			print(e)
			print("")
	#return input file name
	return(inpFile)

"""
fileHandle - performs actions on file before closing
Args:
	None
Returns:
	lines - list of lines from file
"""
def fileHandle():
	#call file open fcn for reading
	file = fileOpening('r')
	#create list of lines
	lines = file.readlines()
	#close file
	file.close()
	return(lines)

"""
getStudnetValues - creates lists of various student values
Args:
	lines - list of lines taken from file
Returns:
	[name, lastName, assignment, midterm, exam] -
		list containing:
	    list of student's first names
		list of student's last names
		list of student's assignment grade
		list of student's midterm grade
		list of student's exam grade
"""
def getStudentValues(lines):
	#first name starts at line 0 and continues every 6 lines
	name = lines[0::6]
	#last name starts at line 1 and continues every 6 lines
	lastName = lines[1::6]

	#assignment grades start at line 3 and continue every 6 lines
	assignment = lines[3::6]
	assignment = listConversion(assignment, int)

	#midterm grades start at line 4 and continue every 6 lines
	midterm = lines[4::6]
	midterm = listConversion(midterm, int)

	#exam grades start at line 5 and continue every 6 lines
	exam = lines[5::6]
	exam = listConversion(exam, int)
	return ([name,lastName,assignment,midterm,exam])

"""
getValueLists - creates overall average for each student
Args:
	name - list of student first names
	assignment - list of student assignment grades
	midterm - list of student midterm grades
	exam - list of student exam grades
Returns:
	averages - list of each student's overall average
"""
def getValueLists(name,assignment,midterm,exam):
	#empty list to hold grades of students
	grades_list = []
	#for element in range of number of students
	for x in range(len(name)):
		#add list of individual grades to grades_list
		#indexed at students position in name range
		grades_list.append([assignment[x],midterm[x],exam[x]])

	#empty list to hold student averages
	averages = []
	#for list of grades in grade_list
	for n in grades_list:
		#add calculated average of n to averages
		averages.append(average(n))
	return(averages)

"""
getPassFail - calculates and prints number of passing vs failing students
Args:
	averages - list of student's overall averages
	exam - list of student's exam grades
Returns:
	None
"""
def getPassFail(averages, exam):
	#set counting values to 0
	passes = 0
	fails = 0
	enum = 0
	#for average in list of averages
	for n in averages:
		#if average greater than 50 AND
		#exam score of that student greater than 50
		if n >= 50 and exam[enum] >= 50:
			#add to passes
			passes += 1
		else:
			#add to fails
			fails += 1
		#enumerate position of the students values in various lists
		enum += 1

	#print passes/fails
	print("Numer of Passes:", passes)
	print("Number of Fails:", fails)

"""
getOverallAverage - calculates and prints overall average of students
Args:
	averages - list of student's overall averages
Returns:
	None
"""
def getOverallAverage(averages):
	#average is sum of grades divided by number of grades
	overallAv = sum(averages)/len(averages)
	#print overall average of all students
	print("Average Final Grade: %.2f" % overallAv)

"""
getHighestGrade - calculates and prints the highest average
				  and student who obtained it
Args:
	averages - list of student's overall averages
	name - list of student's first names
	lastName - list of student's last names
Returns:
	None
"""
def getHighestGrade(averages,name,lastName):
	#get max grade from total average list
	maxGrade = max(averages)
	#find position of max grade
	winIndex = averages.index(maxGrade)
	#get names at same position as highest average
	#strip names of whitespace
	firstNameWin = (name[winIndex]).strip()
	surnameWin = (lastName[winIndex]).strip()
	#print name of student with highest grade and rounded grade
	print("The Highest Grade:",firstNameWin,surnameWin,"- %.2f" % maxGrade)

"""
getLowestGrade - calculates and prints the lowest average
				 and student who obtained
Args:
	averages - list of student's overall averages
	name - list of student's first names
   lastName - list of student's last names
Returns:
	None
"""
def getLowestGrade(averages,name,lastName):
	#get min grade from total average list
	minGrade = min(averages)
	#find position of min grade
	lossIndex = averages.index(minGrade)
	#get names at same position as lowest average
	#strip names of whitespace
	firstNameLoss = (name[lossIndex]).strip()
	surnameLoss = (lastName[lossIndex]).strip()
	#print name of student with lowest grade and rounded grade
	print("The Lowest Grade:", firstNameLoss, surnameLoss, "- %.2f" % minGrade)

#---CONSTANTS---
NAME = 0
LASTNAME = 1
ASSIGNMENT = 2
MIDTERM = 3
EXAM = 4

#---MAIN---
#execute only when the code runs diretly
if __name__ == '__main__':
	running = True
	while running:
		#---FILE---
		callFile = fileHandle()
		print(" ")
		print("---RESULTS---")
		#---STUDENT VALUES---
		studentValues = getStudentValues(callFile)
		#---VALUE LISTS---
		valueLists = getValueLists(studentValues[NAME],\
		studentValues[ASSIGNMENT],studentValues[MIDTERM],\
		studentValues[EXAM])
		#---PASS FAIL----
		passFail = getPassFail(valueLists,studentValues[EXAM])
		#---OVERALL AVERAGE---
		overallAverage = getOverallAverage(valueLists)
		#---HIGHEST GRADE---
		highestGrade = getHighestGrade(valueLists,studentValues[NAME],\
		studentValues[LASTNAME])
		#---LOWEST GRADE---
		lowestGrade = getLowestGrade(valueLists,studentValues[NAME],\
		studentValues[LASTNAME])

		#exit fcn
		exit = False
		while exit != True:
			print(" ")
			again = input("Would you like to check another file? (y/n)")
			if again == 'y':
				exit = True
			elif again == 'n':
				exit = True
				running = False
			else:
				print("Please enter y for yes or n for no")
