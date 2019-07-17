#################################
#NAME: Lily Inskip-Shesnicky
#STUDENT ID: 101115505
#COURSE: COMP-1405 B2
#FILE: t4p3.py
#DATE: 2018-10-29
##################################
global X, sensorData

#fcn that takes single int as perameter and adds to sensor data
def measure(int):
	#add new element
	sensorData.append(int)
	#if list length greater than allowed length
	while len(sensorData)>(X):
		#pop first element until ideal length
		sensorData.pop(0)

#fcn to calculate average of sensor data
def average():
	#set total sum to 0
	sum = 0
	#for element in sensorData list
	for i in sensorData:
		#add element to total sum
		sum +=i
	#average is sum of elements divided by number of elements
	av = sum/len(sensorData)
	#return the average
	return(av)

#fcn to calculate minimum sensor data element
def min():
	#set lowest value as first element
	lowest = sensorData[0]
	#for element in sensorData list
	for i in sensorData:
		#if element is lower than last set lowest value
		if i < lowest:
			#set element as new lowest value
			lowest = i
		else:
			pass
	#return lowest value
	return(lowest)

#fcn to calculate maximum sensor data element
def max():
	#set highest value as first element
	highest = sensorData[0]
	#for element in sensorData list
	for i in sensorData:
		#if element is higher than last set highest value
		if i > highest:
			#set element as new highest value
			highest = i
		else:
			pass
	#return highest value
	return(highest)

#fcn to check difference between data elements
def isdanger():
	#get max and min values of data
	maximum = max()
	minimum = min()
	#if absolute difference between any of the data greater than 10
	if abs(maximum-minimum) > 10:
		return True
	else:
		pass

#constant variables
X = 6
sensorData = [10,1,3,4,2,4,6,7,4]
#call fcns and print data
measure(10)
print(sensorData)
#make average rounded
print('%.2f'%average())
print(max())
print(min())
#only print isdanger if it's true
if isdanger() == True:
	print(isdanger())
else:
	pass
