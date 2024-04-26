from tkinter import *
from PIL import ImageTk,Image
import pandas as pd
import numpy as np
import requests
import json
import pyotp
from requests.exceptions import ConnectionError
from tkinter import messagebox
import requests
import json
import pyotp
root=Tk()
root.title("Banking System...")
sizex = 400
sizey = 300
posx  = 100
posy  = 100
def submit():
    your_user=username.get()
    number=password.get()
    print(your_user)
    print(number)

root.wm_geometry("%dx%d+%d+%d" % (sizex, sizey, posx, posy))
frame1=Frame(root,height=100,width=100,bd=10)
frame1.place(x=120,y=0)
Label(frame1,text="Welcome to Forgot Password Protocol..").grid(row=1,column=1)
im = Image.open("E:/Banking/image.png")
resized = im.resize((130, 130), Image.ANTIALIAS)
image=ImageTk.PhotoImage(resized)
myimg=Label(frame1,image=image)
myimg.image=image
myimg.grid(row=2,column=1)
username = StringVar()
password = StringVar()
Label(frame1,text="Enter Bank Id:").grid(row=3,column=0)
Label(frame1,text=" Mobile Number:").grid(row=4,column=0)
user=Entry(frame1,textvariable=username)
user.grid(row=3,column=1)
passwords=Entry(frame1,textvariable=password).grid(row=4,column=1)
submit=Button(frame1,text="Submit",command=submit)
submit.grid(row=5,column=0)
Button(frame1,text="Quit",command=root.destroy).grid(row=5,column=1)
root.mainloop()