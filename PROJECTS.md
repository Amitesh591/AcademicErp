# Academic ERP

## 1) Student

### 1.1 Student Admission
Ask for student details including photograph(do not save as blob), and the domain(Drop Down Selection) like iM.Tech CSE, M.Tech ECE etc. On the basis of the above selection assign unique roll number based on pattern like (IMT20xxxxx, MS20xxxxx).

### 1.2 Student Details Modify
Modify all details of the student including roll number, photograph(do not save as blob) and domain (Drop Down Selection), accordingly update all referenced tables.

### 1.3 Student Course Selection
Display a list of courses including their professor, and prerequisites (if any). Allow a student to select a minimum 4 and maximum 6 courses. Only allow selection of a course if it's prerequisite has already been selected.

### 1.4 Student TimeTable
Display the timetable of a student on the basis of the courses that particular student has selected. Also display the Course Details including the Faculty, Room Number and Specialization.


## 2) Course

### 2.1 Course Specialisation CRUD
Allow the employee of admin department to create, read, update and delete course specialisation(Theory & Systems, Data Science etc). On selecting a specialisation display all the courses registered under it.

### 2.2 Course Creation
Allow the employee of admin department to login. Then ask for the course details including credits, capacity,  schedule, specialisation(Drop Down Selection) and pre-requisites(selection from already existing courses).

### 2.3 Course Update/Delete
Allow the employee of admin department to login. Display the list of courses and allow the user to update/ delete a course. If a pre-requisite course is updated/deleted then the update should cascade throughout

### 2.4 Course TA Registration
Ask the faculty to login and allow him to register a student as a TA and then allocate him to a particular course among the courses(Drop Down Selection) that the faculty teaches.

### 2.5 Course TimeTable
Display the timetable of the selected domain(MTech CSE, IMTech ECE, etc). Also display the faculty associated with every course. On selection of a particular course display the list of enrolled students


## 3) Faculty

### 3.1 Faculty Registration
Ask for faculty details including photograph(do not save as blob), and the courses which they would teach(Drop Down Selection). Also while selecting courses do not allow selection of 2 courses if they have the same time slot. Assign a unique employee id.

### 3.2 Faculty Details Modify
Modify all details of the faculty including employee id, photograph(do not save as blob) and courses (Drop Down Selection), accordingly update all referenced tables.

### 3.3 Faculty Grade Students
Ask the faculty to login and then allow him to select a course among all the courses he teaches. Display all students enrolled in that course. Allow the faculty to grade a particular student or a group of students with marks.

### 3.4 Faculty Display TimeTable
Ask the faculty to login and then display his timetable for all the courses(including specialization and room number) he teaches. If a faculty selects a particular course, then display all the students enrolled for that course.

### 3.5 Faculty View Salary History
Ask the faculty to login and then display the salary, the history of salary disbursements, also allow them to download the salary slip of a particular month.


## 4) Human Resources

### 4.1 Department CRUD
Create, read, update and delete departments such as admin, accounts, etc. in the university. While creating a department include capacity. On selection of a particular department display all the employees.

### 4.2 Employee CRUD
During registration ask for employee details including photograph(do not save as blob), and the department(Drop Down Selection), also check for department capacity. Assign a unique employee id. Allow modification of all details including employee id, photograph and department. 

### 4.3 Employee View Salary History
Ask the employee to login and then display the salary, the history of salary disbursements, also allow them to download the salary slip of a particular month. 

### 4.4 Employee Disburse Salary
Allow an employee of accounts department to login and modify salary details, also allow them to disburse the salary of a single employee or a selection of employees except the logged in employee.


## 5) Admin

### 5.1 Student Domain CRUD
Allow the employee of admin department to login and add and modify domain(MTech CSE, IMTech ECE, etc). The details include the name of the domain, capacity and qualification required. Also allow him to view students belonging to a particular domain.  

### 5.2 Compute Student Specialisation
Allow the employee of admin department to login. Then view the specialisations of all students or filtered by various criteria such as domain, specialisation, etc. The student has a specialisation in a particular domain if they have selected courses such that the cumulative sum in a certain specialisation of those courses is greater than 20 credits.


## 6) Accounts

### 6.1 Student Fee Payment
Allow the student to login to the portal and display the students bills which are due. Every student may have a different bill amount or even multiple bills. Allow the student to pay the bill in multiple instalments and track all of them towards the total payment.

### 6.2 CRUD Fee Details
Allow the employee of accounts department to login and create, read, update and delete fee details of a student. That included adding fee to student separately as well as to a certain domain (it would be added to all students of that particular domain).

### 6.3 Student View Bill History
Allow student to login and view the due bill and all the previously paid bills. When the student paid the bills in multiple instalments all separate payments as well as the total must be visible. Also give an option to download the fee receipt.

### 6.4 Faculty Disburse Salary
Allow an employee of accounts department to login and modify salary details, also allow them to disburse the salary of a single faculty or a selection of faculties.


## 7) Hostel

### 7.1 Student Hostel Room Allocation
Allow the employee of estate to login and view all rooms. The list of rooms should display to whom the room is allocated or if it's available. The available rooms can be allocated to a particular student, or a present allocation may be modified. Allow the filtration of rooms by various criteria such as availability, floor etc.

### 7.2 Student Room Swapping Application Portal
Allow a student to login then request for a room exchange from another student. The other student on login must receive this request along with an option of accept or reject the request. If the request is accepted swap the room details and cascade accordingly.


## 8) Alumni & Placement

### 8.1 Organisation Registration
Allow the employee of outreach department to login. Then register a new organisation along with its HR contact details, address etc. Also provide the functionality of viewing, searching, modifying and deleting the details. 

### 8.2 Alumni Registration
Allow the alumni registration via searching for graduation year and name of alumni. Also add further details such as contact information, further educational qualifications and all organisations(Drop Down Select) worked/working for along with positions.

### 8.3 Alumni Details Update
Allow alumni to login and update their details such as contact information, educational qualification and add/update/delete organisations(Drop Down Select) worked/working for.

### 8.4 Placement Add Offer
Allow the employee of outreach department to login and create a new offer by providing information such as organisation, domains(MTech CSE, iMTech ECE), specialisations(Theory & Systems, Data Science), minimum grade and maximum intake. For all constrains give an option to select multiple or no options (eg:- organisation has no minimum grade criteria or accepts multiple domains). 

### 8.5 Placement Student Application
Allow a student to login and view all offers for which they are eligible by checking their domain, specialisation and computing their grade for all courses till that date. Ask the student to upload their CV for application also store other information automatically such as grade and other personal details.

### 8.6 Placement Student Selection
Allow the employee of outreach department to login and view details of all organisation offers along with all students who are eligible and those who have applied. Give an interface to filter students on the basis of grade, specialisation, domain etc and select a student for a particular offer.

### 8.7 Placement History
Allow the employee of outreach department to login and view the history of all placed/unplaced students. Give an interface to filter the details according to organisation, year, domain etc. On selection of a certain organisation show all placement history along with Alumni presently working there.