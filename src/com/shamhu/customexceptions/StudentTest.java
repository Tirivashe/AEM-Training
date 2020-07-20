package com.shamhu.customexceptions;

class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message);
    }
}

class Student {
    public Student find(String studentID) throws StudentNotFoundException {
        if (studentID.equals("123456")) {
            return new Student();
        } else {
            throw new StudentNotFoundException(
                "Could not find student with ID " + studentID);
        }
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student manager = new Student();
 
        try {
 
            Student student = manager.find("123456");
            System.out.println("Student found");
 
        } catch (StudentNotFoundException ex) {
            System.err.print(ex);
        }
    }
}
