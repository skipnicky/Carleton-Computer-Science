def addend(list, value):
	list.append(value)

def removestart(list):
	if len(list) == 0:
		return None

	return list.pop(0)

def containslinear(list, value):
	return(value in list)

def containshash(dict, value):
	newDict = dict(enumerate(list))
	if value in dict.values()):
		return True
