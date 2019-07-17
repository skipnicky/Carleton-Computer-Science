#################################
#NAME: Lily Inskip-Shesnicky 
#STUDENT ID: 101115505
#COURSE: COMP-1405 B2 
#FILE: t6p4.py
#DATE: 2018-10-30
##################################
#import module to acces iterator fcns 
import itertools

#fcn to be performed with itertools product 
def subtract(pBuy,pSell):
	"""
	profit = difference between what the stock was sold for 
	and what it was bought for 
	"""
	profit = pSell-pBuy
	return(profit) 

#create empty list to store stock prices 	
mylist = []
#loop for user input 
elements = True 
while elements: 
	#get stock price 
	stock = int(input("Enter a stock price:"))
	#store in list of stocks 
	mylist.append(stock)
	#check if loop is to continue 
	again = input("Enter another stock? (y/n)")
	#if user wants to add more stocks
	if again == "y":
		#go back to beginning of loop 
		continue 
	#if user doesn't want to add more stocks
	elif again == "n":
		#exit while loop by setting to false 
		elements = False 
	else:
		#catch for other input
		continue 
	
#empty list to hold profits 	
profits = []
"""
empty list to hold the two values used to calculate profits 
values stored as tuples: (x,y) 
"""
pairs = []

#for every two values in list
"""
itertools simplifies using nested loops
is equivalent to - 
for x in mylist:
	for y in mylist:
		fcn(x,y)
"""
for pair in itertools.product(mylist, repeat=2):
	#calculate the difference between the two values 
	prop = subtract(*pair) 
	#add profits to list 
	profits.append(prop)
	#add value tuples to list 
	pairs.append(pair) 
	
#set highest to first element 
highest = profits[0]
#counter to keep track of loop iteration 
counter = 0
#for value in profits list 
for i in profits:
	#if value is greater than highest 
	if i > highest:
		#add to counter each time loop runs 
		counter+=1 
		#set highest to new value 
		highest = i
	else:
		#otherwise pass 
		pass

#get pair from list that maps to location of highest product 
bestPair = pairs[counter]
#print values 
print("The highest profit you could have made was $%d \
by buying at $%s, and selling at $%s" % (highest,bestPair[0],bestPair[1]))  		
