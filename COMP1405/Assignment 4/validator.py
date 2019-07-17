#################################
#NAME: Lily Inskip-Shesnicky
#STUDENT ID: 101115505
#COURSE: COMP-1405 B
#FILE: validator.py
#DATE: 2018-11-07
##################################
import mystack

'''
isvalid - uses stack method to check for valid use of paranthesis
Args:
    string - any string type value
Returns:
    True or False
'''
def isvalid(string):
    #set open and closed bracket strings
    openbrackets = '({['
    closebrackets = ']})'
    #create empty stack
    thestack = []
    #set "balance" of stack to True
    balanced = True
    #set initial count to 0
    count = 0
    #while balanced and there are unassesed elements in string
    while balanced and (count < len(string)):
        #get char from string
        char = string[count]
        #if char is (, {, or [
        if char in openbrackets:
            #push (append) onto thestack
            mystack.push(thestack,char)
        #otherwise if char is ], }, or )
        elif char in closebrackets:
            #if stack is empty (aka no open bracket pair)
            if len(thestack) == 0:
                #balance of stack is False
                #there was an open bracket pushed to mystack
                #that was never popped because it had no match
                balanced = False
            #otherwise there are elements in stack
            else:
                #remove last element pushed to stack
                mystack.pop(thestack)
        #add 1 on top of current count value
        count += 1
    #if all brackets were matched then stack
    #will have popped to 0 and fcn will return True
    return balanced and len(thestack) == 0
