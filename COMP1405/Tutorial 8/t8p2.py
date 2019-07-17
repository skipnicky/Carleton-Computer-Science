#################################
#NAME: Lily Inskip-Shesnicky
#STUDENT ID: 101115505
#COURSE: COMP-1405 B2
#FILE: t8p2.py
#DATE: 2018-11-11
##################################
morse_code = {
  'A': '.-',
  'B': '-...',
  'C': '-.-.',
  'D': '-..',
  'E': '.',
  'F': '..-.',
  'G': '--.',
  'H': '....',
  'I': '..',
  'J': '.---',
  'K': '-.-',
  'L': '.-..',
  'M': '--',
  'N': '-.',
  'O': '---',
  'P': '.--.',
  'Q': '--.-',
  'R': '.-.',
  'S': '...',
  'T': '-',
  'U': '..-',
  'V': '...-',
  'W': '.--',
  'X': '-..-',
  'Y': '-.--',
  'Z': '--..',

  '0': '-----',
  '1': '.----',
  '2': '..---',
  '3': '...--',
  '4': '....-',
  '5': '.....',
  '6': '-....',
  '7': '--...',
  '8': '---..',
  '9': '----.',

  ' ': '     '
}

#get msg to convert
userStr = input("Enter a message:")
#convert to upper case
userStr = userStr.upper()
#empty morse string
morse = ''
#for each character in the input string
for i in userStr:
    #print out new morse character, replace end = /n with end = " "
    print(morse_code[i],end=" ")

"""
idx = 0
for n in morse:
    if n == "     ":
        pass
    else:
        morse[idx] = n+" "
    idx += 1

for n in morse:
    print(n)
"""
