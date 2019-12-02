                                                                    Academic Erp(Module 1.2)
### Objective

Modify all details of the student including Roll_Number, Photograph(Do not save as blob), and Domain(Drop Down Selection), accordingly update all referenced tables.

### Prerequisites

MYSQL
HIBERNATE
JESRSEY
JQUERY
BOOTSTRAP
APACHE TOMCAT SERVER

### Initialising the database

Initialise the Domain table using the following or similar query:

INSERT INTO Domain(discipline, branch, code) VALUES
("M.Tech", "CS", "MTC"),
("M.Tech", "EC", "MTE"),
("iMTech", "CS", "IMTC"),
("iMTech", "EC", "IMTE"),
("MS", "CS", "MSC"),
("MS", "EC", "MSE");

**Data is initialised using test file.

### Running the tests

Edit hibernate.properties file:
			1.Change user name and password of client MYSQL.
			2.Set the path of your tomcat server.
			3.Change upload path in config.properties where you want to store your target files.


-> When you start the server, you will land on "Modify Page".
-> Once the page is opened, modify the details except "e-mail id".
-> Upon clicking on "Modify Button", will be redirected to new page showing modifications made along with other details.
-> Domain is dynamically populated.
-> Table containing details of students is also dynamically populated.
