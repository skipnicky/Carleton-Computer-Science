#################################
#NAME: Lily Inskip-Shesnicky 
#COURSE: COMP-1405 B2 
#FILE: t3p1.py
#DATE: 2018-09-28
##################################

#PROBLEM ONE 

#number function 
def get_num(num):
	#loop for error checking 
	check = True
	while check:
		#get value of undetermined number 
		var = input("Enter your %s number: " % (num))
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

#function to run prgrm again 
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
#ENDFUNCTION

print("Welcome to the math bot, what would you like me to perform?")

error = True 
while error: 
	choice = input("Enter 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division, and 5 for exponentiation: ")
	if choice == "1":
		num1 = get_num("first")
		num2 = get_num("second")
		total = num1+num2
		print(num1,"+",num2,"=",total)
		error = again()
	elif choice == "2":
		num1 = get_num("first")
		num2 = get_num("second")
		total = num1-num2
		print(num1,"-",num2,"=",total)
		error = again()
	elif choice == "3":
		num1 = get_num("first")
		num2 = get_num("second")
		total = num1*num2
		print(num1,"x",num2,"=",total)
		error = again() 
	elif choice == "4":
		num1 = get_num("first")
		num2 = get_num("second")
		quotient = num1//num2
		remainder = num1%num2
		print(num1,"/",num2,"=",quotient,"with remainder",remainder)
		error = again()
	elif choice == "5":
		num1 = get_num("base")
		num2 = get_num("power")
		total = num1**num2
		print(num1,"^",num2,"=",total)
		error = again()
	else:
		print("Please enter 1, 2, 3, 4, or 5")
	#ENDIF 
#ENDWHILE 

