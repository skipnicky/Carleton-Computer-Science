#################################
#NAME: Lily Inskip-Shesnicky 
#COURSE: COMP-1405 B2 
#FILE: t3p4.py
#DATE: 2018-09-28
##################################

#get light colour 
light_colour = input("What colour is the light? (g/y/r)")

#check input format for distance 
distanceCheck = True
while distanceCheck == True:
	car_distance =input("What is the distance to the intersection?")
	try:
		car_distance = float(car_distance)
		distanceCheck = False 
	except:
		print("Please enter a valid distance")
	#ENDTRY
#ENDWHILE
		
#check input format for speed 
speedCheck = True 
while speedCheck:
	car_speed = input("What is your speed in m/s?")
	try:
		car_speed = float(car_speed)
		speedCheck = False 
	except:
		print("Please enter a valid speed") 
	#ENDTRY 
#ENDWHILE 

#get time to lights 	
time = car_distance/car_speed

#stop/go if statement 
if light_colour == "g":
	print("Go.")
elif light_colour == "y" and time <= 5:
	print("Go.")
elif light_colour == "r":
	print("Stop.")
else:
	print("Stop.")
#ENDIF 