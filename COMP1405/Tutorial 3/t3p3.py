#################################
#NAME: Lily Inskip-Shesnicky 
#COURSE: COMP-1405 B2 
#FILE: t3p3.py
#DATE: 2018-09-28
##################################

print("Movie guessing game!")
print("Actor being considered is Jake Gyllenhaal...")
print("Possible movies are:")
print("-Donnie Darko (2001) dir. Richard Kelly")
print("-Brokeback Mountain (2005) dir. Ang Lee")
print("-Enemy (2013) dir. Denis Villeneuve")
print("-Okja (2017) dir. Bong Joon-ho")

#question1 error loop 
running = True
while running: 
	#get first answer 
	question1 = input("Does the movie you're thinking of contain hallucinations? (Enter y for yes or n for no)")
	if question1 == "y":
		#question2 error loop 
		running2 = True
		while running2:
			#get conditional second answer 
			question2 = input("Is there a large rabbit in the movie?")
			if question2 == "y":
				#conclusion 
				print("The movie you're thinking of is Donnie Darko!")
				running = False 
				running2 = False 
			elif question2 == "n":
				#conclusion 
				print("The movie you're thinking of is Enemy!")
				running = False 
				running2 = False 
			else:
				#error msg 
				print("Please enter y for yes and n for no")
			#ENDIF
		#ENDWHILE
	elif question1 == "n":
		running2 = True
		while running2:
			#get conditional second answer 
			question2 = input("Are there gay cowboys in this movie?")
			if question2 == "y":
				#conclusion 
				print("The movie you're thinking of is Brokeback Mountain!")
				running = False
				running2 = False 
			elif question2 == "n":
				#conclusion 
				print("The movie you're thinking of is Okja!")
				running = False 
				running2 = False 
			else:
				#error msg 
				print("Please enter y for yes and n for no") 
			#ENDIF 
		#ENDWHILE 
	else:
		print("Please enter y for yes or n for no")
	#ENDIF
#ENDWHILE 
#ENDPRGRM
		

