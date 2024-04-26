import mysql.connector
from tkinter import *
from PIL import ImageTk,Image
import pandas as pd
import numpy as np
from tkinter import messagebox
import tkinter
root=Tk()
root1 = tkinter.Tk()
root1.withdraw()
user_name = StringVar()
root.title("Sananive Banking..")
sizex = 600
sizey = 400
posx  = 100
posy  = 100   
def submit():
	pass
def close():
    #User_detail.user_info()
    pass
def user_detail():
    root.wm_geometry("%dx%d+%d+%d" % (600, 400, 100, 100))
    Label(frame2,text="Check Account!!").grid(row=1,column=1)
    im = Image.open("E:/Banking/images.jpg")
    resized = im.resize((160, 135), Image.ANTIALIAS)
    image=ImageTk.PhotoImage(resized)   
    myimg=Label(frame2,image=image)
    myimg.image=image
    myimg.grid(row=2,column=1)

    user_name = StringVar()

    Label(frame2,text="Enter Account Number:").grid(row=4,column=0)

    user_name=Entry(frame2,textvariable=user_name)
    user_name.grid(row=4,column=1)

    submit=Button(frame2,text="Submit",fg="green",command=user_detail)
    submit.grid(row=33,column=0)
    quit = Button(frame2,text="Quit",fg="red",command=root.destroy)
    quit.grid(row=33,column=1)

    a = user_name.get()
    print(a)
    connection =  mysql.connector.connect(host="localhost",user="root",passwd="8923",database="Bank")
    Query = 'select * from adduser where Account_Number ='+a
    cursor = connection.cursor()
    """cursor.execute(Query)
    record = cursor.fetchone()
    global result
    for i in record:
        result = result + str(i) + "\n"
    a = result.split()
    Label(frame2,text=a[0]).grid(row = 27,column =1)
    Label(frame2,text=a[1]).grid(row = 28,column =1)
    Label(frame2,text=a[2]).grid(row = 29,column =1)
    Label(frame2,text=a[3]).grid(row = 30,column =1)
    Label(frame2,text=a[4]).grid(row = 31,column =1)
    Label(frame2,text=a[5]).grid(row = 32,column =1)    
    Label(frame2,text="Name:").grid(row = 27,column =0)
    Label(frame2,text="Account Number:").grid(row = 28,column =0)
    Label(frame2,text="Adhaar Number:").grid(row = 29,column =0)
    Label(frame2,text="City / Town:").grid(row = 30,column =0)
    Label(frame2,text="Branch:").grid(row = 31,column =0)
    Label(frame2,text="Available Balance:").grid(row = 32,column =0)
    cursor.close()"""
    messagebox.showinfo("Sananive Bank..","Account Number Exist")

def NewFile():
    pass
def OpenFile():
    pass
def helpmenu():
    pass
def About():
    pass
root.wm_geometry("%dx%d+%d+%d" % (sizex, sizey, posx, posy))
frame1=Frame(root,height=110,width=110,bd=10)
frame1.place(x=120,y=0)

frame2=Frame(tkinter.Toplevel(root),height=110,width=110,bd=10)
frame2.place(x=120,y=0)

Label(frame1,text="Admin Access").grid(row=1,column=1)
im = Image.open("E:/Banking/abcd.png")
resized = im.resize((180, 200), Image.ANTIALIAS)
image=ImageTk.PhotoImage(resized)
myimg=Label(frame1,image=image)
myimg.image=image
myimg.grid(row=2,column=1)

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
existing = Button(frame1,text="Existing Customer Detail",command=user_detail).grid(row=10,column=0)
openac = Button(frame1,text="Open Account",command=root.destroy).grid(row=10,column=2)
close = Button(frame1,text="Close Account",command= close).grid(row=20,column=0)
Fund_Transfer = Button(frame1,text="Fund Transfer",command= close).grid(row=20,column=2)
quit = Button(frame1,text="Quit",command=root.destroy).grid(row=30,column=5)


root.mainloop()
