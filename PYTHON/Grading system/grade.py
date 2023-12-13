# grading problem

import os

def Enter_marks():
    
    stud_temp = input("Enter name of student to enter marks ")
    
    if stud_temp in mark_details.keys():
        print("Student is already present")
    
    else:
        
        Hindi = eval(input("Enter marks of Hindi "))
        Marathi = eval(input("Enter marks of Marathi "))
        Math = eval(input("Enter marks of Math "))
        Science = eval(input("Enter marks of Science "))
        History = eval(input("Enter marks of History "))
    
        mark_details[stud_temp] = {}
        mark_details[stud_temp]["Hindi"] = Hindi
        mark_details[stud_temp]["Marathi"] = Marathi
        mark_details[stud_temp]["Math"] = Math
        mark_details[stud_temp]["Science"] = Science
        mark_details[stud_temp]["History"] = History
    
        print(f"{stud_temp} Marks added Successfully")
        
def Edit_marks():
    
    stud_temp = input("Enter name of student to edit marks ")
    
    if stud_temp in mark_details.keys():
        
        Hindi = eval(input("Enter marks of Hindi "))
        Marathi = eval(input("Enter marks of Marathi "))
        Math = eval(input("Enter marks of Math "))
        Science = eval(input("Enter marks of Science "))
        History = eval(input("Enter marks of History "))
    
        mark_details[stud_temp] = {}
        mark_details[stud_temp]["Hindi"] = Hindi
        mark_details[stud_temp]["Marathi"] = Marathi
        mark_details[stud_temp]["Math"] = Math
        mark_details[stud_temp]["Science"] = Science
        mark_details[stud_temp]["History"] = History
    
        print(f"{stud_temp} Marks edited Successfully")
    
    else:
        
        print(f"{stud_temp} data not found")

def Remove_student():
    
    stud_temp = input("Enter name of student to  remove ")
    
    if stud_temp in mark_details.keys():
        
        del mark_details[stud_temp]
        print(f"{stud_temp} removed successfully")
    
    else:
        
        print(f"{stud_temp} not found")
    
def See_average():
    
    stud_temp = input("Enter name of student to  see average ")
    
    if stud_temp in mark_details.keys():
        
        temp_var = mark_details[stud_temp]
        sum_marks = sum(temp_var.values())
        average = sum_marks / 5
        print(f"Average of {stud_temp} is {average}")
        
    else:
        
        print(f"{stud_temp} data is not available")

count = 3
login_details = {"admin1":"admin@1", "admin2":"admin@2", "admin3":"admin@3", "admin4":"admin@4"}
mark_details = {"student1":{"Hindi":95, "Marathi":90, "Math":85, "Science":90, "History":87}, "student2":{"Hindi":75, "Marathi":60, "Math":85, "Science":80, "History":47}, "student3":{"Hindi":65, "Marathi":80, "Math":65, "Science":50, "History":47}, "student4":{"Hindi":45, "Marathi":60, "Math":45, "Science":80, "History":88}}

while count >= 1:
    
    username1 = input("Enter username ")
    pass1 = input("Enter the Password ")
    
    if (username1 in login_details.keys() and pass1 == login_details.get(username1)):
        
        while True:
    
            print("1.Enter marks\n2.Edit marks\n3.Remove student\n4.See Average\n5.close")
            choice1 = int(input("Choose option for further process "))
        
            if choice1 == 1 :
                Enter_marks()
                
            elif choice1 == 2:
                Edit_marks()
                
            elif choice1 == 3:
                Remove_student()
                
            elif choice1 == 4:
                See_average()
                
            elif choice1 == 5:
                exit()
                
            else:
                os.system('cls')
                continue
            
    else :
        count -= 1
        print(f"{count} attempts remaining")
