###############################################
#NAME: Lily Inskip-Shesnicky
#COURSE: COMP 1405
#FILE: a1q3.py
#DESCRIPTION:
#	A drawing made with the simple graphics library 
###############################################

#import 
from SimpleGraphics import *

#set background 
background(67,126,140)

# log
setColor(109, 54, 13)
rect(220,400,350,180)
# torso 
setFill(126, 163, 45)
setOutline(80,104,28)
ellipse(295,200,190,270)
# upper leg one
setFill(126, 163, 45)
setOutline(80,104,28)
ellipse(265,325,70,140)
# lower leg one
setFill(126, 163, 45)
setOutline(80,104,28)
ellipse(250,380,50,100)
# upper leg two
setFill(126, 163, 45)
setOutline(80,104,28)
ellipse(455,325,70,140)
# lower leg two
setFill(126, 163, 45)
setOutline(80,104,28)
ellipse(490,380,50,100)
# arm one
setFill(126, 163, 45)
setOutline(80,104,28)
rect(342,300,30,180)
# arm two
setFill(126, 163, 45)
setOutline(80,104,28)
rect(415,300,30,180)
# head
setFill(126, 163, 45)
setOutline(80,104,28)
ellipse(254,100,265,150)
# eye one 
setFill(126, 163, 45)
setOutline(80,104,28)
ellipse(286,82,60,60)
# eye two
setFill(126, 163, 45)
setOutline(80,104,28)
ellipse(435,82,60,60)
# pupil one
setColor(33,39,3)
ellipse(305,87,20,50)
# pupil two
setColor(33,39,3)
ellipse(454,87,20,50)
# nostril one
setColor(33,39,3)
polygon(342,159,335,170,350,170)
# nostril two
setColor(33,39,3)
polygon(420,159,413,170,427,170)
# smile
arc(300,160,170,50,170,200)
# left toes
setWidth(4)
setColor(31, 104, 26)
line(293,460,250,500)
line(293,460,300,510)
line(293,460,340,500)
# right toes
line(490,460,455,490)
line(490,460,500,500)
line(490,460,550,490)
# fingers one
line(425,480,400,500)
line(425,480,420,510)
line(425,480,440,500)
# fingers two
line(355,480,340,500)
line(355,480,380,510)
line(355,480,400,500)
# text
setColor(255,183,200)
text(200,100,"Tarryn the frog!")
setColor(0,0,0)
text(670,500,"by Lily Inskip-Shesnicky")









