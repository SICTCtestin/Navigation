from turtle import *
import turtle
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