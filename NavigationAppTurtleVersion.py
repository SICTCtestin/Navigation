# import package
import turtle
<<<<<<< HEAD
def lookUp():
    navigator.setheading(90)
def lookDown():
    navigator.setheading(270)
def lookRight():
    navigator.setheading(0)
def lookLeft():
    navigator.setheading(180)
def go():
    navigator.forward(20)

navigator=turtle.Turtle()
navigator.shape("circle")
wn=turtle.Screen()

wn.onkeypress(lookUp,"Up")
wn.onkeypress(lookDown,"Down")
wn.onkeypress(lookLeft,"Left")
wn.onkeypress(lookRight,"Right")
wn.onkeypress(go,"g")
wn.listen()

wn.mainloop()
=======
from PIL import Image
import os
from os import path

# image = "C:\Users\padawan\Documents\Navigation\imagesNav\SICTC.jpg"

currentDir = os.abspath(path.curdir) #get the python file location

wn = turtle.Screen()
wn.setup(width=700,height=400)
wn.title("image test")

wn.addshape(currentDir+"\\Resources\\SICTC.gif") #u can make images in a new folder

myImage = turtle.Turtle()
myImage.speed(0) #so it will draw the image instantly
myImage.shape(currentDir+"\\Resources\\SICTC.gif") #give your object the image
myImage.penup() #if you dont do this, it will draw a line
myImage.goto(0,0) #give your image a location

while True:
  wn.update() #update your window

# open method used to open different extension image file
# im = Image.open("imagesNav/SICTC.jpg") 
  
# # This method will show image in any image viewer 
# im.show() 

# img = Image.open("imagesNav/SICTC.jpg")
# def main():
#     try:
#     except IOError:
#         pass
# main()
# check background image
# print(turtle.bgpic())
>>>>>>> 9c70599e0941e7a9a95305fc91b18c762dd7398c
