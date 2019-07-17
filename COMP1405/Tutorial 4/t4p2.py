#################################
#NAME: Lily Inskip-Shesnicky 
#STUDENT ID: 101115505
#COURSE: COMP-1405 B2 
#FILE: t4p2.py
#DATE: 2018-10-03
##################################

def rainCheck():
	check = True
	while check: 
		var = input("It rained today?")
		if var == "True":
			check = False
		elif var == "False":
			check = False 
		else: 
			print("Please enter True or False")
	return(var) 
	
falseCount = 0
sensor = True
while sensor: 
	rain = rainCheck()
	if rain == "True":
		falseCount = 0 
	elif rain == "False":
		falseCount += 1 
		#make it count up in multiples of 3! 
		if falseCount == 3:
			print("Quick! Water your garden before all the plants die and you starve to death!") 
			falseCount = 0 
		
	
		