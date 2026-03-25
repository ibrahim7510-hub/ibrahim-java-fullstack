DROP DATABASE IF EXISTS college;
CREATE DATABASE college;
USE college;

CREATE TABLE students (
    reg_no INT PRIMARY KEY,
    name VARCHAR(50),
    gender ENUM('Male','Female','Other'),
    email VARCHAR(50),
    dob DATE
);

CREATE TABLE courses (
    course_id INT PRIMARY KEY,
    course_name VARCHAR(50)
);

CREATE TABLE enrollments (
    reg_no INT,
    course_id INT,
    PRIMARY KEY (reg_no, course_id),
    FOREIGN KEY (reg_no) REFERENCES students(reg_no),
    FOREIGN KEY (course_id) REFERENCES courses(course_id)
);
INSERT INTO students VALUES 
(101, 'Ibrahim', 'Male', 'ibrahim@gmail.com', '2004-05-10'),
(102, 'Rahul', 'Male', 'rahul@gmail.com', '2003-03-15');

INSERT INTO courses VALUES 
(1, 'Python'),
(2, 'Java');

INSERT INTO enrollments VALUES 
(101, 1),
(102, 2);
SELECT * FROM students;
