#################################
#NAME: Lily Inskip-Shesnicky 
#STUDENT ID: 101115505
#COURSE: COMP-1405 B2 
#FILE: t4p1.py
#DATE: 2018-10-03
##################################

nums = []
running = True
while running: 
	get = int(input("Enter a positive integer:"))
	nums.append(get)
	nums.sort()
	count = 0
	count2 = count + 1 
	seq = 0 
	for i in nums:
		if nums[count2] > nums[count]:
			seq += 1 
		else:
			print("Your longest increasing sequence is",seq) 
