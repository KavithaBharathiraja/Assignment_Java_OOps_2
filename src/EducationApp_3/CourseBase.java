package EducationApp_3;

public abstract class CourseBase {
    private String courseName;
    private String instructor;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    // Abstract method to calculate total revenue from enrolled students
    public abstract int calculateRevenue();

    // Abstract method to display course details
    public abstract void displayDetails();
}
