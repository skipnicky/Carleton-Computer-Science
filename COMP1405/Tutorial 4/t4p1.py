#################################
#NAME: Lily Inskip-Shesnicky 
#STUDENT ID: 101115505
#COURSE: COMP-1405 B2 
#FILE: t4p1.py
#DATE: 2018-10-03
##################################

'''
I personally believe for loops are better for this specific problem.
For loops are designed to deal with incrementing values/iterations esp that 
are within a specific range/ready-made collection (like set, tuple, list, map, etc),
and so perform problems like these cleaner 
'''

import math 

def check():
	error = True
	while error: 
		var = input("Please enter a number: ")
		try:
			var = int(var)
			error = False 
		except:
			print("Please enter a proper integer") 
	return(var)
	
#for loop 
def factors(num):
	facts = []
	for i in range(1, int(math.sqrt(num)) + 1):
		if num % i == 0:
			facts.append(i)
			facts.append(int(num/i))
	facts.sort()
	
	return facts 
	
number = check() 
f = factors(number)
 
sum = 0 
print("The divisors are:")
for i in f:
	sum = sum + i 
	print(i)
	
print("The sum of the divisors is:",sum) 
leng = len(f)
if leng == 2:
	print("The number is prime!")
else:
	print("The number is not prime.") 


	