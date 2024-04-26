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
def submit():
    result = " "
    global frame1
    a1 = user_names.get()
    b1 = pswds.get()
    connection =  mysql.connector.connect(host="localhost",user="root",passwd="8923",database="Bank")
    sql_select_Query = "select * from adduser WHERE Account_Number="+a1
    cursor = connection.cursor()
    cursor.execute(sql_select_Query)
    record = cursor.fetchone()
    for i in record:
        result = result + str(i) + "\n"
    a = result.split()
    print(a)
    if a[1] == a1 and a[len(a)-1] == b1:
        conn = mysql.connector.connect(host='localhost',database='Bank',user='root',password='8923')
        cursor = conn.cursor()
        Avail_Balance = a[len(a)-2]
        Label(frame1,text="Add Some Money:").grid(row=10,column=0)
        updates=Entry(frame1,textvariable=update)
        updates.grid(row=10,column=1)
        c1 = '0'
        c1 = updates.get()
        print(c1)
        data = int(Avail_Balance)+ int(c1)
        query = """update adduser set Avail_Balance = """+str(data)+""" where Account_Number ="""+a1
        cursor.execute(query)
        conn.commit()
        messagebox.showinfo("Sananive Bank..","Rupees Added Successfully....")
    else:
        messagebox.showwarning("Sananive Bank..","Login Denied")
    cursor.close() 
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
Label(frame1,text="Authenticate user").grid(row=1,column=1)
im = Image.open("E:/Banking/Authenticate.png")
resized = im.resize((250, 150), Image.ANTIALIAS)
image=ImageTk.PhotoImage(resized)
myimg=Label(frame1,image=image)
myimg.image=image
myimg.grid(row=2,column=1)

pswd = StringVar()
user_name = StringVar()
update = StringVar()

Label(frame1,text="Enter Account Number:").grid(row=4,column=0)
user_names=Entry(frame1,textvariable=user_name)
user_names.grid(row=4,column=1)

Label(frame1,text="Enter Password").grid(row=6,column=0)
pswds=Entry(frame1,textvariable=pswd)
pswds.grid(row=6,column=1)

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
