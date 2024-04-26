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
root.title("Sananive Banking..")
sizex = 600
sizey = 400
posx  = 100
posy  = 100   
def submit():
    db = mysql.connector.connect(host="localhost",user="root",passwd="8923",database="Bank")
    mycursor = db.cursor()
    sql = "INSERT INTO adduser(Name,Account_Number,Adhaar_Number,Address,Branch,Avail_Balance) VALUES (%s, %s,%s, %s,%s,%s)"
    db.commit()                                      
    user_names=user_name.get()
    amounts = amount.get()
    ac_number=ac_no.get()
    adhaar_number = adhaar_no.get()
    addresses = address.get()
    branches = branch.get()
    val = (user_names,ac_number,adhaar_number,addresses,branches,amounts)
    mycursor.execute(sql, val)
    db.commit()
    print(mycursor.rowcount, "record inserted.")
    messagebox.showinfo("Sananive Bank..","Done With Details..")

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
Label(frame1,text="User Registration Form..").grid(row=1,column=1)
global im
im = Image.open("E:/Banking/user_registration.png")
resized = im.resize((160, 135), Image.ANTIALIAS)
global image
global myimg
image=ImageTk.PhotoImage(resized)
myimg=Label(frame1,image=image)
myimg.image=image
myimg.grid(row=2,column=1)

user_name = StringVar()
ac_no = StringVar()
adhaar_no = StringVar()
address = StringVar()
branch = StringVar()
amount = StringVar()

Label(frame1,text="User Name").grid(row=4,column=0)
Label(frame1,text="Account No.").grid(row=5,column=0)
Label(frame1,text="Adhaar No.").grid(row=6,column=0)
Label(frame1,text="Address").grid(row=7,column=0)
Label(frame1,text="Branch").grid(row=8,column=0)
Label(frame1,text="Amount").grid(row=9,column=0)

user_name=Entry(frame1,textvariable=user_name)
user_name.grid(row=4,column=1)
account=Entry(frame1,textvariable=ac_no).grid(row=5,column=1)
adhaar=Entry(frame1,textvariable=adhaar_no).grid(row=6,column=1)
addresss=Entry(frame1,textvariable=address).grid(row=7,column=1)
branchs=Entry(frame1,textvariable=branch).grid(row=8,column=1)
amounts=Entry(frame1,textvariable=amount).grid(row=9,column=1)


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
submit.grid(row=20,column=1)
quit = Button(frame1,text="Quit",fg="red",command=root.destroy)
quit.grid(row=20,column=20)
root.mainloop()
