#################################
#NAME: Lily Inskip-Shesnicky 
#STUDENT ID: 101115505
#COURSE: COMP-1405 B2 
#FILE: t5p5.py
#DATE: 
##################################
import random 

#individual student average calculator 
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

#assign file name variable 
fileName = 'studentinfo.txt'

'''
fileList = []
userName = input("Enter student name: ")
userGrade = input("Enter user grade: ")
userNum = random.randint(10000,99999)
with open(fileName, 'a') as f:
	fileList.append("\n")
	fileList.append(userName)
	fileList.append("\n")
	fileList.append(userGrade)
	fileList.append("\n")
	fileList.append(userNum)
	fileList = ''.join(map(str, fileList))
	f.write(fileList)
	f.close() 
'''
#open file 
with open(fileName) as f:
	#create list of lines with read lines 
	lines = f.readlines()
	f.close()
	
#first name starts at line 0 and continues every 6 lines 
name = lines[0::6]
#last name starts at line 1 and continues every 6 lines 
lastName = lines[1::6]

#get all grades into list and convert to integers 
#assignment grades start at line 3 and continue every 6 lines 
assignments = lines[3::6]
assignments = [int(i) for i in assignments]
#midterm grades start at line 4 and continue every 6 lines 
midterm = lines[4::6]
midterm = [int(i) for i in midterm]
#exam grades start at line 5 and continue every 6 lines 
exam = lines[5::6]
exam = [int(i) for i in exam] 

#create enumerated dictionary of students
#key is enumerated students
#value is a list of their assignment, midterm, and exam grade 
student_dict = {}
for x in range(len(name)):
	student_dict[("student_"+str(x))]=[assignments[x],midterm[x],exam[x]]

#go through values and create list of all student averages
adds = []
for n in student_dict.values():
	adds.append(average(n))
	
#create new enumerated dictinoary of student averages 
student_averages = dict(enumerate(adds))
#find key with the maximum average 
winner = max(student_averages, key=lambda key: student_averages[key])
#strip first/last name of student who's position in file corresponds 
#to the key with the maximum average 
firstName = (name[winner]).strip()
surname = (lastName[winner]).strip()
#print student name and average 
print("Student with highest average was",firstName,surname,"with an average of %.2f" % student_averages[winner])

#base counters for marks 
totalAssignment = 0
totalMidterm = 0 
totalExam = 0 

#for all marks, add to total 
for i in assignments:
	totalAssignment += i
	
for i in midterm:  
	totalMidterm += i 

for i in exam: 
	totalExam += i 

assignmentAv = totalAssignment/(len(assignments))
midtermAv = totalMidterm/(len(midterm))
examAv = totalExam/(len(exam))

print("The assignment average across all students was: %.2f" % assignmentAv)
print("The midterm average across all students was: %.2f" % midtermAv)
print("The exam average across all students was: %.2f" %examAv)
