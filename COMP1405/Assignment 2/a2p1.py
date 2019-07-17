#################################
#NAME: Lily Inskip-Shesnicky 
#STUDENT ID: 101115505 
#COURSE: COMP-1405
#FILE: a2p1.py
#DATE: 2018-10-09
##################################
import datetime 

def receipt(user,quant,name,price):
	print(user," here is your receipt:")
	print("------------------------------------------")
	#time of purchase 
	print("Time: ",datetime.datetime.now())	
	print("Order: ",amount,name)
	print("Total cost: $%.2f" %(price*amount))
	print("------------------------------------------")
	print("Thank you, have a nice day!") 
	
#integer value check function 
#perameter: input collection msg to be displayed 
def check(msg):
	#error while loop 
	checking = True
	while checking: 
		#get var 
		var = input(msg)
		#try except for correct input 
		try:
			var = int(var)
			#if correct input end loop
			checking = False 
		except:
			print("Please enter a valid integer") 
			menu(cdmp,st,vcs,hdld)
	#return var as int 
	return(int(var))

def menu(d1,d2,d3,d4):
	print(" ")
	print("----MENU----")
	print("1. ",d1,"($3.50 each)")
	print("2. ",d2,"($2.25 each)") 
	print("3. ",d3,"($4.05 each)")
	print("4. ",d4,"($1.99 each)")
	print(" ")
#NAMES 
cdmp = "Chocolate-dipped Maple Puff"
st = "Strawberry Twizzler"
vcs = "Vanilla Chai Strudel" 
hdld = "Honey-drizzled Lemon Dutchie"
#ITEM COSTS 
cdmpPr = 3.50
stPr = 2.25 
vcsPr = 4.05
hdldPr = 1.99 

#START OF SHOP 
print("Welcome to Dino's Doughnut Shop!") 
#get user name 
userName = input("Please enter your name to begin: ")
menu(cdmp,st,vcs,hdld)

#domain error loop 
wrong = True 
while wrong: 
	#get order number with check fcn 
	order = check("Please enter the corresponding number of your order type: ")
	#make sure order is within domain 
	if order > 4 or order < 1:
		 print("Please enter a selection number between 1 and 4.")
		 menu(cdmp,st,vcs,hdld)
	else:
		wrong = False

#get amount of order 		
amount = check("How many of these doughnuts would you like?")

print("")
type = True
while type:
	#for each type of doughnut will calculate receipt 
	if order == 1: 
		receipt(userName,amount,cdmp,cdmpPr)
		type = False 
	elif order == 2:
		receipt(userName,amount,st,stPr)
		type = False 
	elif order == 3:
		receipt(userName,amount,vcs,vcsPr)
		type = False 
	elif order == 4: 
		receipt(userName,amount,hdld,hdldPr) 
		type = False 
		

		
	
	
 