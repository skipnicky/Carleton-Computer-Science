#################################
#NAME: Lily Inskip-Shesnicky 
#STUDENT ID: 101115505 
#COURSE: COMP-1405
#FILE: a2p2.py
#DATE: 2018-10-09
##################################
import datetime 

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
	print("1. ",cdmp,"($3.50 each)")
	print("2. ",st,"($2.25 each)") 
	print("3. ",vcs,"($4.05 each)")
	print("4. ",hdld,"($1.99 each)")
	print("5. No more doughnuts")
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
#create base dougnut values 
cMaple = 0
sTwizz = 0 
vStrud = 0 
hDutch = 0 

#START OF SHOP 
print("Welcome to Dino's Doughnut Shop!") 
#get user name 
name = input("Please enter your name to begin: ")
menu(cdmp,st,vcs,hdld)
	
#run loop for whole program 
prgrmLoop = True
while prgrmLoop:
	#domain error loop 
	wrong = True 
	while wrong: 
		#get order number with check fcn 
		order = check("Please enter the corresponding number of your order type: ")
		#make sure order is within domain 
		if order > 5 or order < 1:
			print("Please enter a selection number between 1 and 4.")
			menu(cdmp,st,vcs,hdld)
		#if order is 5 the user is quitting shop 
		elif order == 5:
			wrong = False
			prgrmLoop = False 
		#add amount to base values 
		else:
			amount = check("How many of these doughnuts would you like?")
			if order == 1: 
				cMaple += amount 
			elif order == 2:
				sTwizz += amount 
			elif order == 3:
				vStrud += amount 
			elif order == 4: 
				hDutch += amount 
			#ENDIF
		#ENDIF
	#ENDWHILE

#calculate total 
totalCost = (cMaple*cdmpPr)+(sTwizz*stPr)+\
(vStrud*vcsPr)+(hDutch*hdldPr)
#RECEIPT 				
print("")
print(name," here is your receipt:")
print("---------------------------------------------")
#time of purchase 
print("Time: ",datetime.datetime.now())
	
#values of doughnuts to be added to receipt 
#create dictionary of amounts/names 
dict = {cMaple: cdmp, sTwizz: st, vStrud: vcs, hDutch: hdld}
#iterate through keys in dictionary
for n in dict.keys():
	#if key is more than 0
	#aka customer ordered that flavour of doughnut
	#print key and value (aka amount and flavour) on receipt 
	if n > 0:
		print(n,dict[n])
	#ENDIF
#ENDFOR
	
#total amount 
print("---------------------------------------------")
print("Total cost: $%.2f" % totalCost)
print("Thank you, have a nice day!") 



		
	
	
 