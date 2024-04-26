from tkinter import *
from PIL import ImageTk,Image
import pandas as pd
import numpy as np
import requests
import json
import pyotp
from requests.exceptions import ConnectionError
from tkinter import messagebox
root=Tk()
root.title("Banking System...")
sizex = 600
sizey = 300
posx  = 100
posy  = 100
def forgot():
    pass
def submit():
    your_user=username.get()
    your_password=password.get()
    print("Username:= ",your_user)
    print("Password:= ",your_password)
    messagebox.showwarning("Sananive Bank..","Login Successfull")

def NewFile():
    pass
def OpenFile():
    pass
def helpmenu():
    pass
def About():
    messagebox.showinfo("About..","Contact us:-180020001818\n\nDevelopers:\nLovejeet Rathore,\nSantosh Mrigwani,\nAniruddha Agrawal.\n\nEmail us:- care@sananive.com")

root.wm_geometry("%dx%d+%d+%d" % (sizex, sizey, posx, posy))
frame1=Frame(root,height=100,width=100,bd=10)
frame1.place(x=120,y=0)
Label(frame1,text="Welcome to Sananive Bank!").grid(row=1,column=1)
im = Image.open("E:/Banking/1.jpg")
resized = im.resize((130, 130), Image.ANTIALIAS)
image=ImageTk.PhotoImage(resized)
myimg=Label(frame1,image=image)
myimg.image=image
myimg.grid(row=2,column=1)
username = StringVar()
password = StringVar()
Label(frame1,text="Username").grid(row=3,column=0)
Label(frame1,text="Password").grid(row=4,column=0)
user=Entry(frame1,textvariable=username)
user.grid(row=3,column=1)
passwords=Entry(frame1,textvariable=password).grid(row=4,column=1)
Button(frame1,text="Forgot Password?",command=forgot).grid(row=5,column=2)
menu = Menu(root)
root.config(menu=menu)
filemenu = Menu(menu)
menu.add_cascade(label="File", menu=filemenu)
filemenu.add_command(label="New", command=NewFile)
filemenu.add_command(label="Open...", command=OpenFile)
filemenu.add_separator()
filemenu.add_command(label="Exit", command=root.destroy)
helpmenu = Menu(menu)
menu.add_cascade(label="Help", menu=helpmenu)
helpmenu.add_command(label="About...", command=About)
submit=Button(frame1,text="Submit",fg="green",command=submit)
submit.grid(row=6,column=1)
Button(frame1,text="Quit",fg="red",command=root.destroy).grid(row=6,column=3)
root.mainloop()