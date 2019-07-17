###############################################
#NAME: Lily Inskip-Shesnicky
#COURSE: COMP 1405-B2
#FILE: a1q1.py
#DESCRIPTION:
#	Class average calculator    
###############################################

def get_num(num):
	#loop for error checking 
	check = True
	while check:
		#get value of undetermined number 
		var = input("Enter your %s grade: " % (num))
		try:
			#try for float 
			var = float(var)
			check = False 
		except:
			#error msg
			print("Please enter a valid integer value.")
		#ENDTRY
	#ENDWHILE 
	#return float value 
	return(float(var))
#ENDFUNCTION

#get user grades & check in range 
assignment = get_num("assignment")
#assgn run loop 
running = True
while running:
	#make sure grade is 0 to 100
	if assignment >= 0 and assignment <= 100:
		running = False 
	else:
		#error statement + write over grade
		print("Please enter a number between 0 and 100")
		assignment = get_num("assignment")
		
midterm = get_num("midterm")
#mid run loop 
running = True
while running:
	#make sure grade is 0 to 100
	if midterm >= 0 and midterm <= 100:
		running = False 
	else:
		#error statement + write over grade 
		print("Please enter a number between 0 and 100")
		midterm = get_num("midterm")
		
tutorial = get_num("tutorial")
#tut run loop 
running = True
while running:
	#make sure grade is 0 to 100
	if tutorial >= 0 and tutorial <= 100:
		running = False 
	else:
		#error statement + write over grade 
		print("Please enter a number between 0 and 100")
		tutorial = get_num("tutorial")
		
exam = get_num("exam")
#exam run loop
running = True 
while running:
	#make sure grade is 0 to 100
	if exam >= 0 and exam <= 100:
		running = False 
	else:
		#error statement + write over grade 
		print("Please enter a number between 0 and 100")
		exam = get_num("exam")
		
#convert to weighted grades 
assign = assignment*0.5
mid = midterm*0.15
tut = tutorial*0.1
finalex = exam*0.25

#calculate total average 
total= assign+mid+tut+finalex
#print total to 2 decimal places 
print("Your class average is %.2f" % total)
