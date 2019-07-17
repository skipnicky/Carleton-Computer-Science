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
def check(msg,menuPrint):
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
			if menuPrint == True:
				menu(cdmp,st,vcs,hdld)
			elif menuPrint == False: 
				pass
		#ENDTRY
	#ENDWHILE
			
	#return var as int 
	return(int(var))
#ENDFCN

#menu fcn to make printing easier 
#and avoiding copy and pasting within code 
def menu(d1,d2,d3,d4):	
	print(" ")
	print("----MENU----")
	print("1. ",d1,"($3.50 each)")
	print("2. ",d2,"($2.25 each)") 
	print("3. ",d3,"($4.05 each)")
	print("4. ",d4,"($1.99 each)")
	print("5. No more doughnuts")
	print(" ")

#names 
cdmp = "Chocolate-dipped Maple Puff"
st = "Strawberry Twizzler"
vcs = "Vanilla Chai Strudel" 
hdld = "Honey-drizzled Lemon Dutchie"
#create base doghnut amounts 
cMaple = 0
sTwizz = 0 
vStrud = 0 
hDutch = 0 
#doughnut prices 
cdmpPr = 3.50
stPr = 2.25 
vcsPr = 4.05
hdldPr = 1.99 
#exchange rates 
CAD_to_USD = 0.77
CAD_to_EUR = 0.66

#START OF SHOP 
print("Welcome to Dino's Doughnut Shop!") 
#get user name 
name = input("Please enter your name to begin: ")
#call menu
menu(cdmp,st,vcs,hdld)

#run loop for whole program 
prgrmLoop = True
while prgrmLoop:
	#domain error loop 
	wrong = True 
	while wrong: 
		#get order number with check fcn 
		order = check("Please enter the corresponding number of your order type: ",True)
		#make sure order is within domain 
		if order > 5 or order < 1:
			print("Please enter a selection number between 1 and 4.")
			#call menu
			menu(cdmp,st,vcs,hdld)
		#if order is 5 the user wants to check out 
		elif order == 5:
			#get desired currency 
			print("Currencies avaliable:")
			print("1. CAD")
			print("2. EUR")
			print("3. USD") 
			#use check to make sure proper int entered 
			domain = True
			while domain: 
				cur = check("Please enter the corresponding number of your chosen currency: ",False)
				if cur > 3 or cur < 1:
					print("Please enter a selection from 1 to 3")
				else:
					domain = False 
					wrong = False 
					prgrmLoop = False 
				#ENDIF
			#ENDWHILE
		#add amount to base values 
		else:
			amount = check("How many of these doughnuts would you like?", False)
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
#ENDWHILE
	
#calculate total & set currency type 
subTotal = ((cMaple*cdmpPr)+(sTwizz*stPr)+(vStrud*vcsPr)+(hDutch*hdldPr))
if cur == 1:
	total=subTotal
	usedCurrency = "CAD"
elif cur == 2:
	total = (subTotal*CAD_to_EUR)
	usedCurrency = "EUR"
elif cur == 3:
	total = (subTotal*CAD_to_USD)
	usedCurrency = "US"
#ENDIF

#RECEIPT 	
print("")
print(name," here is your receipt:")
print("---------------------------------------------")
#time of purchase 
print("Time: ",datetime.datetime.now())	
#values of doughnuts to be added to receipt 
#create dictionary of amounts/names 
dict = {cMaple: cdmp, sTwizz: st, vStrud: vcs, hDutch: hdld}
for n in dict.keys():
	#if key is more than 0
	#aka customer ordered that flavour of doughnut
	#print key and value (aka amount and flavour) on receipt 
	if n > 0:
		print(n,dict[n])
	#ENDIF
#ENDFOR

print("---------------------------------------------")
#final cost rounded to two decimal places 
print("Total cost: $%.2f"%total,usedCurrency)
print("Thank you, have a nice day!") 



		
	
	
 