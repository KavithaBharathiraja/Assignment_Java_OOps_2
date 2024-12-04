package EducationApp_3;

import java.util.ArrayList;
import java.util.Collections;

public class Education_Main {

    public static void main(String[] args) {

        // Polymorphism: Using the base class reference for derived class objects
        ArrayList<Education> courses = new ArrayList<>();


        Education course1 = new Education();
        course1.setCourseName("Java");
        course1.setInstructor("John");
        course1.setCategory("Programming");
        course1.setDifficulty("Beginner");
        course1.setDuration(30);
        course1.setEnrolledStudents(500);
        course1.setOldStudents(300);
        course1.setNewStudents(200);
        course1.setPrice(100);
        course1.setRating(5);

        Education course2 = new Education();
        course2.setCourseName("Python");
        course2.setInstructor("Jana");
        course2.setCategory("Programming");
        course2.setDifficulty("Beginner");
        course2.setDuration(40);
        course2.setEnrolledStudents(600);
        course2.setOldStudents(450);
        course2.setNewStudents(150);
        course2.setPrice(150);
        course2.setRating(4);

        Education course3 = new Education();
        course3.setCourseName("JavaScript");
        course3.setInstructor("Ana");
        course3.setCategory("Programming");
        course3.setDifficulty("Beginner");
        course3.setDuration(50);
        course3.setEnrolledStudents(700);
        course3.setOldStudents(400);
        course3.setNewStudents(300);
        course3.setPrice(120);
        course3.setRating(5);

        // Adding courses to the list
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);

        // Displaying details before sorting
        System.out.println("Courses before sorting:");
        for (CourseBase course : courses) {
            course.displayDetails();
            System.out.println("--------------------");
        }

        // Sorting courses based on new students and enrolled students
        Collections.sort((ArrayList<Education>) courses);

        // Displaying details after sorting
        System.out.println("Courses after sorting:");
        for (CourseBase course : courses) {
            course.displayDetails();
            System.out.println("--------------------");
        }
    }
}
