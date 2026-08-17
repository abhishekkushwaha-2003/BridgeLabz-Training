-- DEPARTMENTS

INSERT INTO department (id, name, description)
VALUES (1, 'IT', 'Information Technology');

INSERT INTO department (id, name, description)
VALUES (2, 'AIML', 'Artificial Intelligence and Machine Learning');

INSERT INTO department (id, name, description)
VALUES (3, 'HR', 'Human Resources');


-- EMPLOYEES

INSERT INTO employee
(id, name, email, phone, salary, department_id)
VALUES
(1, 'Abhishek', 'abhishek@gmail.com', '9876543210', 50000, 1);

INSERT INTO employee
(id, name, email, phone, salary, department_id)
VALUES
(2, 'Rahul', 'rahul@gmail.com', '9876543211', 70000, 1);

INSERT INTO employee
(id, name, email, phone, salary, department_id)
VALUES
(3, 'Amit', 'amit@gmail.com', '9876543212', 40000, 2);

INSERT INTO employee
(id, name, email, phone, salary, department_id)
VALUES
(4, 'Priya', 'priya@gmail.com', '9876543213', 60000, 2);

INSERT INTO employee
(id, name, email, phone, salary, department_id)
VALUES
(5, 'Neha', 'neha@gmail.com', '9876543214', 45000, 3);

INSERT INTO employee
(id, name, email, phone, salary, department_id)
VALUES
(6, 'Abhinav', 'abhinav@gmail.com', '9876543215', 55000, 1);

INSERT INTO employee
(id, name, email, phone, salary, department_id)
VALUES
(7, 'Ankit', 'ankit@gmail.com', '9876543216', 35000, 3);

INSERT INTO employee
(id, name, email, phone, salary, department_id)
VALUES
(8, 'Pooja', 'pooja@gmail.com', '9876543217', 80000, 2);



ALTER TABLE DEPARTMENT ALTER COLUMN ID RESTART WITH 4;

ALTER TABLE EMPLOYEE ALTER COLUMN ID RESTART WITH 9;