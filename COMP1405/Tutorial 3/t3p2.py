#################################
#NAME: Lily Inskip-Shesnicky 
#COURSE: COMP-1405 B2 
#FILE: t3p2.py
#DATE: 2018-09-28
##################################
def again():
	print("Would you like to do another calculation?")
	#error checking loop 
	running = True
	while running:
		#ask if they want to do it again 
		again = input("Enter y for yes or n for no: ")
		if again == "y": 
			return True
			running = False 
		elif again == "n":
			return False 
			running = False 
		else:
			print("Please enter y or n")
		#ENDIF
	#ENDWHILE 
#ENDFCN 

running = True 
while running:
	error = True
	while error: 
		year = input("Get year")
		try:
			year = int(year)
			error = False 
		except:
			print("Please enter a valid year.")
		#ENDTRY
	#ENDWHILE 
		
	mod1 = year % 400 
	mod2 = year % 100
	mod3 = year % 4 

	if mod3 == 0:
		if mod2 == 0: 
			if mod1 == 0:
				print(year,"is a leap year")
				running = again()
			else:
				print(year,"is not a leap year")
				running = again()
			#ENDIF
		else:
			print(year,"is a leap year")
			running = again()
		#ENDIF
	else:
		print(year,"is not a leap year")
		running = again()
	#ENDIF 
#ENDWHILE 
