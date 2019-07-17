###############################################
#NAME: Lily Inskip-Shesnicky
#COURSE: COMP 1405
#FILE: a1q2.py
#DESCRIPTION:
#	Randomized number guessing game  
###############################################

import random 

#randomize numbers 
num = random.randint(1,101)

#game loop 
running = True
while running:  
	#get number 
	userGuess = input("Guess what number i'm thinking of!")
	#make sure value is integer 
	try:
		#convert int 
		userGuess = int(userGuess)  
		#if they get it 
		if userGuess == num:
			print("You got it!")
			#end game loop 
			running = False 
		else: 
			#get the amount away/above number 
			total = num-userGuess 
			#>0 means below number 
			if total > 0:
				print("You're",total,"below from my number!")
			#neg number means you're over the number 
			elif total < 0: 
				print("You're",abs(total),"over my number") 
	except: 
		#error statement 
		print("Please enter a valid integer") 
		

		
