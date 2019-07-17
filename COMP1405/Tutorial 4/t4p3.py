#################################
#NAME: Lily Inskip-Shesnicky 
#STUDENT ID: 101115505
#COURSE: COMP-1405 B2 
#FILE: t4p1.py
#DATE: 2018-10-03
##################################

def digits(n):
	count = 1 
	while(int(n/10)) is not 0:
		count += 1 
		n = int(n/10)
	return count 
	
number = int(input("Please enter a number:"))
print(digits(number))