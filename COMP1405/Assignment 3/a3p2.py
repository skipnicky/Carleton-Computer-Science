#################################
#NAME: Lily Inskip-Shesnicky
#STUDENT ID: 101115505
#COURSE: COMP-1405 B
#FILE: a3p2.py
#DATE: 2018-10-28
##################################

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

"""
ismultiple - checks if one of two inputs is multiple of the other
Args:
	a - integer value
	b - integer value
Returns:
	True or False
"""
def ismultiple(a,b):
	#if remainder of b%a is 0 then return True
	if b%a == 0:
		return True
	else:
		#otherwise not multiple return False
		return False

"""
commonmultiple -
Args:
	a - integer value
	b - integer value
	c - integer value
Returns:
	True or False
"""
def commonmultiple(a,b,c):
	#if a,c and b,c are multiples thus both returned as True
	if ismultiple(a,c) == True and ismultiple(b,c)==True:
		#they are common multiples return False
		return True
	else:
		#otherwise not common multiple return False
		return False
		
#test code for ismultiple
print(ismultiple(5,10)) #result True
print(ismultiple(2,5)) #result False

#get values from user through check fcn for valid input
userNum1 = check("Enter your first number:",int)
userNum2 = check("Enter your second number:",int)

#empty list to store multiples
multiples=[]
#loop through numbers 1 to 100
for i in range(1,101):
	#if userNum1 and userNum2 are both multiples of i
	if commonmultiple(userNum1,userNum2,i):
		#add to multiples list because they're common multiples
		multiples.append(i)
	else:
		pass

#if there are common multiples
if len(multiples)>0:
	print("The common multiples in range 1 to 100 are: ")
	#for element in multiples list
	for n in multiples:
		#print each element, replace implied end= "\n" with space on same line
		print(n, end=" ")
#otherwise there are no multiples
else:
	print("No common multiples from 1 to 100 ")
