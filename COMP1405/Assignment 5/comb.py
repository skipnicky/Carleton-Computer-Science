#################################
#NAME: Lily Inskip-Shesnicky
#STUDENT ID: 101115505
#COURSE: COMP-1405 B2
#FILE: count.py
#DATE: 2018-11-30
##################################

"""
distance - calculates Euclidian distance of two points to origin
Args:
	x - x value of point
    y - y value of point
Returns:
	d - Euclidian distance to origin
"""
def distance(x,y):
    #euclidian distance = sqrt(x^2+y^2)
    d = ((x**2)+(y**2))**(1/2)
    return(d)

"""
combsort - modifies 2D array based on points Euclidian distance to origin
Args:
	list - list given to fcn to sort
Returns:
	None
"""
def combsort(list):
    #---INITIAL VALUES---
    #set gap to length of list
    gap = len(list)
    #set shrink factor to 1.3
    # --> "has been suggested as an ideal shrink factor
    #     after empirical testing on over 200,000 random lists" - Wiki
    shrink = 1.3
    #set sorted to False
    sorted = False

    #run loop as long as sorted is False
    while sorted == False:
        #floor gap by shrink factor
        gap = int(gap//shrink)

        #if gap is greater than 1
        if gap > 1:
            #sorted remains False
            sorted = False
        #otherwise gap is 1 therefor sorted is true
        else:
            gap = 1
            sorted = True

        #set i to 0
        i = 0
        while i + gap < len(list):
            #compare distance between points on either side of the gap
            frstDistance = distance(list[i][0], list[i][1])
            scndDistance = distance(list[i+gap][0], list[i+gap][1])
            #if distance at start of gap greater than distance at end of gap
            if frstDistance > scndDistance:
                #swap values
                list[i], list[i+gap] = list[i+gap],list[i]
                #sorted remains False
                sorted = False
            #incrase i by 1
            i += 1
