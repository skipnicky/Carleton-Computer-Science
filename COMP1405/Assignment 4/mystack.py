#################################
#NAME: Lily Inskip-Shesnicky
#STUDENT ID: 101115505
#COURSE: COMP-1405 B
#FILE: mystack.py
#DATE: 2018-11-06
##################################

'''
push - adds element on top of stack (list)
Args:
    stack - list data type
    value - element to be added to stack
Returns:
    None
'''
def push(stack, value):
    #add (append) input value to list (stack)
    stack.append(value)

'''
pop - removes value from top of stack
Args:
    stack - list data type
Returns:
    top - the value just removed, that was the last one added to stack
    None
'''
def pop(stack):
    #if length of stack (list) greater than 0
    if len(stack)>0:
        #remove value at end of list (top of stack)
        top = stack.pop()
        #return top
        return(top)
    #otherwise return None
    else:
        return None

'''
isempty - checks if stack is empty
Args:
    stack - list data type
Returns:
    False - if stack is not empty
    True - if stack is empty
'''
def isempty(stack):
    #if length of stack (list) greater than 0
    if len(stack)>0:
        return False
    #otherwise
    else:
        return True

'''
peak - get value from top of stack (without removing it)
Args:
    stack - list data type
Returns:
    top - last value added to stack
    None
'''
def peak(stack):
    #if there are elements in the stack (list)
    if isempty(stack) == False:
        #the top value is the last in the list
        top = stack[-1]
        #return top value
        return(top)
    #otherwise return is None 
    else:
        return None
