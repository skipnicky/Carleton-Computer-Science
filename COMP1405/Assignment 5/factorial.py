#################################
#NAME: Lily Inskip-Shesnicky
#STUDENT ID: 101115505
#COURSE: COMP-1405 B
#FILE: factorial.py
#DATE: 2018-11-29
##################################

"""
cachedfactorial - recursive factorials calculator
Args:
	int - factorial to be calculated
	dict - cache that stores factorials in dictionary form
Returns:
	cache[int] - value of factorial stored at int key
"""
def cachedfactorial(int, dict):
    if int == 0: #base case
        return(1) #factorial of 0 is 1
    elif int < 0:
        #cannot calculate negative factorials
        return(None)
    #if int! not yet been computed (aka in cache)
    elif int not in cache:
        #set new key/value pair as int!: *= int-1
        #if int is in cache, will multiply that
        #instead of going through every other number
        #Example: if cache has up to 5!, and input is 6
        #will calculate (6*6)* 5!
        cache[int] = int * cachedfactorial(int-1, cache)
    #return the value (aka int!) at int
    return(cache[int])
