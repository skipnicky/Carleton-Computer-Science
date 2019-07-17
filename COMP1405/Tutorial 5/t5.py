#################################
#NAME: Lily Inskip-Shesnicky 
#STUDENT ID: 101115505
#COURSE: COMP-1405 B2 
#FILE: t5.py
#DATE: 
##################################
import math, random 

#exit function to loop game 
def exit(score):
	again = True
	while again:
		#ask if they want to play again 
		userAgain = input("Do you want to guess again? (y/n)")
		if userAgain == "y":
			#if yes, print score, keep running game 
			print("You've been correct",score,"times so far")
			return True 
			again = False 
		#if no, print score, keep running game 
		elif userAgain == "n":
			print("Your final score was",score)
			return False 
			again = False 
		else:
			#error loop 
			print("Please enter y for yes or n for no") 
			
def check(msg,type):
	#error while loop 
	checking = True
	while checking: 
		#get var 
		var = input(msg)
		#try except for correct input 
		try:
			var = type(var)
			#if correct input end loop
			checking = False 
		except:
			print("Please enter a valid integer") 
	#return var as int 
	return(type(var))

#PROBLEM 1 	
def pow2(num):
	ans = 2 ** int(math.log(num,2))
	return(ans)

#PROBLEM 2
def decToBin(decNum):
	#highest base 2 below the number 
	cmp1 = pow2(decNum)
	#output to be updated with bits 
	cvnBin = ""
	#while base 2 is greater than 0 ... 
	while cmp1 > 0:
		#if it is less than or = the num 
		if cmp1 <= decNum:
			#subtract base 2 num from decNum 
			decNum-=cmp1
			#add 1 to output 
			cvnBin += "1"
		else:
			#add 0 to output 
			cvnBin += "0"
		#use right shift operator 
		cmp1 >>=1 
	#get final binary output 
	return(str(cvnBin))
				
#PROBLEM 3	
def userBin(num):
	nonBinary = True
	while nonBinary: 
		print("The number is: ",num)
		#get user guess 
		guess = input("What do you think it is in binary?")
		try:
			#try if user guess can convert from binary to decimal  
			userGuess = int(guess,2)
			nonBinary = False 
		except ValueError:
			#otherwise error message 
			print ("Please enter a proper binary number composed of 0 and 1.")
		else:
			break 
	#return user guess 
	return(str(guess))
	
def main(): 
	#set base user score 
	userScore = 0
	
	gameLoop = True
	while gameLoop:
		#generate random number 
		randNum = random.randint(0,256)
		#get answer to conversion 
		answer = decToBin(randNum) 
		#get user guess 
		guess = userBin(randNum)
		#if user guess correctly 
		if guess == answer:	
			#update score 
			print("you got it!") 
			userScore += 1
		else: 
			#tell them correct answer 
			print("Sorry, the answer was:",answer)
			gameLoop = exit(userScore) 

#run main program 			
if __name__ == "__main__":
	main()