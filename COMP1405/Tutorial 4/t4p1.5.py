#################################
#NAME: Lily Inskip-Shesnicky 
#STUDENT ID: 101115505
#COURSE: COMP-1405 B2 
#FILE: t4p1.py
#DATE: 2018-10-03
##################################
import math 

#for loop 
def factors(num):
	facts = []
	n=1
	while n<=num:
		if num%n == 0:
			facts.append(n)
		n = n+ 1
	facts.sort()
	return facts 
	
number = int(input("Please enter a number: ")) 
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



	