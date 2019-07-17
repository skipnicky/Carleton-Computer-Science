#################################
#NAME: Lily Inskip-Shesnicky
#STUDENT ID: 101115505
#COURSE: COMP-1405 B2
#FILE: t10p1.py
#DATE: 2018-11-26
##################################

#multiply by recursively adding int1 int2 times
def multiply(int1, int2):
    #0 multiplied by anything is 0
    if int2 == 0:
        return 0

    #if int2 is greater than 0 add int1 to self until int2 = 0
    if int2 > 0:
        return(int1 + multiply(int1, int2-1))

    #if int2 less than 0 set
    if int2 < 0:
        return -multiply(int1, -int2)

running = True
while running:
    num1 = int(input("Enter first number:"))
    num2 = int(input("Enter second number:"))
    print("Result:",multiply(num1,num2))
    again = input("Again? (y/n)")
    if again == "y":
        pass
    else:
        running = False
