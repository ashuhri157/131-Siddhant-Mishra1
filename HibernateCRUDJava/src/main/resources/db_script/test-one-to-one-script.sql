CREATE TABLE employee
   (	 
	ID INT PRIMARY KEY AUTO_INCREMENT, 
	EMAIL VARCHAR(100 ), 
	FIRST_NAME VARCHAR(100 ), 
	LAST_NAME VARCHAR(100 )
   );
   
   
   CREATE TABLE ACCOUNT
   (	 
	ID INT PRIMARY KEY AUTO_INCREMENT, 
	ACC_NUMBER VARCHAR(100 )
   );
   
   
   CREATE TABLE employee_acccount
   (	 
	EMPLOYEE_ID INT PRIMARY KEY AUTO_INCREMENT, 
	ACCOUNT_ID INT NOT NULL
   );
   
   SELECT * FROM employee;
   SELECT * FROM ACCOUNT;
   SELECT * FROM employee_acccount;
   
   DROP TABLE employee;
   DROP TABLE ACCOUNT;
   DROP TABLE employee_acccount;
   
   