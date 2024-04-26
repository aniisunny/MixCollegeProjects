import mysql.connector
from tkinter import *
import tkinter as tk
from PIL import ImageTk,Image
from tkinter import messagebox
import tkinter
root=Tk()
root2 = tk.Tk()
root1 = tkinter.Tk()
root1.withdraw()  
frame1=Frame(root,height=110,width=110,bd=10)
root.title("Sananive Banking..")
sizex = 600
sizey = 400
posx  = 100
posy  = 100   
result = " "
def submit():
    global frame1
    a = user_name.get()
    connection =  mysql.connector.connect(host="localhost",user="root",passwd="8923",database="Bank")
    sql_select_Query = "select * from adduser WHERE Account_Number="+a
    cursor = connection.cursor(buffered=True)
    cursor.execute(sql_select_Query)
    record = cursor.fetchone()
    global result
    for i in record:
        result = result + str(i) + "\n"
    a = result.split()
    Label(frame1,text=a[0]).grid(row = 27,column =1)
    Label(frame1,text=a[1]).grid(row = 28,column =1)
    Label(frame1,text=a[2]).grid(row = 29,column =1)
    Label(frame1,text=a[3]).grid(row = 30,column =1)
    Label(frame1,text=a[4]).grid(row = 31,column =1)
    Label(frame1,text=a[5]).grid(row = 32,column =1)    
    Label(frame1,text="Name:").grid(row = 27,column =0)
    Label(frame1,text="Account Number:").grid(row = 28,column =0)
    Label(frame1,text="Adhaar Number:").grid(row = 29,column =0)
    Label(frame1,text="City / Town:").grid(row = 30,column =0)
    Label(frame1,text="Branch:").grid(row = 31,column =0)
    Label(frame1,text="Available Balance:").grid(row = 32,column =0)
    cursor.close()
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
frame1.place(x=120,y=0)
Label(frame1,text="Check Account!!").grid(row=1,column=1)
im = Image.open("E:/Banking/images.jpg")
resized = im.resize((160, 135), Image.ANTIALIAS)
image=ImageTk.PhotoImage(resized)
myimg=Label(frame1,image=image)
myimg.image=image
myimg.grid(row=2,column=1)

user_name = StringVar()

Label(frame1,text="Enter Account Number:").grid(row=4,column=0)

user_name=Entry(frame1,textvariable=user_name)
user_name.grid(row=4,column=1)

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
submit.grid(row=33,column=0)
quit = Button(frame1,text="Quit",fg="red",command=root.destroy)
quit.grid(row=33,column=1)
root.mainloop()
